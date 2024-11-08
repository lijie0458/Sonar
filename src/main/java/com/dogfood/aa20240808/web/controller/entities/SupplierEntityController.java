package com.dogfood.aa20240808.web.controller.entities;

import java.io.Serializable;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.math.BigDecimal;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.*;

import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.domain.entities.SupplierEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.SupplierEntityService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate SupplierEntity controller
*
* @author sys
*/
@RestController
public class SupplierEntityController {
    @Resource
    private SupplierEntityService service;


    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "b752bcad-2b49-4209-8024-cb8bb3a36d27",rules = { }),@ValidationRuleGroup(value = "0e9e75d7-d0b6-4a0a-8f27-63fdbccd589f",rules = { @ValidationRule(value = "required",targetName = "id",argvs = "")})})
    @GetMapping("/api/supplier")
    public ApiReturn<SupplierEntity> get( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.get( id )); 
    }


    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "1d144e0c-d625-4410-8ba6-eeeae53665cb",rules = { @ValidationRule(value = "required",targetName = "body.supplier_type",argvs = ""),@ValidationRule(value = "pattern",targetName = "body.supplier_type",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "required",targetName = "body.category_code",argvs = ""),@ValidationRule(value = "^az09-$",targetName = "body.category_code",argvs = ""),@ValidationRule(value = "required",targetName = "body.parent_category",argvs = ""),@ValidationRule(value = "required",targetName = "body.parent_category",argvs = "")})})
    @PostMapping("/api/supplier")
    public ApiReturn<SupplierEntity> create(@RequestBody SupplierEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "28330f41-1b04-4ae7-9fef-3d75afdec142",rules = { @ValidationRule(value = "required",targetName = "filter.entity.supplier_type",argvs = ""),@ValidationRule(value = "pattern",targetName = "filter.entity.supplier_type",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "required",targetName = "filter.entity.category_code",argvs = ""),@ValidationRule(value = "^az09-$",targetName = "filter.entity.category_code",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.parent_category",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.parent_category",argvs = "")})})
    @PutMapping("/api/supplier")
    public ApiReturn<SupplierEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        SupplierEntity entity = JacksonUtils.fromJson(map, SupplierEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen batch delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "0e87d844faba4e97b70896b67cb508ad",rules = { })})
    @DeleteMapping("/api/supplier/batch")
    public ApiReturn<Long> batchDelete(@RequestBody List<Long> ids) {
        return ApiReturn.of(service.batchDelete(ids));
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/supplier/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

}