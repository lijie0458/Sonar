package com.dogfood.aa20240808.web.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.dogfood.aa20240808.config.Constants;
import com.dogfood.aa20240808.config.LcpProperties;
import com.dogfood.aa20240808.context.UserContext;
import com.dogfood.aa20240808.domain.enumeration.ErrorCodeEnum;
import com.dogfood.aa20240808.service.system.UserServiceFactory;
import com.dogfood.aa20240808.util.FileUploadUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.core.annotation.Order;
import javax.servlet.annotation.WebFilter;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.util.StringUtils;
import org.springframework.util.CollectionUtils;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

@Order(1)
@WebFilter(filterName = "authFilter", urlPatterns = {"/api/*","/upload/*"})
@ConditionalOnProperty(value = "lcp.authCenter.enable", havingValue = "true")
public class AuthFilter implements Filter {
    private final Logger log = LoggerFactory.getLogger(AuthFilter.class);
    private ObjectMapper objectMapper = new ObjectMapper();
    private List<Pattern> patterns = new ArrayList<>();
    @Resource
    private MessageSource messageSource;
    @Resource
    private UserServiceFactory userServiceFactory;
    /**
     * 上传接口是否需要强制鉴权
     */
    @Value("${custom.upload_apiAuthFlag:false}")
    private Boolean uploadApiAuthFlag;
    @Resource
    private LcpProperties lcpProperties;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        noAuthPaths2Pattern(lcpProperties.getAuthCenter().getNoAuthPaths());
        log.info("initialize auth filter success");
    }

    private void noAuthPaths2Pattern(List<String> noAuthPaths) {
        for (String noAuthPathAndMethod : noAuthPaths) {
            // 处理以/id结尾的通用路径场景 /api/get/id:GET   -->  /api/get/[0-9a-zA-Z]+:GET
            if (noAuthPathAndMethod.contains(Constants.AUTH_FILTER_ID_SUFFIX)) {
                noAuthPathAndMethod = noAuthPathAndMethod.replace(Constants.AUTH_FILTER_ID_SUFFIX, "/[0-9a-zA-Z]+:");
            }
            Pattern pattern = Pattern.compile(noAuthPathAndMethod);
            patterns.add(pattern);
        }
    }

    private boolean needAuthApi(String path, String method){
        if (StringUtils.isEmpty(path)) {
            return false;
        }
        // path不是以/api开头，不需要鉴权
        if(!path.startsWith(Constants.AUTH_API_PREFIX)){
            return false;
        }
        // path以/api/system 开头且不在systemExcludeAPIs里面, 不需要鉴权
        if((path.equals("/api/system") || path.startsWith("/api/system/")) && Constants.SYSTEM_AUTHENTICATED_APIS.stream().noneMatch(s -> path.equals(s) || path.startsWith(s))){
            return false;
        }
        // 在白名单里面，不需要鉴权
        return !CollectionUtils.isEmpty(patterns) && patterns.stream().noneMatch(pattern->pattern.matcher(path + ":" + method).matches());
    }


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String path = request.getRequestURI();
        String contextPath = request.getContextPath();
        path = path.substring(contextPath.length());
        String method = request.getMethod().toUpperCase();
        if (path.startsWith("/upload") &&"POST".equals(method) && uploadApiAuthFlag) {
            // 上传接口需要鉴权
            if (isUserNotLogin(request)) {
                processNotLoginResponse(path, servletResponse);
                return;
            }
        } else if (!Objects.isNull(UserContext.getIfRemoteUserCenter()) && UserContext.getIfRemoteUserCenter()) {
            if (path.startsWith(Constants.AUTH_API_PREFIX) && Objects.isNull(UserContext.getCurrentUserInfo())) {
                HttpServletResponse response = (HttpServletResponse) servletResponse;
                response.setContentType(Constants.AUTH_FILTER_HEADER_CONTENT_TYPE);
                response.setStatus(HttpStatus.UNAUTHORIZED.value());
                ApiReturn<Object> apiReturn = ApiReturn.of("", HttpStatus.UNAUTHORIZED.value(), ErrorCodeEnum.TOKEN_INVALID.code);
                response.getWriter().write(objectMapper.writeValueAsString(apiReturn));
                return;
            }
        } else if (needAuthApi(path, method)) {
            // 以/api开头的路径
            // 检验用户是否登录或Token校验不通过
            if (isUserNotLogin(request)) {
                processNotLoginResponse(path, servletResponse);
                return;
            }
        } else if (FileUploadUtils.isUploadApiPath(path, method)) {
            String targetPath = path;
            if (!StringUtils.isEmpty(request.getQueryString())) {
                targetPath = targetPath + "?" + request.getQueryString();
            }
            if (FileUploadUtils.shouldAccessControl(targetPath) && isUserNotLogin(request)) {
                // 访问上传的文件，如果文件是需要登录才能访问的则需要鉴权，鉴权不通过返回默认错误提示图片
                servletRequest.setAttribute(Constants.ERROR_ATTR_PIC, "/file-no-auth.png");
                request.getRequestDispatcher("/error").forward(servletRequest, servletResponse);
                return;
            }
            if (FileUploadUtils.isPathExpiration(targetPath)) {
                // 访问上传的文件，如果文件已过期则返回默认的错误图片
                servletRequest.setAttribute(Constants.ERROR_ATTR_PIC, "/file-expiration.png");
                request.getRequestDispatcher("/error").forward(servletRequest, servletResponse);
                return;
            }
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }

    private boolean isUserNotLogin(HttpServletRequest servletRequest) {
        String accessToken = servletRequest.getHeader(Constants.AUTH_FILTER_HEADER_AUTHORIZATION);
        if (StringUtils.isEmpty(accessToken)) {
            // get from cookie if header not exist
            Cookie[] cookies = servletRequest.getCookies();
            if (null != cookies) {
                for (Cookie cookie : cookies) {
                    if (Constants.AUTH_FILTER_HEADER_AUTHORIZATION.equalsIgnoreCase(cookie.getName())) {
                        accessToken = cookie.getValue();
                        break;
                    }
                }
            }
        }
        return Objects.isNull(UserContext.getCurrentUserInfo()) ||
                !userServiceFactory.getTargetService().verifyWrapperToken(servletRequest, accessToken);
    }

    private void processNotLoginResponse(String path, ServletResponse servletResponse) throws IOException {
        if (Constants.SYSTEM_AUTHENTICATED_SPECIAL_APIS.stream().anyMatch(s -> path.startsWith(s))) {
            processNotLoginResponseV2(servletResponse);
        } else{
            HttpServletResponse response = (HttpServletResponse) servletResponse;
            response.setContentType(Constants.AUTH_FILTER_HEADER_CONTENT_TYPE);
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            ApiReturn<Object> apiReturn = ApiReturn.of("", HttpStatus.UNAUTHORIZED.value(),
                    messageSource.getMessage(ErrorCodeEnum.NO_PERMISSION_ACCESS_RESOURCE.code,
                            null, ErrorCodeEnum.NO_PERMISSION_ACCESS_RESOURCE.code, LocaleContextHolder.getLocale()));
            response.getWriter().write(objectMapper.writeValueAsString(apiReturn));
        }
    }

    private void processNotLoginResponseV2(ServletResponse servletResponse) throws IOException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setContentType(Constants.AUTH_FILTER_HEADER_CONTENT_TYPE);
        response.setStatus(HttpStatus.OK.value());
        response.getWriter().write("");
    }

    @Override
    public void destroy() {
        log.info("destroy auth filter ...");
    }

}