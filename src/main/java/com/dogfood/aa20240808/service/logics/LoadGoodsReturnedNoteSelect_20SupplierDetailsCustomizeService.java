package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeServiceMapper loadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E310A9D695F45E4453B876CB739D4C34> loadGoodsReturnedNoteSelect_20SupplierDetails(Long page, Long size) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E310A9D695F45E4453B876CB739D4C34> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(loadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeServiceMapper.getAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(page, size), loadGoodsReturnedNoteSelect_20SupplierDetailsCustomizeServiceMapper.countAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1094E061FF1DF91F50824A15E97C91F7.class).list; 
        return result;
    } 


}
