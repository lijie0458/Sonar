package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.LoadBathNumberByCodeAnddistinctionDistinctCustomizeServiceMapper; 

@Service
public class LoadBathNumberByCodeAnddistinctionDistinctCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadBathNumberByCodeAnddistinctionDistinctCustomizeServiceMapper loadBathNumberByCodeAnddistinctionDistinctCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B loadBathNumberByCodeAnddistinctionDistinct(String Code, Long warehouse, Long distinction, List<Long> ListBatchNumber) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B();
        result = CommonFunctionUtil.createListPage(loadBathNumberByCodeAnddistinctionDistinctCustomizeServiceMapper.getAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(distinction, ListBatchNumber, warehouse, Code), loadBathNumberByCodeAnddistinctionDistinctCustomizeServiceMapper.countAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(distinction, ListBatchNumber, warehouse, Code).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B.class); 
        return result;
    } 


}
