package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0C942FA717268536916F444E2B135D0C; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadSalesReturnDetailsSelect_20CustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9C387961E6D66F52987268EB7DB609B7; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C; 

/**
 * 退货单查询
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
public class LoadSalesReturnDetailsSelect_20CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadSalesReturnDetailsSelect_20CustomizeServiceMapper loadSalesReturnDetailsSelect_20CustomizeServiceMapper;

    public AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F loadSalesReturnDetailsSelect_20(Long id, Boolean isupdate) {
        AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F listSalesOrder = new AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F();
        List<AnonymousStructure_0C942FA717268536916F444E2B135D0C> TotalList = new ArrayList<>();
        List<String> ListOrderNumber = new ArrayList<>();
        Boolean isAdd = true;
        List<String> TrueListOrderNumber = new ArrayList<>();
        List<AnonymousStructure_9C387961E6D66F52987268EB7DB609B7> oldvalue = new ArrayList<>();
        AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F result = new AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F();
        if (isupdate) {
            result = CommonFunctionUtil.createListPage(loadSalesReturnDetailsSelect_20CustomizeServiceMapper.getAnonymousStructure_19AE6979770076098EC91325F1B403C2(id), loadSalesReturnDetailsSelect_20CustomizeServiceMapper.countAnonymousStructure_19AE6979770076098EC91325F1B403C2(id).intValue(), AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F.class); 
        } else {
            listSalesOrder = CommonFunctionUtil.createListPage(loadSalesReturnDetailsSelect_20CustomizeServiceMapper.getAnonymousStructure_19AE6979770076098EC91325F1B403C21(id), loadSalesReturnDetailsSelect_20CustomizeServiceMapper.countAnonymousStructure_19AE6979770076098EC91325F1B403C21(id).intValue(), AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F.class); 
            ListOrderNumber = CommonFunctionUtil.listTransform(listSalesOrder.list, (item) -> item.salesOrders.orderNumber); 
            for (Long index = 0L; index < ListOrderNumber.size(); index++) {
                String item = ListOrderNumber.get(index.intValue());
                isAdd = true; 
                oldvalue = CommonFunctionUtil.createListPage(loadSalesReturnDetailsSelect_20CustomizeServiceMapper.getAnonymousStructure_9C387961E6D66F52987268EB7DB609B7(item), loadSalesReturnDetailsSelect_20CustomizeServiceMapper.countAnonymousStructure_9C387961E6D66F52987268EB7DB609B7(item).intValue(), AnonymousStructure_F12D1EDFDA9732C2C9CE9D65A403EB1C.class).list; 
                TotalList = loadSalesReturnDetailsSelect_20CustomizeServiceMapper.getSql1(item); 
                if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(TotalList), CommonFunctionUtil.length(oldvalue)))) {
                    for (Long index1 = 0L; index1 < TotalList.size(); index1++) {
                        AnonymousStructure_0C942FA717268536916F444E2B135D0C item1 = TotalList.get(index1.intValue());
                        if ((CommonFunctionUtil.equals(item1.outboundQuantity, item1.total))) {
                        } else {
                            isAdd = false; 
                        } 

                    } 

                } else {
                    isAdd = false; 
                } 

                if (isAdd) {
                } else {
                    CommonFunctionUtil.add(TrueListOrderNumber, CommonFunctionUtil.clone(item));
                } 

            } 

            if ((CommonFunctionUtil.equals(CommonFunctionUtil.length(TrueListOrderNumber), 0L))) {
            } else {
                result = CommonFunctionUtil.createListPage(loadSalesReturnDetailsSelect_20CustomizeServiceMapper.getAnonymousStructure_19AE6979770076098EC91325F1B403C22(TrueListOrderNumber), loadSalesReturnDetailsSelect_20CustomizeServiceMapper.countAnonymousStructure_19AE6979770076098EC91325F1B403C22(TrueListOrderNumber).intValue(), AnonymousStructure_4A52E0BE3A670997C417E41E4BCDEA9F.class); 
            } 

        } 

        return result;
    } 

}
