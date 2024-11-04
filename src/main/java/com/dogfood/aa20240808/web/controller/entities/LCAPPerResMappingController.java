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
import com.dogfood.aa20240808.domain.entities.LCAPPerResMapping;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.LCAPPerResMappingService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate LCAPPerResMapping controller
*
* @author sys
*/
@RestController
public class LCAPPerResMappingController {
    @Resource
    private LCAPPerResMappingService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "29c4f05780e84caea6170411b333afe2",rules = { })})
    @PostMapping("/api/l-c-a-p-per-res-mapping")
    public ApiReturn<LCAPPerResMapping> create(@RequestBody LCAPPerResMapping body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen batch create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "e01b6511-dc20-42bc-b2b7-63f7f1a9596e",rules = { })})
    @PostMapping("/api/l-c-a-p-per-res-mapping/batch")
    public ApiReturn<List<LCAPPerResMapping>> batchCreate(@RequestBody List<LCAPPerResMapping> body) {
        return ApiReturn.of(service.batchCreate(body));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "8614faa5521946018e2e0320235f67fb",rules = { })})
    @DeleteMapping("/api/l-c-a-p-per-res-mapping")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }

    /**
    * auto gen batch delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "6df377c8-4cd9-4f1f-a8a7-c12d2487d27f",rules = { })})
    @DeleteMapping("/api/l-c-a-p-per-res-mapping/batch")
    public ApiReturn<Long> batchDelete(@RequestBody List<Long> ids) {
        return ApiReturn.of(service.batchDelete(ids));
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/l-c-a-p-per-res-mapping/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

    /**
    * auto gen deleteBy method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "6abf4b754bd04803b7e6484243b5d851",rules = { })})
    @DeleteMapping("/api/l-c-a-p-per-res-mapping/by")
    public ApiReturn<Long> deleteBy(@RequestBody FilterWrapper wrapper) {
        if (wrapper == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, LCAPPerResMapping.class);
        }
        return ApiReturn.of(service.deleteBy(wrapper.getReturnExpression()));
    }
}