package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.GetMaterialDetailsByCodeCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetMaterialDetailsByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetMaterialDetailsByCodeCustomizeServiceMapper getMaterialDetailsByCodeCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_67157391F5C859BD7A607E15FE4E75BD> getMaterialDetailsByCode(String code) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_67157391F5C859BD7A607E15FE4E75BD> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(getMaterialDetailsByCodeCustomizeServiceMapper.getAnonymousStructure_67157391F5C859BD7A607E15FE4E75BD(code), getMaterialDetailsByCodeCustomizeServiceMapper.countAnonymousStructure_67157391F5C859BD7A607E15FE4E75BD(code).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53DAF547B1A8EB1D1E8C43C4FE2C6055.class).list; 
        return result;
    } 


}
