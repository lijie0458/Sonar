package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.repository.LoadTransFerSlipDetailsByNumberCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.TransferSlipDetailsStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadTransFerSlipDetailsByNumberCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadTransFerSlipDetailsByNumberCustomizeServiceMapper loadTransFerSlipDetailsByNumberCustomizeServiceMapper;
    @Autowired
    private LoadWarehouseByCodeCustomizeService loadWarehouseByCodeCustomizeService;
    @Autowired
    private LoadWarehouseInfoCustomizeService loadWarehouseInfoCustomizeService;
    @Autowired
    private LoadInventoryListBywareHouseAndCodeCustomizeService loadInventoryListBywareHouseAndCodeCustomizeService;
    public List<TransferSlipDetailsStructure> loadTransFerSlipDetailsByNumber(String documentNumber) {
        TransferSlipDetailsStructure TransferSlipDetails = new TransferSlipDetailsStructure();
        List<TransferSlipDetailsStructure> result = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4D050CDD6A2A5B3718ED50006FF7EB5A> currentLcpEachName_1 = CommonFunctionUtil.createListPage(loadTransFerSlipDetailsByNumberCustomizeServiceMapper.getAnonymousStructure_4D050CDD6A2A5B3718ED50006FF7EB5A(documentNumber), loadTransFerSlipDetailsByNumberCustomizeServiceMapper.countAnonymousStructure_4D050CDD6A2A5B3718ED50006FF7EB5A(documentNumber).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9EC500E61237F6A0DC7E06B20B5453F4.class).list;
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4D050CDD6A2A5B3718ED50006FF7EB5A item = currentLcpEachName_1.get(index.intValue());
            TransferSlipDetails.transferSlip = item.transferSlipDetails; 
            TransferSlipDetails.material = item.materialDetails; 
            TransferSlipDetails.unitName = item.measuringUnit; 
            TransferSlipDetails.warehouseList = loadWarehouseByCodeCustomizeService.loadWarehouseByCode(item.transferSlipDetails.materialCode); 
            List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2> currentLcpEachName_2 = loadWarehouseInfoCustomizeService.loadWarehouseInfo().list;
            for (Long index1 = 0L; index1 < currentLcpEachName_2.size(); index1++) {
                com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2 item1 = currentLcpEachName_2.get(index1.intValue());
                CommonFunctionUtil.add(TransferSlipDetails.inwarehouseList, CommonFunctionUtil.clone(item1.warehouse_levelTwo));
            } 

            TransferSlipDetails.inventoryList = loadInventoryListBywareHouseAndCodeCustomizeService.loadInventoryListBywareHouseAndCode(item.transferSlipDetails.outWarehouse, item.transferSlipDetails.materialCode).List; 
            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(TransferSlipDetails));
        } 

        return result;
    } 


}
