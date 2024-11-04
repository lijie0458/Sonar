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
import com.dogfood.aa20240808.domain.entities.PurchaseRequestEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.PurchaseRequestEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate PurchaseRequestEntity controller
*
* @author sys
*/
@RestController
public class PurchaseRequestEntityController {
    @Resource
    private PurchaseRequestEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "5c5dadc137bb4e8ea2de83b242651018",rules = { @ValidationRule(value = "required",targetName = "body.title",argvs = ""),@ValidationRule(value = "required",targetName = "body.applicationDate",argvs = ""),@ValidationRule(value = "required",targetName = "body.requestReason",argvs = "")})})
    @PostMapping("/api/purchase-request")
    public ApiReturn<PurchaseRequestEntity> create(@RequestBody PurchaseRequestEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "d3b02e67fc514275906f581a7ca8a4d0",rules = { @ValidationRule(value = "required",targetName = "filter.entity.title",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.applicationDate",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.requestReason",argvs = "")}),@ValidationRuleGroup(value = "f3f983c7cd204220bf0e1ff67bfd66e2",rules = { })})
    @PutMapping("/api/purchase-request")
    public ApiReturn<PurchaseRequestEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        PurchaseRequestEntity entity = JacksonUtils.fromJson(map, PurchaseRequestEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "516455ad-ae9e-4079-921b-7d1cbebe633f",rules = { })})
    @DeleteMapping("/api/purchase-request")
    public ApiReturn<Long> delete( @RequestParam(required = true) String requestNumber ) { 
        return ApiReturn.of(service.delete( requestNumber )); 
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "7ad4c6053e4b49a8b567ea353a8f3639",rules = { })})
    @GetMapping("/api/purchase-request")
    public ApiReturn<PurchaseRequestEntity> get( @RequestParam(required = true) String requestNumber ) { 
        return ApiReturn.of(service.get( requestNumber )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/purchase-request/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}