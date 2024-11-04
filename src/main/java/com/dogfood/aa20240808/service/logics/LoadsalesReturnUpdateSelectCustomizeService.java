package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.repository.LoadsalesReturnUpdateSelectCustomizeServiceMapper; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadsalesReturnUpdateSelectCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadsalesReturnUpdateSelectCustomizeServiceMapper loadsalesReturnUpdateSelectCustomizeServiceMapper;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C807E715FC032F8BE6027971BB14D4D0> loadsalesReturnUpdateSelect(Long page, Long size, List<String> ListMaterialDetailsCode, String orderNumber) {
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0C942FA717268536916F444E2B135D0C> TotalList = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C807E715FC032F8BE6027971BB14D4D0> result = new ArrayList<>();
        TotalList = loadsalesReturnUpdateSelectCustomizeServiceMapper.getSql1(orderNumber); 
        for (Long index1 = 0L; index1 < TotalList.size(); index1++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0C942FA717268536916F444E2B135D0C item1 = TotalList.get(index1.intValue());
            if ((CommonFunctionUtil.equals(item1.outboundQuantity, item1.total))) {
                CommonFunctionUtil.add(ListMaterialDetailsCode, CommonFunctionUtil.clone(item1.materialCode));
            } else {
            } 

        } 

        result = CommonFunctionUtil.createListPage(loadsalesReturnUpdateSelectCustomizeServiceMapper.getAnonymousStructure_C807E715FC032F8BE6027971BB14D4D0(orderNumber, ListMaterialDetailsCode, page, size), loadsalesReturnUpdateSelectCustomizeServiceMapper.countAnonymousStructure_C807E715FC032F8BE6027971BB14D4D0(orderNumber, ListMaterialDetailsCode, page, size).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6EDCE44E600E4601144EEC8BC674EE13.class).list; 
        return result;
    } 


}
