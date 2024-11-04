package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.entities.LCAPDepartment; 
import com.dogfood.aa20240808.service.entities.LCAPDepartmentService; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LCAPCreateDepartmentCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPDepartmentService lCAPDepartmentService;
    public void lCAPCreateDepartment(LCAPDepartment department) {
        if ((!CommonFunctionUtil.hasValue(department.id))) {
            lCAPDepartmentService.create(department);
        } else {
        } 

        return ;
    } 


}
