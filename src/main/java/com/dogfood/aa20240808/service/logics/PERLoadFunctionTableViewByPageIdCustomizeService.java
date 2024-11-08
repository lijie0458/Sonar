package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A1C3A855CCD635641331B29B571163B; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_65D0EF330467EBAF8C83901C34CF0460; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.PERLoadFunctionTableViewByPageIdCustomizeServiceMapper; 

/**
 * PER-通过页面id获取页面关联功能
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
public class PERLoadFunctionTableViewByPageIdCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private PERLoadFunctionTableViewByPageIdCustomizeServiceMapper pERLoadFunctionTableViewByPageIdCustomizeServiceMapper;

    public List<AnonymousStructure_6A1C3A855CCD635641331B29B571163B> pERLoadFunctionTableViewByPageId(Long pageId) {
        List<AnonymousStructure_6A1C3A855CCD635641331B29B571163B> result = new ArrayList<>();
        result = CommonFunctionUtil.createListPage(pERLoadFunctionTableViewByPageIdCustomizeServiceMapper.getAnonymousStructure_6A1C3A855CCD635641331B29B571163B(pageId), pERLoadFunctionTableViewByPageIdCustomizeServiceMapper.countAnonymousStructure_6A1C3A855CCD635641331B29B571163B(pageId).intValue(), AnonymousStructure_65D0EF330467EBAF8C83901C34CF0460.class).list; 
        return result;
    } 

}
