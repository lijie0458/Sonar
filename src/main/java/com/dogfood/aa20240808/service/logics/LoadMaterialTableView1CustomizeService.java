package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.repository.LoadMaterialTableView1CustomizeServiceMapper; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadMaterialTableView1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadMaterialTableView1CustomizeServiceMapper loadMaterialTableView1CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_683439DE5EBB64E86D9B7E9441427D1E loadMaterialTableView1(Long page, Long size, String sort, String order, MaterialDetailsEntity filter, Long materialId) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_683439DE5EBB64E86D9B7E9441427D1E result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_683439DE5EBB64E86D9B7E9441427D1E();
        result = CommonFunctionUtil.createListPage(loadMaterialTableView1CustomizeServiceMapper.getAnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903(filter, page, size, getTableField("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903", sort), materialId, order), loadMaterialTableView1CustomizeServiceMapper.countAnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903(filter, page, size, getTableField("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903", sort), materialId, order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_683439DE5EBB64E86D9B7E9441427D1E.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadMaterialTableView1CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("materialDetails.materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("materialDetails.material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("materialDetails.category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("materialDetails.specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("materialDetails.unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("materialDetails.description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("materialDetails.is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("material.id", "`material`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("material.createdTime", "`material`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("material.updatedTime", "`material`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("material.createdBy", "`material`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("material.updatedBy", "`material`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("material.category_name", "`material`.`category_name`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("material.category_code", "`material`.`category_code`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("material.parent_category_id", "`material`.`parent_category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("materialCode", "`material_details`.`material_code`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("material_name", "`material_details`.`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("category_id", "`material_details`.`category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("specification", "`material_details`.`specification`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("unit", "`material_details`.`unit`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("description", "`material_details`.`description`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("is_batch_enabled", "`material_details`.`is_batch_enabled`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("category_name", "`material`.`category_name`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("category_code", "`material`.`category_code`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("parent_category_id", "`material`.`parent_category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903").put("unitName", "`measuring_unit`.`unit_name`");
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
