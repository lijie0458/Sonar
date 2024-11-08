package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF27204DF7B8C2291565DFB01D4536D4; 
import com.dogfood.aa20240808.repository.LoadSelectBygoodsReturnedNoteCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 通过退货单号查询退货明细
 * 
 * @author sys
 * 
 * @date 2024-11-8 10:18
 * 
 * @version 1.0
 * 
 * @BelongsProject mybatis审计日志
 * 
 * @BelongsPackage src/main/java/com/dogfood/aa20240808/service/logics
 */
@Service
public class LoadSelectBygoodsReturnedNoteCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadSelectBygoodsReturnedNoteCustomizeServiceMapper loadSelectBygoodsReturnedNoteCustomizeServiceMapper;

    public AnonymousStructure_CF27204DF7B8C2291565DFB01D4536D4 loadSelectBygoodsReturnedNote(String goodsReturnedNote) {
        AnonymousStructure_CF27204DF7B8C2291565DFB01D4536D4 result = new AnonymousStructure_CF27204DF7B8C2291565DFB01D4536D4();
        result = CommonFunctionUtil.createListPage(loadSelectBygoodsReturnedNoteCustomizeServiceMapper.getAnonymousStructure_C1F3F9BB7937A30CE4567980C1B22693(goodsReturnedNote), loadSelectBygoodsReturnedNoteCustomizeServiceMapper.countAnonymousStructure_C1F3F9BB7937A30CE4567980C1B22693(goodsReturnedNote).intValue(), AnonymousStructure_CF27204DF7B8C2291565DFB01D4536D4.class); 
        return result;
    } 

}
