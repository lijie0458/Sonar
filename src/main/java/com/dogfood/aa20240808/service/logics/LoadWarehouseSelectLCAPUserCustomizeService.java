package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadWarehouseSelectLCAPUserCustomizeServiceMapper; 

@Service
public class LoadWarehouseSelectLCAPUserCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadWarehouseSelectLCAPUserCustomizeServiceMapper loadWarehouseSelectLCAPUserCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0> loadWarehouseSelectLCAPUser(Long page, Long size) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(loadWarehouseSelectLCAPUserCustomizeServiceMapper.getAnonymousStructure_47C167E7217746A55100F50A57F637C0(page, size), loadWarehouseSelectLCAPUserCustomizeServiceMapper.countAnonymousStructure_47C167E7217746A55100F50A57F637C0(page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_90BB04F104917B26166C550B4A1B0632.class).list; 
        return result;
    } 


}
