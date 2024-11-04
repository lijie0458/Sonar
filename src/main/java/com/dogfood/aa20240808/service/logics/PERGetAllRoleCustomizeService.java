package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.repository.PERGetAllRoleCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class PERGetAllRoleCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERGetAllRoleCustomizeServiceMapper pERGetAllRoleCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_70791B893F53C2EFB9E501591763B020> pERGetAllRole() {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_70791B893F53C2EFB9E501591763B020> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(pERGetAllRoleCustomizeServiceMapper.getAnonymousStructure_70791B893F53C2EFB9E501591763B020(), pERGetAllRoleCustomizeServiceMapper.countAnonymousStructure_70791B893F53C2EFB9E501591763B020().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CAC5152BAE2C91DD609E3DFEE343ACC6.class).list; 
        return result;
    } 


}
