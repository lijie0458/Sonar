package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import com.dogfood.aa20240808.repository.LoadSupplierTableViewCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
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
public class LoadSupplierTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadSupplierTableViewCustomizeServiceMapper loadSupplierTableViewCustomizeServiceMapper;

    public AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4 loadSupplierTableView(Long page, Long size, String sort, String order) {
        AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4 result = new AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4();
        result = CommonFunctionUtil.createListPage(loadSupplierTableViewCustomizeServiceMapper.getAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(page, size, getTableField("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8", sort), order), loadSupplierTableViewCustomizeServiceMapper.countAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(page, size, getTableField("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8", sort), order).intValue(), AnonymousStructure_11349FBCFFEB13D7A256774A83AFBFF4.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadSupplierTableViewCustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("supplier.id", "`supplier`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("supplier.createdTime", "`supplier`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("supplier.updatedTime", "`supplier`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("supplier.createdBy", "`supplier`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("supplier.updatedBy", "`supplier`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("supplier.supplier_type", "`supplier`.`supplier_type`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("supplier.category_code", "`supplier`.`category_code`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("supplier.parent_category", "`supplier`.`parent_category`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("id", "`supplier`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("createdTime", "`supplier`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("updatedTime", "`supplier`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("createdBy", "`supplier`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("updatedBy", "`supplier`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("supplier_type", "`supplier`.`supplier_type`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("category_code", "`supplier`.`category_code`");
        orderByParamToColumnMap.get("AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8").put("parent_category", "`supplier`.`parent_category`");
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
