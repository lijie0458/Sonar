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
import com.dogfood.aa20240808.domain.entities.SalesOrdersEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.SalesOrdersEntityService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate SalesOrdersEntity controller
*
* @author sys
*/
@RestController
public class SalesOrdersEntityController {
    @Resource
    private SalesOrdersEntityService service;


    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "714dd69faf3a4f098cf30a5f38fc3024",rules = { }),@ValidationRuleGroup(value = "85d8cc5c9bab434e8fcadb9227b863c5",rules = { }),@ValidationRuleGroup(value = "09f8395e-7a12-4248-9725-ba3ffe1c78ff",rules = { }),@ValidationRuleGroup(value = "864a4dfba60c4521ab3bdcc827d3b997",rules = { }),@ValidationRuleGroup(value = "11b23cde-549e-4748-9bad-6412bea3d28e",rules = { @ValidationRule(value = "required",targetName = "orderNumber",argvs = "")}),@ValidationRuleGroup(value = "131a5694-4306-4dae-856f-1364408b7ebd",rules = { }),@ValidationRuleGroup(value = "62be541a-cb67-4b4c-9135-dd65e18997c7",rules = { })})
    @GetMapping("/api/sales-orders")
    public ApiReturn<SalesOrdersEntity> get( @RequestParam(required = true) String orderNumber ) { 
        return ApiReturn.of(service.get( orderNumber )); 
    }


    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "c78ce6d869fa4b1e92e4efa4ae72f37d",rules = { @ValidationRule(value = "required",targetName = "body.customer",argvs = "")}),@ValidationRuleGroup(value = "d4f722df73d2426181e60b65721b402e",rules = { @ValidationRule(value = "required",targetName = "body.customer",argvs = "")}),@ValidationRuleGroup(value = "67297123-5aab-442b-987b-6cb16b99d292",rules = { @ValidationRule(value = "required",targetName = "body.customer",argvs = "")}),@ValidationRuleGroup(value = "3b5b4ef6c5854d4b8eefbe16434a03f9",rules = { @ValidationRule(value = "required",targetName = "body.customer",argvs = "")}),@ValidationRuleGroup(value = "3900837d249346d1b3594e663a01c738",rules = { @ValidationRule(value = "required",targetName = "body.customer",argvs = ""),@ValidationRule(value = "required",targetName = "body.sourceNumber",argvs = "")}),@ValidationRuleGroup(value = "c04df55e-5ecb-45e5-8952-2593c16eb2e3",rules = { @ValidationRule(value = "required",targetName = "body.customer",argvs = "")}),@ValidationRuleGroup(value = "b92e4a2e-2ee1-473c-a60b-7f63eb969d40",rules = { @ValidationRule(value = "required",targetName = "body.orderNumber",argvs = "")})})
    @PostMapping("/api/sales-orders")
    public ApiReturn<SalesOrdersEntity> create(@RequestBody SalesOrdersEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "74808436-b82f-4f33-a3e0-c6bf5bad9bac",rules = { }),@ValidationRuleGroup(value = "519a16c7-2e28-41db-8a18-fa0afa6017ac",rules = { @ValidationRule(value = "required",targetName = "filter.entity.orderNumber",argvs = "")}),@ValidationRuleGroup(value = "9aa937ca-01f1-42eb-9340-1f8b0b8e689c",rules = { }),@ValidationRuleGroup(value = "d049cb13-eaef-4b39-a272-298cf1899ebd",rules = { }),@ValidationRuleGroup(value = "18ae8f61-1f98-4f17-8ef7-917c09a878d3",rules = { }),@ValidationRuleGroup(value = "695427a094124494b24a3c3087d83a6c",rules = { @ValidationRule(value = "required",targetName = "filter.entity.customer",argvs = "")}),@ValidationRuleGroup(value = "59beca5b-2498-4f0c-bcd7-a651d6c7d251",rules = { }),@ValidationRuleGroup(value = "896ac802f33d4a3498713c27d0fdfab8",rules = { @ValidationRule(value = "required",targetName = "filter.entity.customer",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.sourceNumber",argvs = "")}),@ValidationRuleGroup(value = "96e239d9-8ee4-4c00-aad4-e198dcbd2882",rules = { }),@ValidationRuleGroup(value = "3c85f6c6-f826-4524-8131-18ad01630eb8",rules = { @ValidationRule(value = "required",targetName = "filter.entity.customer",argvs = "")}),@ValidationRuleGroup(value = "4f7e81a9-aa9c-4d24-9a4d-a53d69754a9e",rules = { @ValidationRule(value = "required",targetName = "filter.entity.customer",argvs = "")}),@ValidationRuleGroup(value = "010e5b9134e24a7691c0711a6c40efc1",rules = { @ValidationRule(value = "required",targetName = "filter.entity.customer",argvs = "")}),@ValidationRuleGroup(value = "03fc4eef5eda4789a0d59d9fe4289d30",rules = { @ValidationRule(value = "required",targetName = "filter.entity.customer",argvs = "")}),@ValidationRuleGroup(value = "abb9d7da-1c2f-48d1-9467-0824c4de3a90",rules = { }),@ValidationRuleGroup(value = "776b005c-7caa-4737-96cb-cdad1bd09096",rules = { })})
    @PutMapping("/api/sales-orders")
    public ApiReturn<SalesOrdersEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        SalesOrdersEntity entity = JacksonUtils.fromJson(map, SalesOrdersEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "9c2731bc800643d29f5d418154c0ae58",rules = { }),@ValidationRuleGroup(value = "4da94404-4eaf-48f6-b05c-c46348c5de21",rules = { }),@ValidationRuleGroup(value = "722ba5640969498dbc579493d95b71aa",rules = { }),@ValidationRuleGroup(value = "29f4a16474784de79e262d09a4f092f0",rules = { }),@ValidationRuleGroup(value = "28509b6a475743d9b86a6e84dbe641be",rules = { }),@ValidationRuleGroup(value = "96604e89-cb97-482a-b2bd-d273917caccb",rules = { }),@ValidationRuleGroup(value = "b6021a52-f12e-4377-afce-85452c694060",rules = { }),@ValidationRuleGroup(value = "c137243a-7e54-4660-8f1f-b23cdb004d58",rules = { })})
    @DeleteMapping("/api/sales-orders")
    public ApiReturn<Long> delete( @RequestParam(required = true) String orderNumber ) { 
        return ApiReturn.of(service.delete( orderNumber )); 
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/sales-orders/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

}