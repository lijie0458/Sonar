package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.enumeration.OrderStatusEnumEnum; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.PurchaseDetailsEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.service.entities.PurchaseDetailsEntityService; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 
import com.dogfood.aa20240808.repository.UpdatePurchaseDetailsCustomizeServiceMapper; 

@Service
public class UpdatePurchaseDetailsCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private UpdatePurchaseDetailsCustomizeServiceMapper updatePurchaseDetailsCustomizeServiceMapper;
    @Autowired
    private PurchaseDetailsEntityService purchaseDetailsEntityService;
    public Boolean updatePurchaseDetails(List<Long> purchaseDetailsIdList) {
        List<PurchaseDetailsEntity> variable1 = new ArrayList<>();
        Boolean result = true;
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1E1FD0FBFFD3C2705E03B08CB22F80C5> currentLcpEachName_1 = updatePurchaseDetailsCustomizeServiceMapper.getAnonymousStructure_1E1FD0FBFFD3C2705E03B08CB22F80C5(purchaseDetailsIdList);
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1E1FD0FBFFD3C2705E03B08CB22F80C5 item = currentLcpEachName_1.get(index.intValue());
            item.purchaseDetails.this_quantity = item.purchaseOrderDetail.orderQuantity; 
            if ((item.purchaseDetails.this_quantity.compareTo((item.purchaseDetails.request_quantity.subtract(item.purchaseDetails.down_quantity))) == 1)) {
                result = false; 
            } else {
                item.purchaseDetails.down_quantity = (item.purchaseDetails.down_quantity.add(item.purchaseDetails.this_quantity)); 
                if ((((item.purchaseDetails.down_quantity.compareTo(new BigDecimal(0L)) == 1) && (item.purchaseDetails.down_quantity.compareTo(item.purchaseDetails.request_quantity) == -1)) && (CommonFunctionUtil.equals(item.purchaseDetails.orderStatus, OrderStatusEnumEnum.FIELD_2)))) {
                    item.purchaseDetails.orderStatus = OrderStatusEnumEnum.FIELD_1; 
                } else {
                } 

                if ((CommonFunctionUtil.equals(item.purchaseDetails.down_quantity, item.purchaseDetails.request_quantity))) {
                    item.purchaseDetails.orderStatus = OrderStatusEnumEnum.FIELD_0; 
                } else {
                } 

                CommonFunctionUtil.add(variable1, item.purchaseDetails);
            } 

        } 

        if ((result && (CommonFunctionUtil.length(variable1).compareTo(0L) > 0))) {
            purchaseDetailsEntityService.batchUpdate(variable1, null);
        } else {
        } 

        return result;
    } 


}
