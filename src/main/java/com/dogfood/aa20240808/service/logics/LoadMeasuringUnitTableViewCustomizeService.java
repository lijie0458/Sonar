package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.LoadMeasuringUnitTableViewCustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadMeasuringUnitTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadMeasuringUnitTableViewCustomizeServiceMapper loadMeasuringUnitTableViewCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5DA3D583870666F723936098E7C05C85 loadMeasuringUnitTableView(Long page, Long size, String sort, String order, MeasuringUnitEntity filter) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5DA3D583870666F723936098E7C05C85 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5DA3D583870666F723936098E7C05C85();
        result = CommonFunctionUtil.createListPage(loadMeasuringUnitTableViewCustomizeServiceMapper.getAnonymousStructure_E4D66C6B00115C2619796053521EA8C0(filter, page, size, getTableField("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0", sort), order), loadMeasuringUnitTableViewCustomizeServiceMapper.countAnonymousStructure_E4D66C6B00115C2619796053521EA8C0(filter, page, size, getTableField("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5DA3D583870666F723936098E7C05C85.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadMeasuringUnitTableViewCustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("measuringUnit.id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("measuringUnit.createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("measuringUnit.updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("measuringUnit.createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("measuringUnit.updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("measuringUnit.unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("measuringUnit.unitName", "`measuring_unit`.`unit_name`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("id", "`measuring_unit`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("createdTime", "`measuring_unit`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("updatedTime", "`measuring_unit`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("createdBy", "`measuring_unit`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("updatedBy", "`measuring_unit`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("unitCode", "`measuring_unit`.`unit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_E4D66C6B00115C2619796053521EA8C0").put("unitName", "`measuring_unit`.`unit_name`");
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
