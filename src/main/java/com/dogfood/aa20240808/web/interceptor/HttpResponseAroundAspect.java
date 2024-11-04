package com.dogfood.aa20240808.web.interceptor;

import com.dogfood.aa20240808.domain.http.HttpResponse;
import com.dogfood.aa20240808.util.GlobalContext;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Objects;
/**
 * httpResponse injection handle
 */
@Component
@Aspect
public class HttpResponseAroundAspect {

    @After(value = "@annotation(com.dogfood.aa20240808.web.interceptor.annotation.HttpResponseAround)")
    public void pointcut() {
        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getResponse();
        if(Objects.nonNull(response)){
            List<HttpResponse> list = GlobalContext.findHttpResponseFieldsInSessionVariables();
                if(!CollectionUtils.isEmpty(list)){
                for (int l = 0; l < list.size(); l++) {
                HttpResponse httpResponse =list.get(l);
                httpResponse.copyProperties(httpResponse,response);
                }
            }
        }
    }

}
