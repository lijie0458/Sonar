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

import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.domain.entities.CustomerManagementEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.CustomerManagementEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate CustomerManagementEntity controller
*
* @author sys
*/
@RestController
public class CustomerManagementEntityController {
    @Resource
    private CustomerManagementEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "69abe1c7-15f3-432f-b321-55f5bc2db08c",rules = { @ValidationRule(value = "required",targetName = "body.customerCode",argvs = ""),@ValidationRule(value = "required",targetName = "body.customerName",argvs = ""),@ValidationRule(value = "pattern",targetName = "body.customerName",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "integer",targetName = "body.contactNumber",argvs = ""),@ValidationRule(value = "pattern",targetName = "body.detailedAddress",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}")}),@ValidationRuleGroup(value = "74244bad-1e08-43c0-91bf-07168f989ac9",rules = { @ValidationRule(value = "required",targetName = "body.customerCode",argvs = ""),@ValidationRule(value = "required",targetName = "body.customerName",argvs = ""),@ValidationRule(value = "pattern",targetName = "body.customerName",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "integer",targetName = "body.contactNumber",argvs = ""),@ValidationRule(value = "pattern",targetName = "body.detailedAddress",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}")})})
    @PostMapping("/api/customer-management")
    public ApiReturn<CustomerManagementEntity> create(@RequestBody CustomerManagementEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen batch create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "59bdd0d6018640648a7ab616f645d652",rules = { })})
    @PostMapping("/api/customer-management/batch")
    public ApiReturn<List<CustomerManagementEntity>> batchCreate(@RequestBody List<CustomerManagementEntity> body) {
        return ApiReturn.of(service.batchCreate(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "ae9eba40-b9f6-4afa-9e03-80ae7d9e591a",rules = { @ValidationRule(value = "required",targetName = "filter.entity.customerCode",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.customerName",argvs = ""),@ValidationRule(value = "pattern",targetName = "filter.entity.customerName",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "integer",targetName = "filter.entity.contactNumber",argvs = ""),@ValidationRule(value = "pattern",targetName = "filter.entity.detailedAddress",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}")})})
    @PutMapping("/api/customer-management")
    public ApiReturn<CustomerManagementEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        CustomerManagementEntity entity = JacksonUtils.fromJson(map, CustomerManagementEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "6b1491aae8ec490a85581a4619359c97",rules = { })})
    @DeleteMapping("/api/customer-management")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/customer-management/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}