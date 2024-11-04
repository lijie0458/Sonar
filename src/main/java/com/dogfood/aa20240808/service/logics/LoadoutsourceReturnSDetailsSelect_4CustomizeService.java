package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LoadoutsourceReturnSDetailsSelect_4CustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadoutsourceReturnSDetailsSelect_4CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadoutsourceReturnSDetailsSelect_4CustomizeServiceMapper loadoutsourceReturnSDetailsSelect_4CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_109E7C4B3A86BF64D3BABF15FFFFE2F3 loadoutsourceReturnSDetailsSelect_4(Long page, Long size, String code) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_109E7C4B3A86BF64D3BABF15FFFFE2F3 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_109E7C4B3A86BF64D3BABF15FFFFE2F3();
        result = CommonFunctionUtil.createListPage(loadoutsourceReturnSDetailsSelect_4CustomizeServiceMapper.getAnonymousStructure_A658BA46DE07AAD9FEFF3102D27C33D8(code, page, size), loadoutsourceReturnSDetailsSelect_4CustomizeServiceMapper.countAnonymousStructure_A658BA46DE07AAD9FEFF3102D27C33D8(code, page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_109E7C4B3A86BF64D3BABF15FFFFE2F3.class); 
        return result;
    } 


}
