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
import com.dogfood.aa20240808.domain.entities.ProductReturnStorageEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.ProductReturnStorageEntityService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate ProductReturnStorageEntity controller
*
* @author sys
*/
@RestController
public class ProductReturnStorageEntityController {
    @Resource
    private ProductReturnStorageEntityService service;



    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "b3bc2f78075f48d2a184e6d22cea9370",rules = { })})
    @PostMapping("/api/product-return-storage")
    public ApiReturn<ProductReturnStorageEntity> create(@RequestBody ProductReturnStorageEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "112f151c-e123-4cf8-8790-51ec726134e3",rules = { }),@ValidationRuleGroup(value = "597ee13e-ae2e-4234-9448-194ceb922a83",rules = { })})
    @PutMapping("/api/product-return-storage")
    public ApiReturn<ProductReturnStorageEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        ProductReturnStorageEntity entity = JacksonUtils.fromJson(map, ProductReturnStorageEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "41356a6d-ee2a-4786-bb4b-2f665cac0445",rules = { })})
    @DeleteMapping("/api/product-return-storage")
    public ApiReturn<Long> delete( @RequestParam(required = true) String productReturnCode ) { 
        return ApiReturn.of(service.delete( productReturnCode )); 
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/product-return-storage/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

}