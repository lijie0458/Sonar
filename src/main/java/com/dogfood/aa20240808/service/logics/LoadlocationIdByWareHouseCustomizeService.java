package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadlocationIdByWareHouseCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadlocationIdByWareHouseCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadlocationIdByWareHouseCustomizeServiceMapper loadlocationIdByWareHouseCustomizeServiceMapper;
    public Long loadlocationIdByWareHouse(Long id) {
        Long result = 0L;
        result = CommonFunctionUtil.get(CommonFunctionUtil.createListPage(loadlocationIdByWareHouseCustomizeServiceMapper.getAnonymousStructure_B88F011A8230B3D8558EA571687E646A(id), loadlocationIdByWareHouseCustomizeServiceMapper.countAnonymousStructure_B88F011A8230B3D8558EA571687E646A(id).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F3DE1F8D6FB3D900CB2B28F2CDD8E48.class).list, 0L).storage_location.id; 
        return result;
    } 


}
