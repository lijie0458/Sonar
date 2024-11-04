package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.GlobalContext; 
import java.util.HashMap; 
import java.util.ArrayList; 
import java.util.LinkedHashMap; 
import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Map; 
import com.dogfood.aa20240808.repository.IAMGetIdentitySourceByStateCustomizeServiceMapper; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import org.springframework.util.ReflectionUtils; 

@Service
public class IAMGetIdentitySourceByStateCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private IAMGetIdentitySourceByStateCustomizeServiceMapper iAMGetIdentitySourceByStateCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E6204F88FA3760A005F0E371750B535E> iAMGetIdentitySourceByState(String state) {
        if (GlobalContext.notHandleValidation()) {
            if (state == null) {
                state = null; 
            } 

        } 

        IdentitySourceStateEnumEnum variable1 = null;
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E6204F88FA3760A005F0E371750B535E> result = new ArrayList<>();
        if ((CommonFunctionUtil.equals(state, null))) {
            result = CommonFunctionUtil.createListPage(iAMGetIdentitySourceByStateCustomizeServiceMapper.getAnonymousStructure_E6204F88FA3760A005F0E371750B535E(), iAMGetIdentitySourceByStateCustomizeServiceMapper.countAnonymousStructure_E6204F88FA3760A005F0E371750B535E().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_22E188A54D4B66D541C0CA978F47CF23.class).list; 
        } else {
            variable1 = CommonFunctionUtil.toEnumItem(state, IdentitySourceStateEnumEnum.class); 
            result = CommonFunctionUtil.createListPage(iAMGetIdentitySourceByStateCustomizeServiceMapper.getAnonymousStructure_E6204F88FA3760A005F0E371750B535E1(variable1), iAMGetIdentitySourceByStateCustomizeServiceMapper.countAnonymousStructure_E6204F88FA3760A005F0E371750B535E1(variable1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_22E188A54D4B66D541C0CA978F47CF23.class).list; 
        } 

        return result;
    } 

    public Map<String, Object> IAMGetIdentitySourceByStateValidateDefaultValue(Object ext) throws Exception {
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

    public Map<String, Object> IAMGetIdentitySourceByStateValidateRestDefaultValue(String state) throws Exception {
        Map<String, Object> elements = new LinkedHashMap<>();
        try {
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
