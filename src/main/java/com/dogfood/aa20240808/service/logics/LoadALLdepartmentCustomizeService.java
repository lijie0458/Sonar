package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadALLdepartmentCustomizeServiceMapper; 

@Service
public class LoadALLdepartmentCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadALLdepartmentCustomizeServiceMapper loadALLdepartmentCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258 loadALLdepartment() {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258();
        result = CommonFunctionUtil.createListPage(loadALLdepartmentCustomizeServiceMapper.getAnonymousStructure_3421ED028B001C489CD794910A15D0C0(), loadALLdepartmentCustomizeServiceMapper.countAnonymousStructure_3421ED028B001C489CD794910A15D0C0().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258.class); 
        return result;
    } 


}
