package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import com.dogfood.aa20240808.repository.LoadDepartmentTableViewCustomizeServiceMapper; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.domain.entities.DepartmentEntity; 
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
public class LoadDepartmentTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadDepartmentTableViewCustomizeServiceMapper loadDepartmentTableViewCustomizeServiceMapper;

    public AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258 loadDepartmentTableView(Long page, Long size, String sort, String order, DepartmentEntity filter) {
        AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258 result = new AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258();
        result = CommonFunctionUtil.createListPage(loadDepartmentTableViewCustomizeServiceMapper.getAnonymousStructure_3421ED028B001C489CD794910A15D0C0(filter, page, size, getTableField("AnonymousStructure_3421ED028B001C489CD794910A15D0C0", sort), order), loadDepartmentTableViewCustomizeServiceMapper.countAnonymousStructure_3421ED028B001C489CD794910A15D0C0(filter, page, size, getTableField("AnonymousStructure_3421ED028B001C489CD794910A15D0C0", sort), order).intValue(), AnonymousStructure_239C4CA8D6FC913CFC0B92C26D945258.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadDepartmentTableViewCustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_3421ED028B001C489CD794910A15D0C0", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("department.id", "`department`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("department.createdTime", "`department`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("department.updatedTime", "`department`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("department.createdBy", "`department`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("department.updatedBy", "`department`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("department.department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("department.parent_id", "`department`.`parent_id`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("id", "`department`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("createdTime", "`department`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("updatedTime", "`department`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("createdBy", "`department`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("updatedBy", "`department`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_3421ED028B001C489CD794910A15D0C0").put("parent_id", "`department`.`parent_id`");
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
