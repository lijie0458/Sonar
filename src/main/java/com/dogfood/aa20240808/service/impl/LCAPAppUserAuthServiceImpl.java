package com.dogfood.aa20240808.service.impl;

import com.dogfood.aa20240808.config.Constants;
import com.dogfood.aa20240808.domain.entities.LCAPUser;
import com.dogfood.aa20240808.repository.LCAPUserInfoMapper;
import com.dogfood.aa20240808.service.ServiceVersion;
import com.dogfood.aa20240808.service.system.UserProxyService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netease.cloud.nuims.auth.api.exception.AuthException;
import com.netease.cloud.nuims.auth.domain.authen.TokenService;
import com.netease.cloud.nuims.auth.domain.authen.AuthService;
import com.netease.cloud.nuims.plugin.api.annotations.ConfigKeyContants;
import com.netease.cloud.nuims.user.api.IUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
* auto generate LCAPUserInfoServiceImpl
*
* 这个serviceVersion的值要比NuimsUserService的值大
*
* @author sys
*/
@Component
@ServiceVersion(1)
public class LCAPAppUserAuthServiceImpl implements UserProxyService {

    @Resource
    private IUserService iUserService;

    @Resource
    private TokenService tokenService;

    @Resource
    private AuthService authService;

    @Resource
    private LCAPUserInfoMapper lcapUserInfoMapper;

    private ObjectMapper objectMapper = new ObjectMapper();


    @Override
    public Map authentication(HttpServletRequest request, String token) throws Exception {
        String userId = tokenService.getTokenValue(token, "UserId");
        LCAPUser userBy;
        userBy = lcapUserInfoMapper.getByUserId(userId);
        if (Objects.isNull(userBy)) {
            return new HashMap<>();
        }

        Map<String, Object> map = new HashMap<>();
        map.put(Constants.AUTH_FILTER_USERID_STR, userBy.getUserId());
        map.put(Constants.AUTH_FILTER_USERNAME_STR, userBy.getUserName());
        map.put(Constants.AUTH_FILTER_EMAIL_STR, userBy.getEmail());
        map.put(Constants.AUTH_FILTER_PHONE_STR, userBy.getPhone());
        map.put(Constants.AUTH_FILTER_SOURCE_STR, Objects.isNull(userBy.getSource()) ? null :
                userBy.getSource().getCode());
        map.put(Constants.AUTH_FILTER_STATUS_STR, Objects.isNull(userBy.getStatus()) ? null :
                userBy.getStatus().getCode());
        map.put(Constants.AUTH_FILTER_NICKNAME_STR, userBy.getDisplayName());
        map.put(Constants.AUTH_FILTER_CREATETIME_STR,
                Objects.isNull(userBy.getCreatedTime()) ? null : userBy.getCreatedTime().toInstant().toEpochMilli());
        map.put(Constants.AUTH_FILTER_UPDATETIME_STR,
                Objects.isNull(userBy.getUpdatedTime()) ? null : userBy.getUpdatedTime().toInstant().toEpochMilli());
        Map<String, Object> res = new HashMap<>();
        res.put(Constants.AUTH_FILTER_CODE_STR, Constants.AUTH_FILTER_SUCCESS_STR);
        res.put(Constants.AUTH_FILTER_DATA_STR, map);
        return res;
    }

    @Override
    public boolean verifyWrapperToken(HttpServletRequest request, String token) {
        if(StringUtils.isNotEmpty(token)){
            String authType = tokenService.getTokenValue(token, com.netease.cloud.nuims.auth.common.constants.Constants.AUTH_TYPE_KEY);
            String authParam = tokenService.getTokenValue(token, Constants.THIRD_PARTY_COOKIE_BODY_KEY);
            if (StringUtils.isNotEmpty(authType) && StringUtils.isNotEmpty(authParam)) {
                Map<String, String> paramsMap = new HashMap<>();
                paramsMap.put(ConfigKeyContants.AUTH_PARAM, authParam);
                try {
                   authService.auth(request, authType, paramsMap);
                } catch (AuthException e) {
                    return false;
                }
            }
        }
        return true;
    }

}
