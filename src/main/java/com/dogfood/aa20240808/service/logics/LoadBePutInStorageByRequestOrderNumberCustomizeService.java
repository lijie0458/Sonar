package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.LoadBePutInStorageByRequestOrderNumberCustomizeServiceMapper; 
import org.slf4j.Logger; 
import com.dogfood.aa20240808.domain.structure.BePutInStorageStructureStructure; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.entities.BePutInStorageDetailsEntity; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

@Service
public class LoadBePutInStorageByRequestOrderNumberCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadBePutInStorageByRequestOrderNumberCustomizeServiceMapper loadBePutInStorageByRequestOrderNumberCustomizeServiceMapper;
    @Autowired
    private LoadTotalQuantity1CustomizeService loadTotalQuantity1CustomizeService;
    public List<BePutInStorageStructureStructure> loadBePutInStorageByRequestOrderNumber(String ReceivingNotificationsId) {
        BePutInStorageStructureStructure BePutInStorage = new BePutInStorageStructureStructure();
        List<BePutInStorageStructureStructure> result = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F> currentLcpEachName_1 = CommonFunctionUtil.createListPage(loadBePutInStorageByRequestOrderNumberCustomizeServiceMapper.getAnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F(ReceivingNotificationsId), loadBePutInStorageByRequestOrderNumberCustomizeServiceMapper.countAnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F(ReceivingNotificationsId).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F8461A0595B32619ED5EC5242F756E09.class).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F item = currentLcpEachName_1.get(index.intValue());
            BePutInStorage.cumulativeStorage = loadTotalQuantity1CustomizeService.loadTotalQuantity1(item.receivingDetails.id, item.receivingDetails.materialNumber); 
            if ((CommonFunctionUtil.equals(BePutInStorage.cumulativeStorage, null))) {
                BePutInStorage.cumulativeStorage = 0L; 
            } else {
            } 

            if ((new BigDecimal(BePutInStorage.cumulativeStorage).compareTo(item.receivingDetails.receivableQuantity) == -1)) {
                BePutInStorage.material = item.materialDetails; 
                BePutInStorage.receivingDetails = item.receivingDetails; 
                BePutInStorage.unitName = item.measuringUnit.unitName; 
                BePutInStorage.bePutInStorageDetails = CommonFunctionUtil.New(BePutInStorageDetailsEntity.class); 
                CommonFunctionUtil.add(result, CommonFunctionUtil.clone(BePutInStorage));
            } else {
            } 

        } 

        return result;
    } 


}
