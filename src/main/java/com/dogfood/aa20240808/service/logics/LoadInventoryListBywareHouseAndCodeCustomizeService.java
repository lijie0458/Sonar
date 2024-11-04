package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadInventoryListBywareHouseAndCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadDeliveryReleaseDetailsSelect_15CustomizeService loadDeliveryReleaseDetailsSelect_15CustomizeService;
    @Autowired
    private LoadBathNumberByCodeAnddistinctionCustomizeService loadBathNumberByCodeAnddistinctionCustomizeService;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE loadInventoryListBywareHouseAndCode(Long warehouse, String code) {
        LambdaParamWrapper<Storage_locationEntity> distinCtion = new LambdaParamWrapper<>(new Storage_locationEntity());
        List<InventoryEntity> InventoryList = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE();
        distinCtion.param = loadDeliveryReleaseDetailsSelect_15CustomizeService.loadDeliveryReleaseDetailsSelect_15(warehouse); 
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344> currentLcpEachName_1 = loadBathNumberByCodeAnddistinctionCustomizeService.loadBathNumberByCodeAnddistinction(code, warehouse, distinCtion.param.id).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344 item = currentLcpEachName_1.get(index.intValue());
            CommonFunctionUtil.add(InventoryList, CommonFunctionUtil.clone(item.inventory));
        } 

        result = CommonFunctionUtil.newWithInitiation(new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE(), _bean54 -> {
    _bean54.List = InventoryList; 
    _bean54.locationName = distinCtion.param.location_name; 
} ); 
        return result;
    } 


}
