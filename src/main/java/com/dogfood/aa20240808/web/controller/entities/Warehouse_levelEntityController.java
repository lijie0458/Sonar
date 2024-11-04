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
import com.dogfood.aa20240808.domain.entities.Warehouse_levelEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.Warehouse_levelEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate Warehouse_levelEntity controller
*
* @author sys
*/
@RestController
public class Warehouse_levelEntityController {
    @Resource
    private Warehouse_levelEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "e5cac545-cb98-43d2-b5f4-8fd5b4210daf",rules = { @ValidationRule(value = "required",targetName = "body.warehouse_name",argvs = ""),@ValidationRule(value = "pattern",targetName = "body.warehouse_name",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "required",targetName = "body.warehouse_manager",argvs = "")})})
    @PostMapping("/api/warehouse_level")
    public ApiReturn<Warehouse_levelEntity> create(@RequestBody Warehouse_levelEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "99a1b506-177b-416f-ae4d-03c99c2f0d8d",rules = { @ValidationRule(value = "required",targetName = "filter.entity.warehouse_name",argvs = ""),@ValidationRule(value = "pattern",targetName = "filter.entity.warehouse_name",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "required",targetName = "filter.entity.warehouse_manager",argvs = "")})})
    @PutMapping("/api/warehouse_level")
    public ApiReturn<Warehouse_levelEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        Warehouse_levelEntity entity = JacksonUtils.fromJson(map, Warehouse_levelEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "ca12d207062446dfa1b5f6cbdd8cb523",rules = { })})
    @DeleteMapping("/api/warehouse_level")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/warehouse_level/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}