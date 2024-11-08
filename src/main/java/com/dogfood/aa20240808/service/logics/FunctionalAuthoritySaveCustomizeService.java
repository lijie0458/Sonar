package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.service.entities.LCAPRolePerMappingService; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.entities.LCAPRolePerMapping; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD; 
import com.dogfood.aa20240808.repository.FunctionalAuthoritySaveCustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A; 

/**
 * 功能权限保存-ljl
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
public class FunctionalAuthoritySaveCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private FunctionalAuthoritySaveCustomizeServiceMapper functionalAuthoritySaveCustomizeServiceMapper;

    @Autowired
    private LCAPRolePerMappingService lCAPRolePerMappingService;

    public void functionalAuthoritySave(List<Long> selectedList, Long roleId) {
        LCAPRolePerMapping variable1 = new LCAPRolePerMapping();
        List<LCAPRolePerMapping> variable2 = new ArrayList<>();
        List<AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD> variable3 = new ArrayList<>();
        List<Long> variable4 = new ArrayList<>();
        variable3 = CommonFunctionUtil.createListPage(functionalAuthoritySaveCustomizeServiceMapper.getAnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD(roleId), functionalAuthoritySaveCustomizeServiceMapper.countAnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD(roleId).intValue(), AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A.class).list; 
        for (Long index = 0L; index < selectedList.size(); index++) {
            Long item = selectedList.get(index.intValue());
            variable1.permissionId = item; 
            variable1.roleId = roleId; 
            CommonFunctionUtil.add(variable2, CommonFunctionUtil.clone(variable1));
        } 

        if ((CommonFunctionUtil.length(variable2).compareTo(0L) > 0)) {
            lCAPRolePerMappingService.batchCreate(variable2);
        } else {
        } 

        variable4 = CommonFunctionUtil.listTransform(variable3, (item) -> item.lCAPRolePerMapping.id); 
        if ((CommonFunctionUtil.length(variable4).compareTo(0L) > 0)) {
            lCAPRolePerMappingService.batchDelete(variable4);
        } else {
        } 

        return ;
    } 

}
