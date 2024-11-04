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
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.OutsourceInStorageEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate OutsourceInStorageEntity controller
*
* @author sys
*/
@RestController
public class OutsourceInStorageEntityController {
    @Resource
    private OutsourceInStorageEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "5df11ebf-6e8d-435c-ae98-9e2298ad7474",rules = { @ValidationRule(value = "filled",targetName = "body.applyDate",argvs = "")})})
    @PostMapping("/api/outsource-in-storage")
    public ApiReturn<OutsourceInStorageEntity> create(@RequestBody OutsourceInStorageEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "cb125257-ece6-44cf-bbbf-bcf37f2d0fab",rules = { }),@ValidationRuleGroup(value = "9439adef-5c62-4847-bd96-4695486c2906",rules = { @ValidationRule(value = "filled",targetName = "filter.entity.applyDate",argvs = "")}),@ValidationRuleGroup(value = "db4bb3a3deec4d67a83e80b91bd1121a",rules = { })})
    @PutMapping("/api/outsource-in-storage")
    public ApiReturn<OutsourceInStorageEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        OutsourceInStorageEntity entity = JacksonUtils.fromJson(map, OutsourceInStorageEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "4f0e9110-0b03-4ed6-97a9-65eabd2c4125",rules = { })})
    @DeleteMapping("/api/outsource-in-storage")
    public ApiReturn<Long> delete( @RequestParam(required = true) String code ) { 
        return ApiReturn.of(service.delete( code )); 
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "ed5c1cd7-1b96-4ca0-b386-eeef9561d756",rules = { })})
    @GetMapping("/api/outsource-in-storage")
    public ApiReturn<OutsourceInStorageEntity> get( @RequestParam(required = true) String code ) { 
        return ApiReturn.of(service.get( code )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/outsource-in-storage/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}