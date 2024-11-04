package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.GlobalContext; 
import java.util.HashMap; 
import java.util.ArrayList; 
import java.util.LinkedHashMap; 
import com.dogfood.aa20240808.domain.structure.BaseResultStructure; 
import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Map; 
import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.IdentityConfigStructure; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.entities.AppConfigEntity; 
import com.dogfood.aa20240808.repository.IAMGetConfigCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.ConfigResStructure; 
import org.springframework.util.ReflectionUtils; 

@Service
public class IAMGetConfigCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private IAMGetConfigCustomizeServiceMapper iAMGetConfigCustomizeServiceMapper;
    public BaseResultStructure iAMGetConfig(String type, IdentitySourceStateEnumEnum state) {
        if (GlobalContext.notHandleValidation()) {
            if (state == null) {
                state = null; 
            } 

        } 

        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_95F91B06D36BBD34B9B470BF7A922AA3> appConfig = new ArrayList<>();
        ConfigResStructure data = new ConfigResStructure();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E6204F88FA3760A005F0E371750B535E> variable1 = new ArrayList<>();
        IdentitySourceConfigEntity variable2 = new IdentitySourceConfigEntity();
        IdentityConfigStructure variable3 = new IdentityConfigStructure();
        BaseResultStructure result = new BaseResultStructure();
        if ((CommonFunctionUtil.equals(type, "APPLICATION"))) {
            appConfig = CommonFunctionUtil.createListPage(iAMGetConfigCustomizeServiceMapper.getAnonymousStructure_95F91B06D36BBD34B9B470BF7A922AA3(), iAMGetConfigCustomizeServiceMapper.countAnonymousStructure_95F91B06D36BBD34B9B470BF7A922AA3().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_81F64A496F582F08EAE3E74042B4F743.class).list; 
            if ((CommonFunctionUtil.notEquals(CommonFunctionUtil.length(appConfig), 0L))) {
                data.appConfig = CommonFunctionUtil.listHead(appConfig).appConfig; 

                result.code = 200L; 
                result.msg = "ok"; 
                result.data = data; 

            } else {
                data.appConfig = CommonFunctionUtil.newWithInitiation(new AppConfigEntity(), _bean226 -> {}); 
                result.code = 200L; 
                result.msg = "ok"; 
                result.data = data; 

            } 

            return result;
        } else {
        } 

        if ((CommonFunctionUtil.equals(type, "IDENTITY"))) {
            if (CommonFunctionUtil.hasValue(state)) {
                variable1 = CommonFunctionUtil.createListPage(iAMGetConfigCustomizeServiceMapper.getAnonymousStructure_E6204F88FA3760A005F0E371750B535E(state), iAMGetConfigCustomizeServiceMapper.countAnonymousStructure_E6204F88FA3760A005F0E371750B535E(state).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_22E188A54D4B66D541C0CA978F47CF23.class).list; 
            } else {
                variable1 = CommonFunctionUtil.createListPage(iAMGetConfigCustomizeServiceMapper.getAnonymousStructure_E6204F88FA3760A005F0E371750B535E1(), iAMGetConfigCustomizeServiceMapper.countAnonymousStructure_E6204F88FA3760A005F0E371750B535E1().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_22E188A54D4B66D541C0CA978F47CF23.class).list; 
            } 

            if ((CommonFunctionUtil.notEquals(CommonFunctionUtil.length(variable1), 0L))) {
                variable2 = CommonFunctionUtil.listHead(variable1).identitySourceConfig; 
                variable3.appId = variable2.appId; 
                variable3.callbackUrl = variable2.successUrl; 
                variable3.casServiceUrl = variable2.casTicketUrl; 
                variable3.centerLoginUrl = variable2.centerLoginUrl; 
                variable3.centerLogoutUrl = variable2.centerLogoutUrl; 
                variable3.centerTokenUrl = variable2.tokenUrl; 
                variable3.centerUserUrl = variable2.userUrl; 
                variable3.expire = variable2.expire; 
                variable3.icon = variable2.icon; 
                variable3.loginEnable = variable2.loginEnable; 
                variable3.logoutCallbackUrl = variable2.logoutCallbackUrl; 
                variable3.name = variable2.name; 
                variable3.redirectUrl = variable2.redirectUrl; 
                variable3.state = CommonFunctionUtil.convert(variable2.state, String.class); 
                variable3.type = CommonFunctionUtil.convert(variable2.type, String.class); 
                variable3.agentId = variable2.agentId; 

                data.idectityConfig = variable3; 
                result = CommonFunctionUtil.newWithInitiation(new BaseResultStructure(), _bean690 -> {
    _bean690.code = 200L; 
    _bean690.msg = "请求成功"; 
    _bean690.data = data; 
} ); 
            } else {
                result = CommonFunctionUtil.newWithInitiation(new BaseResultStructure(), _bean540 -> {
    _bean540.code = 201L; 
    _bean540.msg = "此身份源配置信息为空"; 
} ); 
            } 

        } else {
        } 

        return result;
    } 

    public Map<String, Object> IAMGetConfigValidateDefaultValue(Object ext) throws Exception {
        Map<String, Object> elements = new HashMap<>();
        try {
            Field state = ReflectionUtils.findField(ext.getClass(), "state");
            if (state != null) {
                ReflectionUtils.makeAccessible(state);
                if (ReflectionUtils.getField(state, ext) == null) {
                    ReflectionUtils.setField(state, ext, null);
                } 

                elements.put("state", state.get(ext));
            } 

        } catch (Exception e) {
            LCAP_LOGGER.error("validate rule set default value error", e);
            throw e; 
        } 
        return elements;
    } 

    public Map<String, Object> IAMGetConfigValidateRestDefaultValue(String type, IdentitySourceStateEnumEnum state) throws Exception {
        Map<String, Object> elements = new LinkedHashMap<>();
        try {
            elements.put("type", type);
            if (state == null) {
                state = null; 
            } 

            elements.put("state", state);
        } catch (Exception e) {
            LCAP_LOGGER.error("validate rule set rest default value error", e);
            throw e; 
        } 
        return elements;
    } 


}
