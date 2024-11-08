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
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.MeasuringUnitEntityService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate MeasuringUnitEntity controller
*
* @author sys
*/
@RestController
public class MeasuringUnitEntityController {
    @Resource
    private MeasuringUnitEntityService service;


    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "1154b596-5e39-4ee4-a66b-5a8f22b312e5",rules = { }),@ValidationRuleGroup(value = "8d35ed813df44b6d8816cbd5af647419",rules = { }),@ValidationRuleGroup(value = "a46743e7-7b12-4f10-ab6e-ed42f64687d5",rules = { }),@ValidationRuleGroup(value = "711ce533-4067-452a-b929-b05e08cf76ed",rules = { }),@ValidationRuleGroup(value = "01870b16-8560-46a6-a367-a611d4112be3",rules = { }),@ValidationRuleGroup(value = "984bd96a-1121-40c9-9312-6ca2903a992d",rules = { }),@ValidationRuleGroup(value = "903c81a71dd54c3d940bd7781800e03a",rules = { }),@ValidationRuleGroup(value = "72c40efc-9237-4f0c-b686-56d8bc1aa848",rules = { }),@ValidationRuleGroup(value = "1555d80b-8cd4-4be7-a16d-0173e895bdc2",rules = { }),@ValidationRuleGroup(value = "689fd06f-a7c7-45b3-8a06-3318362fe426",rules = { }),@ValidationRuleGroup(value = "59a08c927ad0486d8b75dd7cc04ad55d",rules = { }),@ValidationRuleGroup(value = "657eceb9-2cfb-4183-930e-67cca3ba8e4f",rules = { }),@ValidationRuleGroup(value = "0f195294-c925-40e9-805a-20b83326c124",rules = { }),@ValidationRuleGroup(value = "e5704775-380f-4143-9ac0-103fe4ff722b",rules = { })})
    @GetMapping("/api/measuring-unit")
    public ApiReturn<MeasuringUnitEntity> get( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.get( id )); 
    }


    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "dff162f6-db24-4f2a-8346-b81ca1b42a4a",rules = { @ValidationRule(value = "required",targetName = "body.unitCode",argvs = ""),@ValidationRule(value = "^azAZ09-_$",targetName = "body.unitCode",argvs = ""),@ValidationRule(value = "^azAZ09",targetName = "body.unitCode",argvs = ""),@ValidationRule(value = "required",targetName = "body.unitName",argvs = ""),@ValidationRule(value = "pattern",targetName = "body.unitName",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}")})})
    @PostMapping("/api/measuring-unit")
    public ApiReturn<MeasuringUnitEntity> create(@RequestBody MeasuringUnitEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "ff61c63a-242e-45c2-8818-f50950327e41",rules = { @ValidationRule(value = "required",targetName = "filter.entity.unitCode",argvs = ""),@ValidationRule(value = "^azAZ09-_$",targetName = "filter.entity.unitCode",argvs = ""),@ValidationRule(value = "^azAZ09",targetName = "filter.entity.unitCode",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.unitName",argvs = ""),@ValidationRule(value = "pattern",targetName = "filter.entity.unitName",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}")})})
    @PutMapping("/api/measuring-unit")
    public ApiReturn<MeasuringUnitEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        MeasuringUnitEntity entity = JacksonUtils.fromJson(map, MeasuringUnitEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "c35dc95dfe424876a10f3ab5789e1801",rules = { })})
    @DeleteMapping("/api/measuring-unit")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/measuring-unit/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

}