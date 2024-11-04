package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.PERGetAllOrganizationCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class PERGetAllOrganizationCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERGetAllOrganizationCustomizeServiceMapper pERGetAllOrganizationCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DFA4155F3C7CA9FA5C9E3897E0169A73 pERGetAllOrganization() {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DFA4155F3C7CA9FA5C9E3897E0169A73 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DFA4155F3C7CA9FA5C9E3897E0169A73();
        result = CommonFunctionUtil.createListPage(pERGetAllOrganizationCustomizeServiceMapper.getAnonymousStructure_900F3E83EA37D2305A535E248B2A40EF(), pERGetAllOrganizationCustomizeServiceMapper.countAnonymousStructure_900F3E83EA37D2305A535E248B2A40EF().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DFA4155F3C7CA9FA5C9E3897E0169A73.class); 
        return result;
    } 


}
