package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_816CAAB437568B2007971AECDC69D188; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9E419DA8D37975B36F0327D7E3A3B04B; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.PERLoadRolePerTableViewCustomizeServiceMapper; 

/**
 * PER-加载角色权限分配数据表格
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
public class PERLoadRolePerTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private PERLoadRolePerTableViewCustomizeServiceMapper pERLoadRolePerTableViewCustomizeServiceMapper;

    public List<AnonymousStructure_816CAAB437568B2007971AECDC69D188> pERLoadRolePerTableView() {
        List<AnonymousStructure_816CAAB437568B2007971AECDC69D188> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(pERLoadRolePerTableViewCustomizeServiceMapper.getAnonymousStructure_816CAAB437568B2007971AECDC69D188(), pERLoadRolePerTableViewCustomizeServiceMapper.countAnonymousStructure_816CAAB437568B2007971AECDC69D188().intValue(), AnonymousStructure_9E419DA8D37975B36F0327D7E3A3B04B.class).list; 
        return result;
    } 

}
