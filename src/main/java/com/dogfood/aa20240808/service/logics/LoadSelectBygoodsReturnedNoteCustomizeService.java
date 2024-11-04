package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadSelectBygoodsReturnedNoteCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadSelectBygoodsReturnedNoteCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadSelectBygoodsReturnedNoteCustomizeServiceMapper loadSelectBygoodsReturnedNoteCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF27204DF7B8C2291565DFB01D4536D4 loadSelectBygoodsReturnedNote(String goodsReturnedNote) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF27204DF7B8C2291565DFB01D4536D4 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF27204DF7B8C2291565DFB01D4536D4();
        result = CommonFunctionUtil.createListPage(loadSelectBygoodsReturnedNoteCustomizeServiceMapper.getAnonymousStructure_C1F3F9BB7937A30CE4567980C1B22693(goodsReturnedNote), loadSelectBygoodsReturnedNoteCustomizeServiceMapper.countAnonymousStructure_C1F3F9BB7937A30CE4567980C1B22693(goodsReturnedNote).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF27204DF7B8C2291565DFB01D4536D4.class); 
        return result;
    } 


}
