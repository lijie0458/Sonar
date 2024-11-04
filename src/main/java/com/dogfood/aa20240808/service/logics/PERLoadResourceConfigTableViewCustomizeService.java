package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.PERLoadResourceConfigTableViewCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class PERLoadResourceConfigTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERLoadResourceConfigTableViewCustomizeServiceMapper pERLoadResourceConfigTableViewCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_816CAAB437568B2007971AECDC69D188> pERLoadResourceConfigTableView() {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_816CAAB437568B2007971AECDC69D188> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(pERLoadResourceConfigTableViewCustomizeServiceMapper.getAnonymousStructure_816CAAB437568B2007971AECDC69D188(), pERLoadResourceConfigTableViewCustomizeServiceMapper.countAnonymousStructure_816CAAB437568B2007971AECDC69D188().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9E419DA8D37975B36F0327D7E3A3B04B.class).list; 
        return result;
    } 


}
