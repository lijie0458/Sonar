package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.ReceivingDetailsStructureStructure; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.ReceivingDetailsEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.LoadReceivingDetailsByRequestOrderNumberCustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadReceivingDetailsByRequestOrderNumberCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadReceivingDetailsByRequestOrderNumberCustomizeServiceMapper loadReceivingDetailsByRequestOrderNumberCustomizeServiceMapper;
    @Autowired
    private LoadTotalQuantityCustomizeService loadTotalQuantityCustomizeService;
    public List<ReceivingDetailsStructureStructure> loadReceivingDetailsByRequestOrderNumber(String order_number) {
        ReceivingDetailsStructureStructure ReceivingDetails = new ReceivingDetailsStructureStructure();
        List<ReceivingDetailsStructureStructure> result = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_08261F03DEBF4B95532DEB7351240F29> currentLcpEachName_1 = CommonFunctionUtil.createListPage(loadReceivingDetailsByRequestOrderNumberCustomizeServiceMapper.getAnonymousStructure_08261F03DEBF4B95532DEB7351240F29(order_number), loadReceivingDetailsByRequestOrderNumberCustomizeServiceMapper.countAnonymousStructure_08261F03DEBF4B95532DEB7351240F29(order_number).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8469FF239682301F58BC3650677E9B85.class).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_08261F03DEBF4B95532DEB7351240F29 item = currentLcpEachName_1.get(index.intValue());
            ReceivingDetails.material = item.materialDetails; 
            ReceivingDetails.purchaseOrderDetails = item.purchaseOrderDetail; 
            ReceivingDetails.unitName = item.measuringUnit.unitName; 
            ReceivingDetails.receivingDetails = CommonFunctionUtil.New(ReceivingDetailsEntity.class); 
            ReceivingDetails.total = loadTotalQuantityCustomizeService.loadTotalQuantity(item.purchaseOrderDetail.id, item.purchaseOrderDetail.material_code); 
            if ((CommonFunctionUtil.equals(ReceivingDetails.total, null))) {
                ReceivingDetails.total = 0L; 
            } else {
            } 

            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(ReceivingDetails));
        } 

        return result;
    } 


}
