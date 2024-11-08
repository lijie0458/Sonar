package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadCountByDepartmentNumberCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9FE930414F5E9743D02790CBA595E403; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 查询该单号下是否还有关联数据
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
public class LoadCountByDepartmentNumberCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadCountByDepartmentNumberCustomizeServiceMapper loadCountByDepartmentNumberCustomizeServiceMapper;

    public AnonymousStructure_9FE930414F5E9743D02790CBA595E403 loadCountByDepartmentNumber(String param1) {
        AnonymousStructure_9FE930414F5E9743D02790CBA595E403 result = new AnonymousStructure_9FE930414F5E9743D02790CBA595E403();
        result = CommonFunctionUtil.createListPage(loadCountByDepartmentNumberCustomizeServiceMapper.getAnonymousStructure_EC270C00E4349160B6B0C122490BDB1B(param1), loadCountByDepartmentNumberCustomizeServiceMapper.countAnonymousStructure_EC270C00E4349160B6B0C122490BDB1B(param1).intValue(), AnonymousStructure_9FE930414F5E9743D02790CBA595E403.class); 
        return result;
    } 

}
