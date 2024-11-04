package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.repository.LCAPSearchDeptsCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LCAPSearchDeptsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LCAPSearchDeptsCustomizeServiceMapper lCAPSearchDeptsCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C lCAPSearchDepts(String name) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202> searchList = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C();
        searchList = lCAPSearchDeptsCustomizeServiceMapper.getAnonymousStructure_FF3D47421C85AD91C2FDAE6821984202(name); 
        if ((CommonFunctionUtil.length(searchList).compareTo(0L) > 0)) {
            result = CommonFunctionUtil.createListPage(CommonFunctionUtil.listTransform(searchList, (item) -> item.lCAPDepartment), CommonFunctionUtil.length(searchList), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0897AFAA83AFC224C278930E426A5B0C.class); 
        } else {
        } 

        return result;
    } 


}
