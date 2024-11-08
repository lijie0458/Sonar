package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import com.dogfood.aa20240808.domain.entities.SupplierDetailsEntity; 
import java.util.Map; 
import com.dogfood.aa20240808.repository.LoadSupplierTableView1CustomizeServiceMapper; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_408B350FFFE2F80F289FABE4F7451137; 

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
public class LoadSupplierTableView1CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadSupplierTableView1CustomizeServiceMapper loadSupplierTableView1CustomizeServiceMapper;

    public AnonymousStructure_408B350FFFE2F80F289FABE4F7451137 loadSupplierTableView1(Long page, Long size, String sort, String order, SupplierDetailsEntity filter, Long SupplierId) {
        AnonymousStructure_408B350FFFE2F80F289FABE4F7451137 result = new AnonymousStructure_408B350FFFE2F80F289FABE4F7451137();
        result = CommonFunctionUtil.createListPage(loadSupplierTableView1CustomizeServiceMapper.getAnonymousStructure_DBA0A9D85716CA3769232B481797F39F(filter, SupplierId, page, size, getTableField("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F", sort), order), loadSupplierTableView1CustomizeServiceMapper.countAnonymousStructure_DBA0A9D85716CA3769232B481797F39F(filter, SupplierId, page, size, getTableField("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F", sort), order).intValue(), AnonymousStructure_408B350FFFE2F80F289FABE4F7451137.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadSupplierTableView1CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.id", "`supplier_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.createdTime", "`supplier_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.updatedTime", "`supplier_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.createdBy", "`supplier_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.updatedBy", "`supplier_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.supplier_code", "`supplier_details`.`supplier_code`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.supplier_name", "`supplier_details`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.credit_code", "`supplier_details`.`credit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.supplier_category", "`supplier_details`.`supplier_category`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.address", "`supplier_details`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.detailed_address", "`supplier_details`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.remark", "`supplier_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.contact_information", "`supplier_details`.`contact_information`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.bank", "`supplier_details`.`bank`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplierDetails.supplier", "`supplier_details`.`supplier`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier.id", "`supplier`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier.createdTime", "`supplier`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier.updatedTime", "`supplier`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier.createdBy", "`supplier`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier.updatedBy", "`supplier`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier.supplier_type", "`supplier`.`supplier_type`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier.category_code", "`supplier`.`category_code`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier.parent_category", "`supplier`.`parent_category`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("id", "`supplier_details`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("createdTime", "`supplier_details`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("updatedTime", "`supplier_details`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("createdBy", "`supplier_details`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("updatedBy", "`supplier_details`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier_code", "`supplier_details`.`supplier_code`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier_name", "`supplier_details`.`supplier_name`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("credit_code", "`supplier_details`.`credit_code`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier_category", "`supplier_details`.`supplier_category`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("address", "`supplier_details`.`address`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("detailed_address", "`supplier_details`.`detailed_address`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("remark", "`supplier_details`.`remark`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("contact_information", "`supplier_details`.`contact_information`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("bank", "`supplier_details`.`bank`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier", "`supplier_details`.`supplier`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("supplier_type", "`supplier`.`supplier_type`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("category_code", "`supplier`.`category_code`");
        orderByParamToColumnMap.get("AnonymousStructure_DBA0A9D85716CA3769232B481797F39F").put("parent_category", "`supplier`.`parent_category`");
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
