package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.service.entities.InventoryEntityService; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import java.util.Arrays; 
import org.slf4j.Logger; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.repository.UpdateInventoryByDelOutsourceInSCustomizeServiceMapper; 
import java.math.BigDecimal; 

@Service
public class UpdateInventoryByDelOutsourceInSCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private UpdateInventoryByDelOutsourceInSCustomizeServiceMapper updateInventoryByDelOutsourceInSCustomizeServiceMapper;
    @Autowired
    private InventoryEntityService inventoryEntityService;
    public void updateInventoryByDelOutsourceInS(String outsourceInSCode) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_165F151968ED1905D619B304227B6925 variable1 = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_165F151968ED1905D619B304227B6925();
        List<InventoryEntity> updateList = new ArrayList<>();
        List<Long> delList = new ArrayList<>();
        variable1 = CommonFunctionUtil.createListPage(updateInventoryByDelOutsourceInSCustomizeServiceMapper.getAnonymousStructure_6000B46E601140BAEDF82461B2120FA9(outsourceInSCode), updateInventoryByDelOutsourceInSCustomizeServiceMapper.countAnonymousStructure_6000B46E601140BAEDF82461B2120FA9(outsourceInSCode).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_165F151968ED1905D619B304227B6925.class); 
        if ((variable1.total.compareTo(0L) > 0)) {
            for (Long index = 0L; index < variable1.list.size(); index++) {
                com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6000B46E601140BAEDF82461B2120FA9 item = variable1.list.get(index.intValue());
                item.inventory.stockQuantity = (item.inventory.stockQuantity.subtract(item.outsourceInStorageDetails.quantity)); 
                if ((item.inventory.stockQuantity.compareTo(new BigDecimal(0L)) == 1)) {
                    CommonFunctionUtil.add(updateList, item.inventory);
                } else {
                    CommonFunctionUtil.add(delList, item.inventory.id);
                } 

            } 

            if ((CommonFunctionUtil.length(updateList).compareTo(0L) > 0)) {
                inventoryEntityService.batchUpdate(updateList, Arrays.asList("id", "stockQuantity"));
            } else {
            } 

            if ((CommonFunctionUtil.length(delList).compareTo(0L) > 0)) {
                inventoryEntityService.batchDelete(delList);
            } else {
            } 

        } else {
        } 

        return ;
    } 


}
