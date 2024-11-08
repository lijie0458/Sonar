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
import com.dogfood.aa20240808.domain.entities.ModuleTableEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.ModuleTableEntityService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate ModuleTableEntity controller
*
* @author sys
*/
@RestController
public class ModuleTableEntityController {
    @Resource
    private ModuleTableEntityService service;



    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "fe83794e-888c-4561-a983-386e1f5fa408",rules = { })})
    @DeleteMapping("/api/module-table")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/module-table/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

    /**
    * auto gen createOrUpdate method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "d343e9ae-a4e8-4201-a8b3-59d73924584a",rules = { })})
    @PostMapping("/api/module-table/createOrUpdate")
    public ApiReturn<ModuleTableEntity> createOrUpdate(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        ModuleTableEntity entity = JacksonUtils.fromJson(map, ModuleTableEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.createOrUpdate(entity, updateFields));
    }

}