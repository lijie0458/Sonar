package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TransferSlipDetailsStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.entities.TransferSlipDetailsEntity; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2; 
import com.dogfood.aa20240808.service.entities.MeasuringUnitEntityService; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 
import com.dogfood.aa20240808.service.entities.MaterialDetailsEntityService; 

/**
 * 调拨单点击新增选择物料后返回适合的数据逻辑
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
public class LoadTransferSlipDetailsByCodeCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private MaterialDetailsEntityService materialDetailsEntityService;

    @Autowired
    private MeasuringUnitEntityService measuringUnitEntityService;

    @Autowired
    private LoadWarehouseByCodeCustomizeService loadWarehouseByCodeCustomizeService;

    @Autowired
    private LoadWarehouseInfoCustomizeService loadWarehouseInfoCustomizeService;

    @Autowired
    private LoadTotalByCodeCustomizeService loadTotalByCodeCustomizeService;

    @Autowired
    private LoadInventoryListBywareHouseAndCodeCustomizeService loadInventoryListBywareHouseAndCodeCustomizeService;

    public List<TransferSlipDetailsStructure> loadTransferSlipDetailsByCode(List<String> InventoryList, Long outWareHouse, Long InWareHouse) {
        TransferSlipDetailsStructure TransferSlipDetails = new TransferSlipDetailsStructure();
        AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE variable1 = new AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE();
        AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE variable2 = new AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE();
        List<TransferSlipDetailsStructure> result = new ArrayList<>();
        for (Long index = 0L; index < InventoryList.size(); index++) {
            String item = InventoryList.get(index.intValue());
            TransferSlipDetails.material = materialDetailsEntityService.get(item); 
            TransferSlipDetails.unitName = measuringUnitEntityService.get(TransferSlipDetails.material.unit); 
            TransferSlipDetails.warehouseList = loadWarehouseByCodeCustomizeService.loadWarehouseByCode(item); 
            List<AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2> currentLcpEachName_1 = loadWarehouseInfoCustomizeService.loadWarehouseInfo().list;
            for (Long index1 = 0L; index1 < currentLcpEachName_1.size(); index1++) {
                AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2 item1 = currentLcpEachName_1.get(index1.intValue());
                CommonFunctionUtil.add(TransferSlipDetails.inwarehouseList, CommonFunctionUtil.clone(item1.warehouse_levelTwo));
            } 

            TransferSlipDetails.transferSlip = CommonFunctionUtil.New(TransferSlipDetailsEntity.class); 
            TransferSlipDetails.transferSlip.outWarehouse = outWareHouse; 
            TransferSlipDetails.transferSlip.inWarehouse = InWareHouse; 
            TransferSlipDetails.transferSlip.materialCode = TransferSlipDetails.material.materialCode; 
            // 查询当前物料的所有即时库存
            TransferSlipDetails.inventory = loadTotalByCodeCustomizeService.loadTotalByCode(item); 
            if ((CommonFunctionUtil.equals(TransferSlipDetails.inventory, null))) {
                TransferSlipDetails.inventory = BigDecimal.valueOf(0L); 
            } else {
            } 

            variable1 = loadInventoryListBywareHouseAndCodeCustomizeService.loadInventoryListBywareHouseAndCode(outWareHouse, TransferSlipDetails.transferSlip.materialCode); 
            TransferSlipDetails.inventoryList = CommonFunctionUtil.clone(variable1.List); 
            variable2 = loadInventoryListBywareHouseAndCodeCustomizeService.loadInventoryListBywareHouseAndCode(InWareHouse, TransferSlipDetails.transferSlip.materialCode); 
            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(TransferSlipDetails));
        } 

        return result;
    } 

}
