package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E0FACE5BA8C381D6DAE64B97C6E83668; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0DA40FB2FE2E7045207FC997F338F109; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import com.dogfood.aa20240808.repository.LoadInventoryPageTableView_5CustomizeServiceMapper; 
import java.util.Map; 
import com.dogfood.aa20240808.util.LambdaParamWrapper; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6CB10721F5792DE379A9BB7841F3A2C2; 

/**
 * 
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
public class LoadInventoryPageTableView_5CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadInventoryPageTableView_5CustomizeServiceMapper loadInventoryPageTableView_5CustomizeServiceMapper;

    public AnonymousStructure_0DA40FB2FE2E7045207FC997F338F109 loadInventoryPageTableView_5(Long page, Long size, String sort, String order, InventoryEntity filter) {
        Long page1 = 0L;
        LambdaParamWrapper<List<AnonymousStructure_6CB10721F5792DE379A9BB7841F3A2C2>> variable1 = new LambdaParamWrapper<>(new ArrayList<>());
        LambdaParamWrapper<AnonymousStructure_E0FACE5BA8C381D6DAE64B97C6E83668> variable2 = new LambdaParamWrapper<>(new AnonymousStructure_E0FACE5BA8C381D6DAE64B97C6E83668());
        AnonymousStructure_0DA40FB2FE2E7045207FC997F338F109 result = new AnonymousStructure_0DA40FB2FE2E7045207FC997F338F109();
        variable2.param = CommonFunctionUtil.createListPage(loadInventoryPageTableView_5CustomizeServiceMapper.getAnonymousStructure_A5883BF58719F0F4646C4980B8917913(filter, page, size, getTableField("AnonymousStructure_A5883BF58719F0F4646C4980B8917913", sort), order), loadInventoryPageTableView_5CustomizeServiceMapper.countAnonymousStructure_A5883BF58719F0F4646C4980B8917913(filter, page, size, getTableField("AnonymousStructure_A5883BF58719F0F4646C4980B8917913", sort), order).intValue(), AnonymousStructure_E0FACE5BA8C381D6DAE64B97C6E83668.class); 
        page1 = ((page - 1L) * size); 
        variable1.param = loadInventoryPageTableView_5CustomizeServiceMapper.getSql1(filter, size, page1); 
        result = CommonFunctionUtil.newWithInitiation(new AnonymousStructure_0DA40FB2FE2E7045207FC997F338F109(), _bean1 -> {
    _bean1.list = variable1.param; 
    _bean1.total = variable2.param.total; 
    _bean1.total = _bean1.total; 
} ); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadInventoryPageTableView_5CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_A5883BF58719F0F4646C4980B8917913", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("inventory.id", "`inventory`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("inventory.materialCode", "`inventory`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("inventory.lotNumber", "`inventory`.`lot_number`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("inventory.unit", "`inventory`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("inventory.warehouse", "`inventory`.`warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("inventory.stockQuantity", "`inventory`.`stock_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("inventory.occupiedQuantity", "`inventory`.`occupied_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("inventory.availableQuantity", "`inventory`.`available_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("inventory.createdAt", "`inventory`.`created_at`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("inventory.updatedAt", "`inventory`.`updated_at`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("inventory.location", "`inventory`.`location`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_levelTwo.id", "`warehouse_level_two`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_levelTwo.createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_levelTwo.updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_levelTwo.createdBy", "`warehouse_level_two`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_levelTwo.updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_levelTwo.warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_levelTwo.warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_levelTwo.parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_levelTwo.address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_levelTwo.remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_levelTwo.warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_levelTwo.detailedAddress", "`warehouse_level_two`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("id", "`warehouse_level_two`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("lotNumber", "`inventory`.`lot_number`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse", "`inventory`.`warehouse`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("stockQuantity", "`inventory`.`stock_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("occupiedQuantity", "`inventory`.`occupied_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("availableQuantity", "`inventory`.`available_quantity`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("createdAt", "`inventory`.`created_at`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("updatedAt", "`inventory`.`updated_at`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("location", "`inventory`.`location`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("createdBy", "`warehouse_level_two`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_A5883BF58719F0F4646C4980B8917913").put("detailedAddress", "`warehouse_level_two`.`detailed_address`");
    } 

    private String getTableField(String structureName, String propertyName) {
        if (null == structureName || null == propertyName || null == orderByParamToColumnMap.get(structureName) || "".equals(propertyName)) {
            return null;
        } 

        if (null == orderByParamToColumnMap.get(structureName).get(propertyName)) {
            throw new HttpCodeException(404, "排序参数{" + propertyName + "}不存在"); 
        } 

        return orderByParamToColumnMap.get(structureName).get(propertyName);
    } 

    private <T> T getObjectTableField(String structureName, T obj, List<String> fieldNames) {
        try {
            T cloneObj = CommonFunctionUtil.clone(obj); 
            for (String fieldRef : fieldNames) {
                String[] fieldNameSplit = fieldRef.split("\\."); 
                Field field = obj.getClass().getDeclaredField(fieldNameSplit[0]); 
                Object fieldObject = cloneObj; 
                for (int fieldIndex = 1; fieldIndex < fieldNameSplit.length; fieldIndex++) {
                    fieldObject = field.get(fieldObject); 
                    field = field.getType().getDeclaredField(fieldNameSplit[fieldIndex]); 
                } 
                field.set(fieldObject, getTableField(structureName, String.valueOf(field.get(fieldObject))));
            } 
            return cloneObj;
        } catch (Exception e) {
            throw new HttpCodeException("500", e); 
        } 
    } 

}
