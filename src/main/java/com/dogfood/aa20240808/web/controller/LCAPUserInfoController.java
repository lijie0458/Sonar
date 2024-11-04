package com.dogfood.aa20240808.web.controller;

import com.dogfood.aa20240808.context.UserContext;
import com.dogfood.aa20240808.config.Constants;
import com.dogfood.aa20240808.domain.enumeration.UserStatusEnumEnum;
import com.netease.cloud.nuims.user.api.bean.UserQueryDTO;
import com.netease.cloud.nuims.user.api.bean.UserResultDTO;
import com.netease.cloud.nuims.user.api.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Objects;
import java.util.HashMap;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
* auto generate LCAPUserSystemController
* 用户下沉时，页面模版里默认会调应用的一些接口
* 比如检查用户登录状态的getUser接口
*
* @author sys
*/
@RestController
@RequestMapping("api/user/system")
public class LCAPUserInfoController {
    private final Logger log = LoggerFactory.getLogger(LCAPUserInfoController.class);
    /**
    * 这个方法就是页面模版里调getUser接口或者调用检查登录态时需要的接口
    * 需要从全局变量里获取一个userId来查询用户出来
    */
    @Autowired
    private IUserService userInfoService;
    @GetMapping("/getUser")
    public Map getUser() {
        UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
        Map res = new HashMap<>();
        Map<String, String> map = new HashMap<>();
        if (Objects.isNull(currentUserInfo)) {
            log.warn("当前用户信息为空...");
            res.put(Constants.AUTH_FILTER_CODE_STR, Constants.AUTH_FILTER_FAIL_STR);
            res.put(Constants.AUTH_FILTER_DATA_STR, map);
            map.put(Constants.AUTH_FILTER_RESULT_STR, "false");
            return res;
        }
        if (Objects.nonNull(UserContext.getIfRemoteUserCenter()) && UserContext.getIfRemoteUserCenter()) {
            res.put(Constants.AUTH_FILTER_CODE_STR, Constants.AUTH_FILTER_SUCCESS_STR);
            res.put(Constants.AUTH_FILTER_DATA_STR, map);
            map.put(Constants.AUTH_FILTER_USERID_STR, currentUserInfo.getUserId());
            map.put(Constants.AUTH_FILTER_USERNAME_STR, currentUserInfo.getUserName());
            map.put(Constants.AUTH_FILTER_PHONE_STR, currentUserInfo.getPhone());
            map.put(Constants.AUTH_FILTER_NICKNAME_STR, currentUserInfo.getNickName());
            map.put(Constants.AUTH_FILTER_EMAIL_STR, currentUserInfo.getEmail());
            map.put(Constants.AUTH_FILTER_RESULT_STR, "true");
            return res;
        }
        String userId = currentUserInfo.getUserId();
        UserQueryDTO queryDTO = new UserQueryDTO();
        queryDTO.setUserId(userId);
        UserResultDTO result = userInfoService.getUser(queryDTO);
        if (Objects.isNull(result)) {
            log.error("userId {} 查询用户为空，请检查是否用户存在或三方用户转换是否正常", userId);
            res.put(Constants.AUTH_FILTER_CODE_STR, Constants.AUTH_FILTER_SUCCESS_STR);
            res.put(Constants.AUTH_FILTER_DATA_STR, map);
            map.put(Constants.AUTH_FILTER_USERID_STR, currentUserInfo.getUserId());
            map.put(Constants.AUTH_FILTER_USERNAME_STR, currentUserInfo.getUserName());
            map.put(Constants.AUTH_FILTER_PHONE_STR, currentUserInfo.getPhone());
            map.put(Constants.AUTH_FILTER_NICKNAME_STR, currentUserInfo.getNickName());
            map.put(Constants.AUTH_FILTER_EMAIL_STR, currentUserInfo.getEmail());
            map.put(Constants.AUTH_FILTER_RESULT_STR, "true");
            return res;
        }

        if (!UserStatusEnumEnum.FIELD_Normal.getCode().equals(result.getStatus())) {
            log.warn("用户 {} 用户状态非{}...", userId, UserStatusEnumEnum.FIELD_Normal.getCode());
            res.put(Constants.AUTH_FILTER_CODE_STR, Constants.AUTH_FILTER_FAIL_STR);
            res.put(Constants.AUTH_FILTER_DATA_STR, map);
            map.put(Constants.AUTH_FILTER_RESULT_STR, "false");
            return res;
        }

        res.put(Constants.AUTH_FILTER_CODE_STR, Constants.AUTH_FILTER_SUCCESS_STR);
        res.put(Constants.AUTH_FILTER_DATA_STR, map);
        map.put(Constants.AUTH_FILTER_USERID_STR, result.getUserId());
        map.put(Constants.AUTH_FILTER_USERNAME_STR, result.getUserName());
        map.put(Constants.AUTH_FILTER_PHONE_STR, result.getPhone());
        map.put(Constants.AUTH_FILTER_NICKNAME_STR, result.getDisplayName());
        map.put(Constants.AUTH_FILTER_RESULT_STR, "true");
        return res;
    }
}