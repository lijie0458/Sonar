package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.ReceivingDetailsStructureStructure; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadReceivingDetailsByRequestOrderNumber1CustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadReceivingDetailsByRequestOrderNumber1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadReceivingDetailsByRequestOrderNumber1CustomizeServiceMapper loadReceivingDetailsByRequestOrderNumber1CustomizeServiceMapper;
    @Autowired
    private LoadTotalQuantityCustomizeService loadTotalQuantityCustomizeService;
    public List<ReceivingDetailsStructureStructure> loadReceivingDetailsByRequestOrderNumber1(String order_number) {
        ReceivingDetailsStructureStructure ReceivingDetails = new ReceivingDetailsStructureStructure();
        List<ReceivingDetailsStructureStructure> result = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F4686D0EDB15544AA67D0364F6D71209> currentLcpEachName_1 = CommonFunctionUtil.createListPage(loadReceivingDetailsByRequestOrderNumber1CustomizeServiceMapper.getAnonymousStructure_F4686D0EDB15544AA67D0364F6D71209(order_number), loadReceivingDetailsByRequestOrderNumber1CustomizeServiceMapper.countAnonymousStructure_F4686D0EDB15544AA67D0364F6D71209(order_number).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_EC7BA058C4584BA8BAE734E9FE1141DD.class).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F4686D0EDB15544AA67D0364F6D71209 item = currentLcpEachName_1.get(index.intValue());
            ReceivingDetails.material = item.materialDetails; 
            ReceivingDetails.purchaseOrderDetails = item.purchaseOrderDetail; 
            ReceivingDetails.unitName = item.measuringUnit.unitName; 
            ReceivingDetails.receivingDetails = item.receivingDetails; 
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
