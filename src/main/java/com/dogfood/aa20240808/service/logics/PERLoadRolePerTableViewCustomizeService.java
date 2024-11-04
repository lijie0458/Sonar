package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.PERLoadRolePerTableViewCustomizeServiceMapper; 

@Service
public class PERLoadRolePerTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERLoadRolePerTableViewCustomizeServiceMapper pERLoadRolePerTableViewCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_816CAAB437568B2007971AECDC69D188> pERLoadRolePerTableView() {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_816CAAB437568B2007971AECDC69D188> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(pERLoadRolePerTableViewCustomizeServiceMapper.getAnonymousStructure_816CAAB437568B2007971AECDC69D188(), pERLoadRolePerTableViewCustomizeServiceMapper.countAnonymousStructure_816CAAB437568B2007971AECDC69D188().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9E419DA8D37975B36F0327D7E3A3B04B.class).list; 
        return result;
    } 


}
