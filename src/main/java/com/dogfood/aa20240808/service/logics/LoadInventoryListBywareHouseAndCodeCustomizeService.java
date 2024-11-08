package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 根据物料编码和仓库查出对应的批次号
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
public class LoadInventoryListBywareHouseAndCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadDeliveryReleaseDetailsSelect_15CustomizeService loadDeliveryReleaseDetailsSelect_15CustomizeService;

    @Autowired
    private LoadBathNumberByCodeAnddistinctionCustomizeService loadBathNumberByCodeAnddistinctionCustomizeService;

    public AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE loadInventoryListBywareHouseAndCode(Long warehouse, String code) {
        LambdaParamWrapper<Storage_locationEntity> distinCtion = new LambdaParamWrapper<>(new Storage_locationEntity());
        LambdaParamWrapper<List<InventoryEntity>> InventoryList = new LambdaParamWrapper<>(new ArrayList<>());
        AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE result = new AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE();
        distinCtion.param = loadDeliveryReleaseDetailsSelect_15CustomizeService.loadDeliveryReleaseDetailsSelect_15(warehouse); 
        List<AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344> currentLcpEachName_1 = loadBathNumberByCodeAnddistinctionCustomizeService.loadBathNumberByCodeAnddistinction(code, warehouse, distinCtion.param.id).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344 item = currentLcpEachName_1.get(index.intValue());
            CommonFunctionUtil.add(InventoryList.param, CommonFunctionUtil.clone(item.inventory));
        } 

        result = CommonFunctionUtil.newWithInitiation(new AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE(), _bean1 -> {
    _bean1.List = InventoryList.param; 
    _bean1.locationName = distinCtion.param.location_name; 
} ); 
        return result;
    } 

}
