package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import com.dogfood.aa20240808.repository.LoadMaterialTableViewCustomizeServiceMapper; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.entities.MaterialEntity; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadMaterialTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadMaterialTableViewCustomizeServiceMapper loadMaterialTableViewCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C loadMaterialTableView(Long page, Long size, String sort, String order, MaterialEntity filter) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C();
        result = CommonFunctionUtil.createListPage(loadMaterialTableViewCustomizeServiceMapper.getAnonymousStructure_988572FC06FE621688549C0BC53D9030(filter, page, size, getTableField("AnonymousStructure_988572FC06FE621688549C0BC53D9030", sort), order), loadMaterialTableViewCustomizeServiceMapper.countAnonymousStructure_988572FC06FE621688549C0BC53D9030(filter, page, size, getTableField("AnonymousStructure_988572FC06FE621688549C0BC53D9030", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5F55CB4B9BA2141C1A7AB94E4A6BCF0C.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadMaterialTableViewCustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_988572FC06FE621688549C0BC53D9030", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("material.id", "`material`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("material.createdTime", "`material`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("material.updatedTime", "`material`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("material.createdBy", "`material`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("material.updatedBy", "`material`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("material.category_name", "`material`.`category_name`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("material.category_code", "`material`.`category_code`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("material.parent_category_id", "`material`.`parent_category_id`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("id", "`material`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("createdTime", "`material`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("updatedTime", "`material`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("createdBy", "`material`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("updatedBy", "`material`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("category_name", "`material`.`category_name`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("category_code", "`material`.`category_code`");
        orderByParamToColumnMap.get("AnonymousStructure_988572FC06FE621688549C0BC53D9030").put("parent_category_id", "`material`.`parent_category_id`");
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
