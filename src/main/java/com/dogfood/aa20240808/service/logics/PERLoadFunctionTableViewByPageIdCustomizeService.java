package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.PERLoadFunctionTableViewByPageIdCustomizeServiceMapper; 

@Service
public class PERLoadFunctionTableViewByPageIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private PERLoadFunctionTableViewByPageIdCustomizeServiceMapper pERLoadFunctionTableViewByPageIdCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A1C3A855CCD635641331B29B571163B> pERLoadFunctionTableViewByPageId(Long pageId) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A1C3A855CCD635641331B29B571163B> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(pERLoadFunctionTableViewByPageIdCustomizeServiceMapper.getAnonymousStructure_6A1C3A855CCD635641331B29B571163B(pageId), pERLoadFunctionTableViewByPageIdCustomizeServiceMapper.countAnonymousStructure_6A1C3A855CCD635641331B29B571163B(pageId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_65D0EF330467EBAF8C83901C34CF0460.class).list; 
        return result;
    } 


}
