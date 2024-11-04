package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.util.CommonFunctionUtil; 
import com.dogfood.aa20240808.exception.HttpCodeException; 
import com.dogfood.aa20240808.repository.LoadInventoryPageTableView_4CustomizeServiceMapper; 
import java.util.Map; 
import org.slf4j.Logger; 
import java.lang.reflect.Field; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.slf4j.LoggerFactory; 
import com.dogfood.aa20240808.config.Constants; 

@Service
public class LoadInventoryPageTableView_4CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);
    @Autowired
    private LoadInventoryPageTableView_4CustomizeServiceMapper loadInventoryPageTableView_4CustomizeServiceMapper;
    public com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_503318C7290063AC40A854F703B69D2C loadInventoryPageTableView_4(Long page, Long size, String sort, String order, InventoryEntity filter) {
        Long page1 = 0L;
        List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9195440D3385CF4C1A29F6E904E75D4D> variable2 = new ArrayList<>();
        com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_503318C7290063AC40A854F703B69D2C result = new com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_503318C7290063AC40A854F703B69D2C();
        variable2 = loadInventoryPageTableView_4CustomizeServiceMapper.getAnonymousStructure_9195440D3385CF4C1A29F6E904E75D4D(filter, getTableField("AnonymousStructure_9195440D3385CF4C1A29F6E904E75D4D", sort), order); 
        page1 = (page - 1L); 
        result = CommonFunctionUtil.createListPage(loadInventoryPageTableView_4CustomizeServiceMapper.getSql1(filter, getLimit(size), getOffset(page, size)), loadInventoryPageTableView_4CustomizeServiceMapper.countSql1(filter, getLimit(size), getOffset(page, size)).intValue(), com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_503318C7290063AC40A854F703B69D2C.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();
    public LoadInventoryPageTableView_4CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_9195440D3385CF4C1A29F6E904E75D4D", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_9195440D3385CF4C1A29F6E904E75D4D").put("materialCode", "`materialCode`");
        orderByParamToColumnMap.get("AnonymousStructure_9195440D3385CF4C1A29F6E904E75D4D").put("warehouse", "`warehouse`");
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

    public Long getOffset(Long page, Long size) {
        if (page == null || page < 1) {
            throw new HttpCodeException(500, "分页变量page值必须大于0"); 
        } 

        if (size == null || size < 1) {
            throw new HttpCodeException(500, "分页变量size值必须大于0"); 
        } 

        return (page - 1) * size;
    } 

    public Long getLimit(Long size) {
        if (size == null || size < 1) {
            throw new HttpCodeException(500, "分页变量size值必须大于0"); 
        } 

        return size == null ? 20L : size;
    } 


}
