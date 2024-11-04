package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.ReceivingDetailsStructureStructure; 
import com.dogfood.aa20240808.repository.LoadReceivingListTableView_2CustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.entities.ReceivingNotificationsEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadReceivingListTableView_2CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadReceivingListTableView_2CustomizeServiceMapper loadReceivingListTableView_2CustomizeServiceMapper;
    @Autowired
    private LoadTotalQuantityCustomizeService loadTotalQuantityCustomizeService;
    @Autowired
    private LoadTotalQuantity1CustomizeService loadTotalQuantity1CustomizeService;
    public List<ReceivingDetailsStructureStructure> loadReceivingListTableView_2(ReceivingNotificationsEntity filter, TimeHorizonStructure TimeHorizon, List<String> dataViewAuthorityUserNameList) {
        ReceivingDetailsStructureStructure ReceivingDetails = new ReceivingDetailsStructureStructure();
        List<ReceivingDetailsStructureStructure> variable1 = new ArrayList<>();
        List<ReceivingDetailsStructureStructure> result = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F> currentLcpEachName_1 = CommonFunctionUtil.createListPage(loadReceivingListTableView_2CustomizeServiceMapper.getAnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F(filter, dataViewAuthorityUserNameList, TimeHorizon), loadReceivingListTableView_2CustomizeServiceMapper.countAnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F(filter, dataViewAuthorityUserNameList, TimeHorizon).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F8461A0595B32619ED5EC5242F756E09.class).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F item = currentLcpEachName_1.get(index.intValue());
            ReceivingDetails.material = item.materialDetails; 
            ReceivingDetails.receivingNotifications = item.receivingNotifications; 
            ReceivingDetails.receivingDetails = item.receivingDetails; 
            ReceivingDetails.unitName = item.measuringUnit.unitName; 
            ReceivingDetails.total = loadTotalQuantityCustomizeService.loadTotalQuantity(item.receivingDetails.orderDetailId, item.receivingDetails.materialNumber); 
            ReceivingDetails.cumulativeStorage = loadTotalQuantity1CustomizeService.loadTotalQuantity1(item.receivingDetails.id, item.receivingDetails.materialNumber); 
            CommonFunctionUtil.add(variable1, CommonFunctionUtil.clone(ReceivingDetails));
        } 

        result = CommonFunctionUtil.clone(variable1); 
        return result;
    } 


}
