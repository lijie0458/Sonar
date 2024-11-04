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
import com.dogfood.aa20240808.domain.entities.MaterialEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.MaterialEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate MaterialEntity controller
*
* @author sys
*/
@RestController
public class MaterialEntityController {
    @Resource
    private MaterialEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "8e53db33721345c1bb6bd5801ebce6a5",rules = { @ValidationRule(value = "required",targetName = "body.category_name",argvs = ""),@ValidationRule(value = "pattern",targetName = "body.category_name",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "required",targetName = "body.category_code",argvs = ""),@ValidationRule(value = "^az09-$",targetName = "body.category_code",argvs = ""),@ValidationRule(value = "required",targetName = "body.parent_category_id",argvs = ""),@ValidationRule(value = "required",targetName = "body.parent_category_id",argvs = "")})})
    @PostMapping("/api/material")
    public ApiReturn<MaterialEntity> create(@RequestBody MaterialEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "fae3cdfff1804fdcaf2fb2f67c3ffa9f",rules = { @ValidationRule(value = "required",targetName = "filter.entity.category_name",argvs = ""),@ValidationRule(value = "pattern",targetName = "filter.entity.category_name",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "required",targetName = "filter.entity.category_code",argvs = ""),@ValidationRule(value = "^az09-$",targetName = "filter.entity.category_code",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.parent_category_id",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.parent_category_id",argvs = "")})})
    @PutMapping("/api/material")
    public ApiReturn<MaterialEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        MaterialEntity entity = JacksonUtils.fromJson(map, MaterialEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen batch delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "ee0dff1cb95a49b4bdcaafcd00161faf",rules = { }),@ValidationRuleGroup(value = "d3d7d0b73e274683baaf2c464669907a",rules = { })})
    @DeleteMapping("/api/material/batch")
    public ApiReturn<Long> batchDelete(@RequestBody List<Long> ids) {
        return ApiReturn.of(service.batchDelete(ids));
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "98aee190-dff2-49cb-8bcd-4c217a9839ae",rules = { @ValidationRule(value = "filled",targetName = "id",argvs = "")}),@ValidationRuleGroup(value = "1b7a87398c2a49e0b00df43ce92dad9f",rules = { })})
    @GetMapping("/api/material")
    public ApiReturn<MaterialEntity> get( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.get( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/material/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}