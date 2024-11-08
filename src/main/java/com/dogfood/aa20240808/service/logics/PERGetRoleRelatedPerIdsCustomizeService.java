package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.repository.PERGetRoleRelatedPerIdsCustomizeServiceMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A; 

/**
 * PER-获取角色已经关联的权限列表
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
public class PERGetRoleRelatedPerIdsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private PERGetRoleRelatedPerIdsCustomizeServiceMapper pERGetRoleRelatedPerIdsCustomizeServiceMapper;

    public List<AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD> pERGetRoleRelatedPerIds(Long roleId) {
        List<AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(pERGetRoleRelatedPerIdsCustomizeServiceMapper.getAnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD(roleId), pERGetRoleRelatedPerIdsCustomizeServiceMapper.countAnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD(roleId).intValue(), AnonymousStructure_1406A78D88BEF361C3C93B65A4E2AB5A.class).list; 
        return result;
    } 

}
