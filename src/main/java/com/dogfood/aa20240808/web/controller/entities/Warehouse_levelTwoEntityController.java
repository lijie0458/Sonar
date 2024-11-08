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
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.Warehouse_levelTwoEntityService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate Warehouse_levelTwoEntity controller
*
* @author sys
*/
@RestController
public class Warehouse_levelTwoEntityController {
    @Resource
    private Warehouse_levelTwoEntityService service;


    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "4466d662c89c4db2a0cdf0f6fbffbd07",rules = { }),@ValidationRuleGroup(value = "4b16299d-d7a9-4763-aeb8-d44c9bee1064",rules = { }),@ValidationRuleGroup(value = "47d732f4dd844849844f29ae7daa9d87",rules = { @ValidationRule(value = "required",targetName = "id",argvs = "")}),@ValidationRuleGroup(value = "2d84ccc9-afc5-47d6-ad3e-3f914c3e8153",rules = { @ValidationRule(value = "required",targetName = "id",argvs = "")})})
    @GetMapping("/api/warehouse_level-two")
    public ApiReturn<Warehouse_levelTwoEntity> get( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.get( id )); 
    }


    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "4f6bbcee-8768-4172-acc9-e9610048bc31",rules = { @ValidationRule(value = "required",targetName = "body.warehouse_code",argvs = ""),@ValidationRule(value = "required",targetName = "body.warehouse_name",argvs = ""),@ValidationRule(value = "pattern",targetName = "body.warehouse_name",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "required",targetName = "body.parent_warehouse_Id",argvs = ""),@ValidationRule(value = "required",targetName = "body.warehouse_manager",argvs = ""),@ValidationRule(value = "pattern",targetName = "body.detailedAddress",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}")})})
    @PostMapping("/api/warehouse_level-two")
    public ApiReturn<Warehouse_levelTwoEntity> create(@RequestBody Warehouse_levelTwoEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "dc679e6f-8150-4971-8ead-13ce13cfbe34",rules = { @ValidationRule(value = "required",targetName = "filter.entity.warehouse_code",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.warehouse_name",argvs = ""),@ValidationRule(value = "pattern",targetName = "filter.entity.warehouse_name",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "required",targetName = "filter.entity.parent_warehouse_Id",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.warehouse_manager",argvs = ""),@ValidationRule(value = "pattern",targetName = "filter.entity.detailedAddress",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}")})})
    @PutMapping("/api/warehouse_level-two")
    public ApiReturn<Warehouse_levelTwoEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        Warehouse_levelTwoEntity entity = JacksonUtils.fromJson(map, Warehouse_levelTwoEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "846663862440427780cd04b1484430c4",rules = { })})
    @DeleteMapping("/api/warehouse_level-two")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/warehouse_level-two/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

}