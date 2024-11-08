package com.dogfood.aa20240808.service.logics; 

import org.springframework.stereotype.Service; 
import java.util.HashMap; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_73BD2DE8D3A2FEEB58892DAF14663D90; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B; 
import com.dogfood.aa20240808.repository.LoadRoleManagementTableView_5CustomizeServiceMapper; 
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
public class LoadRoleManagementTableView_5CustomizeService {

    private static final Logger LCAP_LOGGER = LoggerFactory.getLogger(Constants.LCAP_CUSTOMIZE_LOGGER);

    @Autowired
    private LoadRoleManagementTableView_5CustomizeServiceMapper loadRoleManagementTableView_5CustomizeServiceMapper;

    public AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73 loadRoleManagementTableView_5(Long page, Long size, String sort, String order, Long roleId) {
        List<AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B> variable1 = new ArrayList<>();
        List<String> variable2 = new ArrayList<>();
        AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73 result = new AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73();
        variable1 = CommonFunctionUtil.createListPage(loadRoleManagementTableView_5CustomizeServiceMapper.getAnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B(roleId, page, size, getTableField("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B", sort), order), loadRoleManagementTableView_5CustomizeServiceMapper.countAnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B(roleId, page, size, getTableField("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B", sort), order).intValue(), AnonymousStructure_73BD2DE8D3A2FEEB58892DAF14663D90.class).list; 
        variable2 = CommonFunctionUtil.listTransform(variable1, (item) -> item.lCAPUser.userId); 
        result = CommonFunctionUtil.createListPage(loadRoleManagementTableView_5CustomizeServiceMapper.getAnonymousStructure_412E9C147CB3C99353FD18461376E868(variable2), loadRoleManagementTableView_5CustomizeServiceMapper.countAnonymousStructure_412E9C147CB3C99353FD18461376E868(variable2).intValue(), AnonymousStructure_16CCC0C0BE91A0D7F53BDFCE6D8C8F73.class); 
        return result;
    } 

    private Map<String, Map<String, String>> orderByParamToColumnMap = new HashMap();

    public LoadRoleManagementTableView_5CustomizeService() {
        orderByParamToColumnMap.put("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B", new HashMap());
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUserRoleMapping.id", "`lcap_user_role_mapping_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUserRoleMapping.createdTime", "`lcap_user_role_mapping_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUserRoleMapping.updatedTime", "`lcap_user_role_mapping_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUserRoleMapping.createdBy", "`lcap_user_role_mapping_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUserRoleMapping.updatedBy", "`lcap_user_role_mapping_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUserRoleMapping.userId", "`lcap_user_role_mapping_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUserRoleMapping.roleId", "`lcap_user_role_mapping_a6d592`.`role_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUserRoleMapping.userName", "`lcap_user_role_mapping_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUserRoleMapping.source", "`lcap_user_role_mapping_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.id", "`lcap_user_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.createdTime", "`lcap_user_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.updatedTime", "`lcap_user_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.userId", "`lcap_user_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.userName", "`lcap_user_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.source", "`lcap_user_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("lCAPUser.isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("id", "`lcap_user_role_mapping_a6d592`.`id`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("createdTime", "`lcap_user_role_mapping_a6d592`.`created_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("updatedTime", "`lcap_user_role_mapping_a6d592`.`updated_time`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("createdBy", "`lcap_user_role_mapping_a6d592`.`created_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("updatedBy", "`lcap_user_role_mapping_a6d592`.`updated_by`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("userId", "`lcap_user_role_mapping_a6d592`.`user_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("roleId", "`lcap_user_role_mapping_a6d592`.`role_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("userName", "`lcap_user_role_mapping_a6d592`.`user_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("source", "`lcap_user_role_mapping_a6d592`.`source`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("password", "`lcap_user_a6d592`.`password`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("phone", "`lcap_user_a6d592`.`phone`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("email", "`lcap_user_a6d592`.`email`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("displayName", "`lcap_user_a6d592`.`display_name`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("status", "`lcap_user_a6d592`.`status`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("department_Id", "`lcap_user_a6d592`.`department__id`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("directLeaderId", "`lcap_user_a6d592`.`direct_leader_id`");
        orderByParamToColumnMap.get("AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B").put("isFirstLogin", "`lcap_user_a6d592`.`is_first_login`");
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
