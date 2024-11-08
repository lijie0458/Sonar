package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import com.dogfood.aa20240808.repository.LoadCustomerManagementTableViewCustomizeServiceMapper; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import java.util.Map; 
import com.dogfood.aa20240808.domain.entities.CustomerManagementEntity; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7; 
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
public class LoadCustomerManagementTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadCustomerManagementTableViewCustomizeServiceMapper loadCustomerManagementTableViewCustomizeServiceMapper;

    public AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7 loadCustomerManagementTableView(Long page, Long size, String sort, String order, CustomerManagementEntity filter) {
        AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7 result = new AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7();
        result = CommonFunctionUtil.createListPage(loadCustomerManagementTableViewCustomizeServiceMapper.getAnonymousStructure_826FFD3E738FEC2EAB499855162B82C1(filter, page, size, getTableField("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1", sort), order), loadCustomerManagementTableViewCustomizeServiceMapper.countAnonymousStructure_826FFD3E738FEC2EAB499855162B82C1(filter, page, size, getTableField("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1", sort), order).intValue(), AnonymousStructure_271F5FE3E1E74FBB1BFD66CB40EAADC7.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadCustomerManagementTableViewCustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerManagement.id", "`customer_management`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerManagement.createdTime", "`customer_management`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerManagement.updatedTime", "`customer_management`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerManagement.createdBy", "`customer_management`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerManagement.updatedBy", "`customer_management`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerManagement.customerCode", "`customer_management`.`customer_code`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerManagement.customerName", "`customer_management`.`customer_name`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerManagement.linkMan", "`customer_management`.`link_man`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerManagement.contactNumber", "`customer_management`.`contact_number`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerManagement.address", "`customer_management`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerManagement.detailedAddress", "`customer_management`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("id", "`customer_management`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("createdTime", "`customer_management`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("updatedTime", "`customer_management`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("createdBy", "`customer_management`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("updatedBy", "`customer_management`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerCode", "`customer_management`.`customer_code`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("customerName", "`customer_management`.`customer_name`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("linkMan", "`customer_management`.`link_man`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("contactNumber", "`customer_management`.`contact_number`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("address", "`customer_management`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1").put("detailedAddress", "`customer_management`.`detailed_address`");
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
