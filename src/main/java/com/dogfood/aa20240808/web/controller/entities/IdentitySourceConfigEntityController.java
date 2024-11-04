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
import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.IdentitySourceConfigEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate IdentitySourceConfigEntity controller
*
* @author sys
*/
@RestController
public class IdentitySourceConfigEntityController {
    @Resource
    private IdentitySourceConfigEntityService service;

    /**
    * auto gen batch update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "d49602ae-401e-485a-b4e0-bfc529cbdce4",rules = { })})
    @PutMapping("/api/identity-source-config/batch")
    public ApiReturn<List<IdentitySourceConfigEntity>> batchUpdate(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntities() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        List<String> updateFields = filter.getProperties();
        List<IdentitySourceConfigEntity> entities = new ArrayList<>();
        for (Map map : filter.getEntities()) {
            entities.add(JacksonUtils.fromJson(map, IdentitySourceConfigEntity.class));
        }
        return ApiReturn.of(service.batchUpdate(entities, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "1829f1fd-d478-421a-9c2b-a9fad8dd5d87",rules = { }),@ValidationRuleGroup(value = "248cf6e4-018c-48d3-8a82-c161f07d7215",rules = { })})
    @DeleteMapping("/api/identity-source-config")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "4c974c68-d45a-4f23-a068-6235d4bc6f2d",rules = { }),@ValidationRuleGroup(value = "29f6d981-ded4-4ad0-96c5-76b2caea57c5",rules = { }),@ValidationRuleGroup(value = "fbf47601-8133-461e-a32c-52e9359c91eb",rules = { }),@ValidationRuleGroup(value = "f78c0078-3c0c-4309-aeba-d1d43b288983",rules = { })})
    @GetMapping("/api/identity-source-config")
    public ApiReturn<IdentitySourceConfigEntity> get( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.get( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/identity-source-config/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}