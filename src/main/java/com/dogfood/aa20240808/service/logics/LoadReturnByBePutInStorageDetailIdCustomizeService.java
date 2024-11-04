package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.repository.LoadReturnByBePutInStorageDetailIdCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadReturnByBePutInStorageDetailIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadReturnByBePutInStorageDetailIdCustomizeServiceMapper loadReturnByBePutInStorageDetailIdCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_509F24060C1187880735EB6970D1B3E4> loadReturnByBePutInStorageDetailId(List<Long> param1) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_509F24060C1187880735EB6970D1B3E4> result = new ArrayList<>();
        result = loadReturnByBePutInStorageDetailIdCustomizeServiceMapper.getSql1(param1); 
        return result;
    } 


}
