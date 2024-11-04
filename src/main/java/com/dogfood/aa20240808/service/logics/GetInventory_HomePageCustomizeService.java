package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.repository.GetInventory_HomePageCustomizeServiceMapper; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class GetInventory_HomePageCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private GetInventory_HomePageCustomizeServiceMapper getInventory_HomePageCustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_32D78049484F37C372CC54990DCBE061 getInventory_HomePage(String sort, String order) {
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_32D78049484F37C372CC54990DCBE061 result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_32D78049484F37C372CC54990DCBE061();
        result = CommonFunctionUtil.createListPage(getInventory_HomePageCustomizeServiceMapper.getAnonymousStructure_B4B1E36E87120D339E94C04920333A45(getTableField("AnonymousStructure_B4B1E36E87120D339E94C04920333A45", sort), order), getInventory_HomePageCustomizeServiceMapper.countAnonymousStructure_B4B1E36E87120D339E94C04920333A45(getTableField("AnonymousStructure_B4B1E36E87120D339E94C04920333A45", sort), order).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_32D78049484F37C372CC54990DCBE061.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public GetInventory_HomePageCustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_B4B1E36E87120D339E94C04920333A45", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_B4B1E36E87120D339E94C04920333A45").put("material_name", "`material_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B4B1E36E87120D339E94C04920333A45").put("warehouse_name", "`warehouse_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B4B1E36E87120D339E94C04920333A45").put("sum", "`sum`");
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
