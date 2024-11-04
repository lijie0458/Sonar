package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.service.entities.IdentitySourceConfigEntityService; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.SaveIdentitySourceResultStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.IAMSaveIdentityCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.entities.AppConfigEntity; 
import com.dogfood.aa20240808.domain.enumeration.LoginIdentityTypeEnumEnum; 

@Service
public class IAMSaveIdentityCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private IAMGetConfigCustomizeService iAMGetConfigCustomizeService;
    @Autowired
    private IAMSaveIdentityCustomizeServiceMapper iAMSaveIdentityCustomizeServiceMapper;
    @Autowired
    private IdentitySourceConfigEntityService identitySourceConfigEntityService;
    public SaveIdentitySourceResultStructure iAMSaveIdentity(IdentitySourceConfigEntity sourceDto) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E6204F88FA3760A005F0E371750B535E> variable1 = new ArrayList<>();
        AppConfigEntity appConfig = new AppConfigEntity();
        SaveIdentitySourceResultStructure result = new SaveIdentitySourceResultStructure();
        if ((CommonFunctionUtil.equals(sourceDto, null))) {
            LCAP_LOGGER.info(CommonFunctionUtil.toString("save identity input error！！"));
            result.code = -1L; 
            result.msg = "save identity input error！！"; 

            return result;
        } else {
        } 

        if ((CommonFunctionUtil.notEquals(sourceDto.id, null))) {
            appConfig = iAMGetConfigCustomizeService.iAMGetConfig("APPLICATION", null).data.appConfig; 
            variable1 = CommonFunctionUtil.createListPage(iAMSaveIdentityCustomizeServiceMapper.getAnonymousStructure_E6204F88FA3760A005F0E371750B535E(sourceDto), iAMSaveIdentityCustomizeServiceMapper.countAnonymousStructure_E6204F88FA3760A005F0E371750B535E(sourceDto).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_22E188A54D4B66D541C0CA978F47CF23.class).list; 
            if ((CommonFunctionUtil.notEquals(CommonFunctionUtil.length(variable1), 0L))) {
                if ((CommonFunctionUtil.equals(appConfig.loginIdentityType, LoginIdentityTypeEnumEnum.FIELD_Single))) {
                    if ((sourceDto.loginEnable && (iAMSaveIdentityCustomizeServiceMapper.getStructure1(sourceDto).compareTo(0L) > 0))) {
                        result.code = -1L; 
                        result.msg = "save identity input error！！"; 

                        return result;
                    } else {
                    } 

                } else {
                } 

                identitySourceConfigEntityService.update(sourceDto, null);
                result.code = 0L; 
                result.msg = "ok"; 

            } else {
                LCAP_LOGGER.info(CommonFunctionUtil.toString("查询身份源失败"));
                result.code = -1L; 
                result.msg = "查询身份源失败"; 

            } 

        } else {
            if (sourceDto.loginEnable) {
                result.code = -1L; 
                result.msg = "save identity input error！！"; 

                return result;
            } else {
            } 

            identitySourceConfigEntityService.create(sourceDto);
            result.code = 0L; 
            result.msg = "ok"; 

        } 

        return result;
    } 


}
