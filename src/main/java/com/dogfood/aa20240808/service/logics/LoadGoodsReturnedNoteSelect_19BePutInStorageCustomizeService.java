package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadGoodsReturnedNoteSelect_19BePutInStorageCustomizeServiceMapper; 

@Service
public class LoadGoodsReturnedNoteSelect_19BePutInStorageCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadGoodsReturnedNoteSelect_19BePutInStorageCustomizeServiceMapper loadGoodsReturnedNoteSelect_19BePutInStorageCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_611269E21EE6FE18529B487D4B579CBA> loadGoodsReturnedNoteSelect_19BePutInStorage(Long page, Long size) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_611269E21EE6FE18529B487D4B579CBA> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(loadGoodsReturnedNoteSelect_19BePutInStorageCustomizeServiceMapper.getAnonymousStructure_611269E21EE6FE18529B487D4B579CBA(page, size), loadGoodsReturnedNoteSelect_19BePutInStorageCustomizeServiceMapper.countAnonymousStructure_611269E21EE6FE18529B487D4B579CBA(page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_44DDCA8E610FBE93A315D2A8A0839035.class).list; 
        return result;
    } 


}
