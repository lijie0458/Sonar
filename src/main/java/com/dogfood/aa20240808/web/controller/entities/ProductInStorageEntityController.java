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
import com.dogfood.aa20240808.domain.entities.ProductInStorageEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.ProductInStorageEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate ProductInStorageEntity controller
*
* @author sys
*/
@RestController
public class ProductInStorageEntityController {
    @Resource
    private ProductInStorageEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "2a5c472b465b4744898e371950930dc0",rules = { @ValidationRule(value = "filled",targetName = "body.applyDate",argvs = "")})})
    @PostMapping("/api/product-in-storage")
    public ApiReturn<ProductInStorageEntity> create(@RequestBody ProductInStorageEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "57d3bc1ebf4c4a38af44c8804f274858",rules = { }),@ValidationRuleGroup(value = "dd4aa7da68864345bf1bd2535f56df80",rules = { }),@ValidationRuleGroup(value = "9ce4dd647f294d5593eb33562fb1f1ae",rules = { @ValidationRule(value = "filled",targetName = "filter.entity.applyDate",argvs = "")})})
    @PutMapping("/api/product-in-storage")
    public ApiReturn<ProductInStorageEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        ProductInStorageEntity entity = JacksonUtils.fromJson(map, ProductInStorageEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "a1fb2c21303d493980f24d2d3ea51e4a",rules = { })})
    @DeleteMapping("/api/product-in-storage")
    public ApiReturn<Long> delete( @RequestParam(required = true) String num ) { 
        return ApiReturn.of(service.delete( num )); 
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "205b62c525844ca68ff6f4e1d8f051cf",rules = { })})
    @GetMapping("/api/product-in-storage")
    public ApiReturn<ProductInStorageEntity> get( @RequestParam(required = true) String num ) { 
        return ApiReturn.of(service.get( num )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/product-in-storage/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}