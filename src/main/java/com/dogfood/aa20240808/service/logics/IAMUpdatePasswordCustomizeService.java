package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.LCAPUserService; 
import com.dogfood.aa20240808.domain.structure.ResponseResultStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LogicCallUtils; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class IAMUpdatePasswordCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private IAMGetUserByUserIdCustomizeService iAMGetUserByUserIdCustomizeService;
    @Autowired
    private LCAPUserService lCAPUserService;
    public ResponseResultStructure iAMUpdatePassword(String oldPwd, String newPwd, String confirmNewPwd, String userId) {
        LambdaParamWrapper<String> oldPwdWrapper = new LambdaParamWrapper<>(oldPwd);
        LambdaParamWrapper<LCAPUser> userInfo = new LambdaParamWrapper<>(new LCAPUser());
        Boolean variable1 = false;
        ResponseResultStructure result = new ResponseResultStructure();
        if (((CommonFunctionUtil.notEquals(newPwd, null)) && ((CommonFunctionUtil.notEquals(confirmNewPwd, null)) && (CommonFunctionUtil.notEquals(userId, null))))) {
            if ((CommonFunctionUtil.equals(newPwd, confirmNewPwd))) {
                userInfo.param = iAMGetUserByUserIdCustomizeService.iAMGetUserByUserId(userId); 
                if ((CommonFunctionUtil.notEquals(userInfo.param.id, null))) {
                    if ((CommonFunctionUtil.equals(oldPwdWrapper.param, null))) {
                        userInfo.param.password = newPwd; 
                        lCAPUserService.update(userInfo.param, null);
                        result.code = 1L; 
                        result.msg = "密码修改成功"; 

                    } else {
                        variable1 = LogicCallUtils.callWithError(() -> com.netease.lowcode.template.logic.AuthTemplateLogic.checkLoginPassword(oldPwdWrapper.param, userInfo.param.password), true); 
                        if (variable1) {
                            userInfo.param.password = newPwd; 
                            lCAPUserService.update(userInfo.param, null);
                            result.code = 1L; 
                            result.msg = "密码修改成功"; 

                        } else {
                            result.code = 0L; 
                            result.msg = "原密码比对未通过"; 

                            return result;
                        } 

                    } 

                } else {
                    result.code = 0L; 
                    result.msg = new StringBuilder().append(CommonFunctionUtil.toString("未在数据库中查询到userId为")).append(CommonFunctionUtil.toString(userId)).append(CommonFunctionUtil.toString("的用户信息")).toString(); 

                    return result;
                } 

            } else {
                result.code = 0L; 
                result.msg = "服务端二次校验两次输入的新密码不一致！"; 

                return result;
            } 

        } else {
            result.code = 0L; 
            result.msg = "数据传输有误！"; 

            return result;
        } 

        return result;
    } 


}
