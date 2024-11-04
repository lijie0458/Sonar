package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.GetPermissionIdListByRoleIdCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetPermissionIdListByRoleIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetPermissionIdListByRoleIdCustomizeServiceMapper getPermissionIdListByRoleIdCustomizeServiceMapper;
    public List<Long> getPermissionIdListByRoleId(Long roleId) {
        LambdaParamWrapper<Long> roleIdWrapper = new LambdaParamWrapper<>(roleId);
        List<Long> result = new ArrayList<>();
        result = CommonFunctionUtil.listTransform(CommonFunctionUtil.createListPage(getPermissionIdListByRoleIdCustomizeServiceMapper.getAnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD(roleIdWrapper.param), getPermissionIdListByRoleIdCustomizeServiceMapper.countAnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD(roleIdWrapper.param).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A.class).list, (item) -> item.lCAPRolePerMapping.permissionId); 
        return result;
    } 


}
