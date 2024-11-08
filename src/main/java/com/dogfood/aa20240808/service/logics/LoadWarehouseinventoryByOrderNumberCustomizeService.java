package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.domain.structure.WarehouseinventoryStructure; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import com.dogfood.aa20240808.repository.LoadWarehouseinventoryByOrderNumberCustomizeServiceMapper; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_01FBFC2B31545FDB6654B351805441A4; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_72217EE9E320F7E2EB0031D1F9C3975F; 

/**
 * 查询需要处理的数据
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
public class LoadWarehouseinventoryByOrderNumberCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadWarehouseinventoryByOrderNumberCustomizeServiceMapper loadWarehouseinventoryByOrderNumberCustomizeServiceMapper;

    public List<WarehouseinventoryStructure> loadWarehouseinventoryByOrderNumber(String OrderNumber, DistinctionEnumEnum DistinctionEnum) {
        WarehouseinventoryStructure Warehouseinventory = new WarehouseinventoryStructure();
        List<WarehouseinventoryStructure> result = new ArrayList<>();
        if ((((CommonFunctionUtil.equals(DistinctionEnum, DistinctionEnumEnum.FIELD_DRAW)) || (CommonFunctionUtil.equals(DistinctionEnum, DistinctionEnumEnum.FIELD_JOUT))) || (CommonFunctionUtil.equals(DistinctionEnum, DistinctionEnumEnum.FIELD_QOUT)))) {
            List<AnonymousStructure_01FBFC2B31545FDB6654B351805441A4> currentLcpEachName_1 = loadWarehouseinventoryByOrderNumberCustomizeServiceMapper.getSql1(OrderNumber);
            for (Long index = 0L; index < currentLcpEachName_1.size(); index++) {
                AnonymousStructure_01FBFC2B31545FDB6654B351805441A4 item = currentLcpEachName_1.get(index.intValue());
                Warehouseinventory.batchNumberId = item.batchNumber; 
                Warehouseinventory.number = item.quantity; 
                CommonFunctionUtil.add(result, CommonFunctionUtil.clone(Warehouseinventory));
            } 

        } else {
            List<AnonymousStructure_72217EE9E320F7E2EB0031D1F9C3975F> currentLcpEachName_2 = loadWarehouseinventoryByOrderNumberCustomizeServiceMapper.getSql2(OrderNumber);
            for (Long index = 0L; index < currentLcpEachName_2.size(); index++) {
                AnonymousStructure_72217EE9E320F7E2EB0031D1F9C3975F item = currentLcpEachName_2.get(index.intValue());
                Warehouseinventory.batchNumberId = item.batchNumber; 
                Warehouseinventory.number = item.returnQuanTity; 
                CommonFunctionUtil.add(result, CommonFunctionUtil.clone(Warehouseinventory));
            } 

        } 

        return result;
    } 

}
