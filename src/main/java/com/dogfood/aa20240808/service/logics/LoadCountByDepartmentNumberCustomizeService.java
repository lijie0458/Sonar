package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadCountByDepartmentNumberCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadCountByDepartmentNumberCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadCountByDepartmentNumberCustomizeServiceMapper loadCountByDepartmentNumberCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9FE930414F5E9743D02790CBA595E403 loadCountByDepartmentNumber(String param1) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9FE930414F5E9743D02790CBA595E403 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9FE930414F5E9743D02790CBA595E403();
        result = CommonFunctionUtil.createListPage(loadCountByDepartmentNumberCustomizeServiceMapper.getAnonymousStructure_EC270C00E4349160B6B0C122490BDB1B(param1), loadCountByDepartmentNumberCustomizeServiceMapper.countAnonymousStructure_EC270C00E4349160B6B0C122490BDB1B(param1).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9FE930414F5E9743D02790CBA595E403.class); 
        return result;
    } 


}
