package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import com.dogfood.aa20240808.repository.LoadStoragelocationTableView_1CustomizeServiceMapper; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F3DE1F8D6FB3D900CB2B28F2CDD8E48; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

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
public class LoadStoragelocationTableView_1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadStoragelocationTableView_1CustomizeServiceMapper loadStoragelocationTableView_1CustomizeServiceMapper;

    public AnonymousStructure_5F3DE1F8D6FB3D900CB2B28F2CDD8E48 loadStoragelocationTableView_1(Long page, Long size, String sort, String order, Storage_locationEntity filter) {
        AnonymousStructure_5F3DE1F8D6FB3D900CB2B28F2CDD8E48 result = new AnonymousStructure_5F3DE1F8D6FB3D900CB2B28F2CDD8E48();
        result = CommonFunctionUtil.createListPage(loadStoragelocationTableView_1CustomizeServiceMapper.getAnonymousStructure_B88F011A8230B3D8558EA571687E646A(filter, page, size, getTableField("AnonymousStructure_B88F011A8230B3D8558EA571687E646A", sort), order), loadStoragelocationTableView_1CustomizeServiceMapper.countAnonymousStructure_B88F011A8230B3D8558EA571687E646A(filter, page, size, getTableField("AnonymousStructure_B88F011A8230B3D8558EA571687E646A", sort), order).intValue(), AnonymousStructure_5F3DE1F8D6FB3D900CB2B28F2CDD8E48.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadStoragelocationTableView_1CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_B88F011A8230B3D8558EA571687E646A", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("storage_location.id", "`storage_location`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("storage_location.createdTime", "`storage_location`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("storage_location.updatedTime", "`storage_location`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("storage_location.createdBy", "`storage_location`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("storage_location.updatedBy", "`storage_location`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("storage_location.location_code", "`storage_location`.`location_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("storage_location.location_name", "`storage_location`.`location_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("storage_location.warehouse_codetwo_id", "`storage_location`.`warehouse_codetwo_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("storage_location.description", "`storage_location`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_levelTwo.id", "`warehouse_level_two`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_levelTwo.createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_levelTwo.updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_levelTwo.createdBy", "`warehouse_level_two`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_levelTwo.updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_levelTwo.warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_levelTwo.warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_levelTwo.parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_levelTwo.address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_levelTwo.remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_levelTwo.warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_levelTwo.detailedAddress", "`warehouse_level_two`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("id", "`warehouse_level_two`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("createdTime", "`warehouse_level_two`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("updatedTime", "`warehouse_level_two`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("createdBy", "`warehouse_level_two`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("updatedBy", "`warehouse_level_two`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("location_code", "`storage_location`.`location_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("location_name", "`storage_location`.`location_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_codetwo_id", "`storage_location`.`warehouse_codetwo_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("description", "`storage_location`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_code", "`warehouse_level_two`.`warehouse_code`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_name", "`warehouse_level_two`.`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("parent_warehouse_Id", "`warehouse_level_two`.`parent_warehouse__id`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("address", "`warehouse_level_two`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("remark", "`warehouse_level_two`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("warehouse_manager", "`warehouse_level_two`.`warehouse_manager`");
        orderByParamToColumnMap.get("AnonymousStructure_B88F011A8230B3D8558EA571687E646A").put("detailedAddress", "`warehouse_level_two`.`detailed_address`");
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
