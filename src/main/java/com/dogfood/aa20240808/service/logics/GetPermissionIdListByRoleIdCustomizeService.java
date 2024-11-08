package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.GetPermissionIdListByRoleIdCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A; 

/**
 * 拿到权限idList根据角色id-ljl
 * 
 * @author sys
 * 
 * @date 2024-11-8 10:18
 * 
 * @version 1.0
 * 
 * @BelongsProject mybatis审计日志
 * 
 * @BelongsPackage src/main/java/com/dogfood/aa20240808/service/logics
 */
@Service
public class GetPermissionIdListByRoleIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetPermissionIdListByRoleIdCustomizeServiceMapper getPermissionIdListByRoleIdCustomizeServiceMapper;

    public List<Long> getPermissionIdListByRoleId(Long roleId) {
        List<Long> result = new ArrayList<>();
        result = CommonFunctionUtil.listTransform(CommonFunctionUtil.createListPage(getPermissionIdListByRoleIdCustomizeServiceMapper.getAnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD(roleId), getPermissionIdListByRoleIdCustomizeServiceMapper.countAnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD(roleId).intValue(), AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A.class).list, (item) -> item.lCAPRolePerMapping.permissionId); 
        return result;
    } 

}
