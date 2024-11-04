package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.WarehouseinventoryStructure; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LoadupdateTransFerSlipDetails1CustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadupdateTransFerSlipDetails1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadupdateTransFerSlipDetails1CustomizeServiceMapper loadupdateTransFerSlipDetails1CustomizeServiceMapper;
    public List<WarehouseinventoryStructure> loadupdateTransFerSlipDetails1(String OrderNumber) {
        WarehouseinventoryStructure Warehouseinventory = new WarehouseinventoryStructure();
        List<WarehouseinventoryStructure> result = new ArrayList<>();
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_25E6E207A23A69C3FD2902BCF708440D> currentLcpEachName_1 = loadupdateTransFerSlipDetails1CustomizeServiceMapper.getSql1(OrderNumber);
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_25E6E207A23A69C3FD2902BCF708440D item = currentLcpEachName_1.get(index.intValue());
            Warehouseinventory.batchNumberId = item.batchNumber; 
            Warehouseinventory.number = item.quantity; 
            Warehouseinventory.warehouse = item.inWarehouse; 
            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(Warehouseinventory));
        } 

        return result;
    } 


}
