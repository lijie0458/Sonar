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
import com.dogfood.aa20240808.domain.entities.PurchaseOrderDetailEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.PurchaseOrderDetailEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate PurchaseOrderDetailEntity controller
*
* @author sys
*/
@RestController
public class PurchaseOrderDetailEntityController {
    @Resource
    private PurchaseOrderDetailEntityService service;

    /**
    * auto gen batch create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "e14265ed65974a45b4456015087cae43",rules = { })})
    @PostMapping("/api/purchase-order-detail/batch")
    public ApiReturn<List<PurchaseOrderDetailEntity>> batchCreate(@RequestBody List<PurchaseOrderDetailEntity> body) {
        return ApiReturn.of(service.batchCreate(body));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "589c3dee-341a-4a2d-bc54-0562405377a2",rules = { }),@ValidationRuleGroup(value = "7d5254c7-0150-43e3-a955-61cf0006e94c",rules = { }),@ValidationRuleGroup(value = "b10fa4ab-534f-46c9-8907-bde3a29ca282",rules = { })})
    @DeleteMapping("/api/purchase-order-detail")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/purchase-order-detail/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

    /**
    * auto gen deleteBy method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "73a3f0a7-6bfc-4e68-8fe6-a81ad00c8d9f",rules = { })})
    @DeleteMapping("/api/purchase-order-detail/by")
    public ApiReturn<Long> deleteBy(@RequestBody FilterWrapper wrapper) {
        if (wrapper == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, PurchaseOrderDetailEntity.class);
        }
        return ApiReturn.of(service.deleteBy(wrapper.getReturnExpression()));
    }
}