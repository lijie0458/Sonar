package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.WarehouseinventoryStructure; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_25E6E207A23A69C3FD2902BCF708440D; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LoadupdateTransFerSlipDetails1CustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

/**
 * 查询调拨单需要同步库存的数据专用方法-cmk
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
public class LoadupdateTransFerSlipDetails1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadupdateTransFerSlipDetails1CustomizeServiceMapper loadupdateTransFerSlipDetails1CustomizeServiceMapper;

    public List<WarehouseinventoryStructure> loadupdateTransFerSlipDetails1(String OrderNumber) {
        WarehouseinventoryStructure Warehouseinventory = new WarehouseinventoryStructure();
        List<WarehouseinventoryStructure> result = new ArrayList<>();
        List<AnonymousStructure_25E6E207A23A69C3FD2902BCF708440D> currentLcpEachName_1 = loadupdateTransFerSlipDetails1CustomizeServiceMapper.getSql1(OrderNumber);
        for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
            AnonymousStructure_25E6E207A23A69C3FD2902BCF708440D item = currentLcpEachName_1.get(index.intValue());
            Warehouseinventory.batchNumberId = item.batchNumber; 
            Warehouseinventory.number = item.quantity; 
            Warehouseinventory.warehouse = item.inWarehouse; 
            CommonFunctionUtil.add(result, CommonFunctionUtil.clone(Warehouseinventory));
        } 

        return result;
    } 

}
