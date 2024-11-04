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
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionDetailsEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.ProductionMaterialRequisitionDetailsEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate ProductionMaterialRequisitionDetailsEntity controller
*
* @author sys
*/
@RestController
public class ProductionMaterialRequisitionDetailsEntityController {
    @Resource
    private ProductionMaterialRequisitionDetailsEntityService service;

    /**
    * auto gen batch create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "047e979fcf6a41558bc68dc806d720b6",rules = { }),@ValidationRuleGroup(value = "392b1e5b-0c42-463e-880a-e66c2616ce62",rules = { }),@ValidationRuleGroup(value = "72fa2ffb-f68d-4888-adf4-e58dc8d43841",rules = { })})
    @PostMapping("/api/production-material-requisition-details/batch")
    public ApiReturn<List<ProductionMaterialRequisitionDetailsEntity>> batchCreate(@RequestBody List<ProductionMaterialRequisitionDetailsEntity> body) {
        return ApiReturn.of(service.batchCreate(body));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "391a8815-6a45-4865-b5af-7209ac21bcf6",rules = { }),@ValidationRuleGroup(value = "aab20152-7517-4fd3-8c5f-ea27974128ac",rules = { }),@ValidationRuleGroup(value = "90adf89f-2038-4b39-b57d-201248273f73",rules = { })})
    @DeleteMapping("/api/production-material-requisition-details")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/production-material-requisition-details/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

    /**
    * auto gen deleteBy method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "1d022ebe254046708058702f60a6e77f",rules = { }),@ValidationRuleGroup(value = "8cd3acb7-9ff4-4a96-9415-3093db95bc2e",rules = { }),@ValidationRuleGroup(value = "dc073cb4-0b2e-46fb-a324-5b2da8333635",rules = { })})
    @DeleteMapping("/api/production-material-requisition-details/by")
    public ApiReturn<Long> deleteBy(@RequestBody FilterWrapper wrapper) {
        if (wrapper == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, ProductionMaterialRequisitionDetailsEntity.class);
        }
        return ApiReturn.of(service.deleteBy(wrapper.getReturnExpression()));
    }
}