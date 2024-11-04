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
import com.dogfood.aa20240808.domain.entities.PurchaseOrderEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.PurchaseOrderEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate PurchaseOrderEntity controller
*
* @author sys
*/
@RestController
public class PurchaseOrderEntityController {
    @Resource
    private PurchaseOrderEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "bc5231e2-c385-4ea4-8e79-3f70ed38af3a",rules = { @ValidationRule(value = "required",targetName = "body.orderDate",argvs = ""),@ValidationRule(value = "required",targetName = "body.supplier",argvs = ""),@ValidationRule(value = "required",targetName = "body.requiredDate",argvs = "")})})
    @PostMapping("/api/purchase-order")
    public ApiReturn<PurchaseOrderEntity> create(@RequestBody PurchaseOrderEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "552fca70-8d36-4869-9d79-3ffb2cd322d1",rules = { }),@ValidationRuleGroup(value = "4800f2dea85c48cf95013b8599c720d5",rules = { }),@ValidationRuleGroup(value = "6a2e623b-7784-4902-9995-dbc4b6cd3829",rules = { }),@ValidationRuleGroup(value = "8afd6a5f-7778-4e1e-ab7f-d3c605d2face",rules = { @ValidationRule(value = "required",targetName = "filter.entity.orderDate",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.supplier",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.requiredDate",argvs = "")})})
    @PutMapping("/api/purchase-order")
    public ApiReturn<PurchaseOrderEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        PurchaseOrderEntity entity = JacksonUtils.fromJson(map, PurchaseOrderEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "e65e59d8-c8a2-4b49-93c8-8906882dd06e",rules = { }),@ValidationRuleGroup(value = "ab21a9a8be204592b58ba4641c5638ee",rules = { }),@ValidationRuleGroup(value = "ec215ad0-33c2-49fd-960f-8bad818af37e",rules = { })})
    @DeleteMapping("/api/purchase-order")
    public ApiReturn<Long> delete( @RequestParam(required = true) String orderNumber ) { 
        return ApiReturn.of(service.delete( orderNumber )); 
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "1643f3b61cd64f74a8e9c63e2d340447",rules = { }),@ValidationRuleGroup(value = "632b13bfb91849f3924ec77d6ac092ac",rules = { }),@ValidationRuleGroup(value = "4387216ef4df4907b2a59c441fcf1a7d",rules = { })})
    @GetMapping("/api/purchase-order")
    public ApiReturn<PurchaseOrderEntity> get( @RequestParam(required = true) String orderNumber ) { 
        return ApiReturn.of(service.get( orderNumber )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/purchase-order/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}