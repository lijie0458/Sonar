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
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.MaterialDetailsEntityService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate MaterialDetailsEntity controller
*
* @author sys
*/
@RestController
public class MaterialDetailsEntityController {
    @Resource
    private MaterialDetailsEntityService service;


    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "a79c705a-4e2c-4ec7-852e-06a01f690a2a",rules = { }),@ValidationRuleGroup(value = "de97ebd0-cbd4-4579-ae19-8612fc6d68f7",rules = { }),@ValidationRuleGroup(value = "720d7383-6af6-4901-b51f-02b30e8fd7d8",rules = { }),@ValidationRuleGroup(value = "0676776648f044e08520a9367fa555e7",rules = { }),@ValidationRuleGroup(value = "604baccc-766d-4938-9d08-fe27713f981b",rules = { }),@ValidationRuleGroup(value = "105ad009-103c-405b-9928-05537e40cbb6",rules = { }),@ValidationRuleGroup(value = "5b4f27e7-1d76-459d-9c12-3b6c72901f5e",rules = { }),@ValidationRuleGroup(value = "8e49c4c1-5d46-4ae4-ad58-bf6ff71b82ea",rules = { }),@ValidationRuleGroup(value = "3f5b3aeb71ec4fcd90931fbcad93bff2",rules = { }),@ValidationRuleGroup(value = "b47ed945d5db40838e0de8da8c33e984",rules = { }),@ValidationRuleGroup(value = "46fab36d-ed93-4dc7-acb6-b2f75d7cf86f",rules = { }),@ValidationRuleGroup(value = "45a12b49-5352-4174-8ab3-dfd13114810f",rules = { }),@ValidationRuleGroup(value = "5bf183c0-3d0c-4025-9ecb-f9ab74b3da90",rules = { }),@ValidationRuleGroup(value = "4eeac257-cfe4-42b1-abd5-ace63f234a62",rules = { })})
    @GetMapping("/api/material-details")
    public ApiReturn<MaterialDetailsEntity> get( @RequestParam(required = true) String materialCode ) { 
        return ApiReturn.of(service.get( materialCode )); 
    }


    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "6b0c28ff-2700-4695-a43e-f9c4e1a184df",rules = { @ValidationRule(value = "filled",targetName = "body.material_name",argvs = ""),@ValidationRule(value = "pattern",targetName = "body.material_name",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "filled",targetName = "body.category_id",argvs = ""),@ValidationRule(value = "required",targetName = "body.specification",argvs = ""),@ValidationRule(value = "required",targetName = "body.unit",argvs = "")})})
    @PostMapping("/api/material-details")
    public ApiReturn<MaterialDetailsEntity> create(@RequestBody MaterialDetailsEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "663c774f-1bfd-41df-af25-08aa89c16108",rules = { @ValidationRule(value = "filled",targetName = "filter.entity.material_name",argvs = ""),@ValidationRule(value = "pattern",targetName = "filter.entity.material_name",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "filled",targetName = "filter.entity.category_id",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.specification",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.unit",argvs = "")})})
    @PutMapping("/api/material-details")
    public ApiReturn<MaterialDetailsEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        MaterialDetailsEntity entity = JacksonUtils.fromJson(map, MaterialDetailsEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "5b83a77a-8857-4fbd-b136-883cb411212c",rules = { })})
    @DeleteMapping("/api/material-details")
    public ApiReturn<Long> delete( @RequestParam(required = true) String materialCode ) { 
        return ApiReturn.of(service.delete( materialCode )); 
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/material-details/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

}