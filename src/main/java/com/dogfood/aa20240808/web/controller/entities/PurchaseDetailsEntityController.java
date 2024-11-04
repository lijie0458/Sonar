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
import com.dogfood.aa20240808.domain.entities.PurchaseDetailsEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.PurchaseDetailsEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate PurchaseDetailsEntity controller
*
* @author sys
*/
@RestController
public class PurchaseDetailsEntityController {
    @Resource
    private PurchaseDetailsEntityService service;

    /**
    * auto gen batch create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "f0695c2a099d4da282461fc06c35c3b0",rules = { })})
    @PostMapping("/api/purchase-details/batch")
    public ApiReturn<List<PurchaseDetailsEntity>> batchCreate(@RequestBody List<PurchaseDetailsEntity> body) {
        return ApiReturn.of(service.batchCreate(body));
    }

    /**
    * auto gen batch update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "0351792e-2dc1-429f-9675-059c84ec30a5",rules = { }),@ValidationRuleGroup(value = "43ff0fe8-a75c-4d11-9fa1-8d0b39063949",rules = { }),@ValidationRuleGroup(value = "68cfc9b77cfc46be98dab843cfa44733",rules = { }),@ValidationRuleGroup(value = "361d2f77ffc8413888d43f1237c13564",rules = { }),@ValidationRuleGroup(value = "e6d2a8a9-b62d-42c9-9836-0ea729235dea",rules = { }),@ValidationRuleGroup(value = "0e392cdbe1624288bc576def191c478b",rules = { }),@ValidationRuleGroup(value = "388a1b7ea5014ef6bd25bc294c17a21b",rules = { }),@ValidationRuleGroup(value = "bfa7b1e7-92d9-4619-a00b-c7b40c4587e5",rules = { }),@ValidationRuleGroup(value = "0ae3bb8b-b379-4813-8833-721694510e35",rules = { })})
    @PutMapping("/api/purchase-details/batch")
    public ApiReturn<List<PurchaseDetailsEntity>> batchUpdate(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntities() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        List<String> updateFields = filter.getProperties();
        List<PurchaseDetailsEntity> entities = new ArrayList<>();
        for (Map map : filter.getEntities()) {
            entities.add(JacksonUtils.fromJson(map, PurchaseDetailsEntity.class));
        }
        return ApiReturn.of(service.batchUpdate(entities, updateFields));
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "50ab2e3f-dfb0-4244-8d58-69be3daffb4b",rules = { }),@ValidationRuleGroup(value = "91ba067d-5ce1-4004-b2d2-13f4a5cff4d4",rules = { }),@ValidationRuleGroup(value = "1a9419fd-0901-4d90-936e-2b91c007766a",rules = { })})
    @GetMapping("/api/purchase-details")
    public ApiReturn<PurchaseDetailsEntity> get( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.get( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/purchase-details/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

    /**
    * auto gen deleteBy method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "3d7836192f9149a1a8dc0f3790b3e2e8",rules = { })})
    @DeleteMapping("/api/purchase-details/by")
    public ApiReturn<Long> deleteBy(@RequestBody FilterWrapper wrapper) {
        if (wrapper == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, PurchaseDetailsEntity.class);
        }
        return ApiReturn.of(service.deleteBy(wrapper.getReturnExpression()));
    }
}