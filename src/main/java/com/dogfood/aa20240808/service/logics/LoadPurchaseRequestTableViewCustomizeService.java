package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import com.dogfood.aa20240808.repository.LoadPurchaseRequestTableViewCustomizeServiceMapper; 
import java.util.Map; 
import com.dogfood.aa20240808.domain.entities.PurchaseRequestEntity; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_31C60B9760F5486756893EC06AC7FCAA; 
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
public class LoadPurchaseRequestTableViewCustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadPurchaseRequestTableViewCustomizeServiceMapper loadPurchaseRequestTableViewCustomizeServiceMapper;

    public AnonymousStructure_31C60B9760F5486756893EC06AC7FCAA loadPurchaseRequestTableView(Long page, Long size, String sort, String order, PurchaseRequestEntity filter, TimeHorizonStructure TimeHorizon, List<String> dataViewAuthorityUserNameList) {
        AnonymousStructure_31C60B9760F5486756893EC06AC7FCAA result = new AnonymousStructure_31C60B9760F5486756893EC06AC7FCAA();
        result = CommonFunctionUtil.createListPage(loadPurchaseRequestTableViewCustomizeServiceMapper.getAnonymousStructure_7FF730EDA24859558C689731C4BB4575(filter, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_7FF730EDA24859558C689731C4BB4575", sort), order), loadPurchaseRequestTableViewCustomizeServiceMapper.countAnonymousStructure_7FF730EDA24859558C689731C4BB4575(filter, dataViewAuthorityUserNameList, page, size, TimeHorizon, getTableField("AnonymousStructure_7FF730EDA24859558C689731C4BB4575", sort), order).intValue(), AnonymousStructure_31C60B9760F5486756893EC06AC7FCAA.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadPurchaseRequestTableViewCustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_7FF730EDA24859558C689731C4BB4575", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("purchaseRequest.title", "`purchase_request`.`title`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("purchaseRequest.requestNumber", "`purchase_request`.`request_number`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("purchaseRequest.department", "`purchase_request`.`department`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("purchaseRequest.requestReason", "`purchase_request`.`request_reason`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("purchaseRequest.annex", "`purchase_request`.`annex`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("purchaseRequest.createdBy", "`purchase_request`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("purchaseRequest.approvalStatus", "`purchase_request`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("purchaseRequest.applicationDate", "`purchase_request`.`application_date`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("department.id", "`department`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("department.createdTime", "`department`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("department.updatedTime", "`department`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("department.createdBy", "`department`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("department.updatedBy", "`department`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("department.department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("department.parent_id", "`department`.`parent_id`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("title", "`purchase_request`.`title`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("requestNumber", "`purchase_request`.`request_number`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("department", "`purchase_request`.`department`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("requestReason", "`purchase_request`.`request_reason`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("annex", "`purchase_request`.`annex`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("createdBy", "`purchase_request`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("approvalStatus", "`purchase_request`.`approval_status`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("applicationDate", "`purchase_request`.`application_date`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("id", "`department`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("createdTime", "`department`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("updatedTime", "`department`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("updatedBy", "`department`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("department_Name", "`department`.`department__name`");
        orderByParamToColumnMap.get("AnonymousStructure_7FF730EDA24859558C689731C4BB4575").put("parent_id", "`department`.`parent_id`");
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
