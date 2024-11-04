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
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.OutsourceReturnStorageEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate OutsourceReturnStorageEntity controller
*
* @author sys
*/
@RestController
public class OutsourceReturnStorageEntityController {
    @Resource
    private OutsourceReturnStorageEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "831072b9-d54f-4494-8986-3e9784dcd826",rules = { })})
    @PostMapping("/api/outsource-return-storage")
    public ApiReturn<OutsourceReturnStorageEntity> create(@RequestBody OutsourceReturnStorageEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "19582fba-e312-4e6c-a9eb-2e0e27c5d530",rules = { }),@ValidationRuleGroup(value = "33258761-466e-4585-acc0-378bc98fce7b",rules = { }),@ValidationRuleGroup(value = "cc07f9ff-4930-4b7f-bf70-7f5a8d0dccef",rules = { })})
    @PutMapping("/api/outsource-return-storage")
    public ApiReturn<OutsourceReturnStorageEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        OutsourceReturnStorageEntity entity = JacksonUtils.fromJson(map, OutsourceReturnStorageEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "9a69e85e-4f3e-4054-8085-0c679980b0b1",rules = { })})
    @DeleteMapping("/api/outsource-return-storage")
    public ApiReturn<Long> delete( @RequestParam(required = true) String returnCode ) { 
        return ApiReturn.of(service.delete( returnCode )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/outsource-return-storage/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}