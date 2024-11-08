package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.service.entities.LCAPPermissionService; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LCAPGetPermissionByRoleIdCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.entities.LCAPPermission; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A; 

/**
 * 
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
public class LCAPGetPermissionByRoleIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LCAPGetPermissionByRoleIdCustomizeServiceMapper lCAPGetPermissionByRoleIdCustomizeServiceMapper;

    @Autowired
    private LCAPPermissionService lCAPPermissionService;

    public List<LCAPPermission> lCAPGetPermissionByRoleId(Long roleId) {
        AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A variable1 = new AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A();
        Long permissionId = 0L;
        List<AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD> rolePermissionMappingList = new ArrayList<>();
        LCAPPermission permissionInfo = new LCAPPermission();
        List<LCAPPermission> permissionList = new ArrayList<>();
        if ((CommonFunctionUtil.equals(roleId, null))) {
            return permissionList;
        } else {
        } 

        variable1 = CommonFunctionUtil.createListPage(lCAPGetPermissionByRoleIdCustomizeServiceMapper.getAnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD(roleId), lCAPGetPermissionByRoleIdCustomizeServiceMapper.countAnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD(roleId).intValue(), AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A.class); 
        rolePermissionMappingList = variable1.list; 
        for (Long i = 0L; i < CommonFunctionUtil.length(rolePermissionMappingList); i++) {
            AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD item = rolePermissionMappingList.get(i.intValue());
            permissionId = item.lCAPRolePerMapping.permissionId; 
            permissionInfo = lCAPPermissionService.get(permissionId); 
            CommonFunctionUtil.add(permissionList, permissionInfo);
        } 

        return permissionList;
    } 

}
