package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.repository.GetInventoryCustomizeServiceMapper; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import java.math.BigDecimal; 

/**
 * 拿到即时库存-ljl
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
public class GetInventoryCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private GetInventoryCustomizeServiceMapper getInventoryCustomizeServiceMapper;

    public InventoryEntity getInventory(String materialCode, String lotNumber, Long warehouse, Long storageLocationId) {
        AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B variable1 = new AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B();
        InventoryEntity variable2 = new InventoryEntity();
        InventoryEntity result = new InventoryEntity();
        variable1 = CommonFunctionUtil.createListPage(getInventoryCustomizeServiceMapper.getAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(materialCode, storageLocationId, warehouse), getInventoryCustomizeServiceMapper.countAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(materialCode, storageLocationId, warehouse).intValue(), AnonymousStructure_ABB51C5744639B1F415A73CB19AE729B.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            result = CommonFunctionUtil.get(variable1.list, 0L).inventory; 
        } else {
            variable2.materialCode = materialCode; 
            variable2.lotNumber = lotNumber; 
            variable2.warehouse = warehouse; 
            variable2.stockQuantity = BigDecimal.valueOf(0L); 
            variable2.location = storageLocationId; 
            result = variable2; 
        } 

        return result;
    } 

}
