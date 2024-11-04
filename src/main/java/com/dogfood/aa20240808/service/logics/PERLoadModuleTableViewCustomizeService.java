package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.PERLoadModuleTableViewCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class PERLoadModuleTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERLoadModuleTableViewCustomizeServiceMapper pERLoadModuleTableViewCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53BF8AB25D5E58D9DF5D7A7FBC87B28D> pERLoadModuleTableView() {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53BF8AB25D5E58D9DF5D7A7FBC87B28D> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(pERLoadModuleTableViewCustomizeServiceMapper.getAnonymousStructure_53BF8AB25D5E58D9DF5D7A7FBC87B28D(), pERLoadModuleTableViewCustomizeServiceMapper.countAnonymousStructure_53BF8AB25D5E58D9DF5D7A7FBC87B28D().intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F827667572E224857CDA5765397B0901.class).list; 
        return result;
    } 


}
