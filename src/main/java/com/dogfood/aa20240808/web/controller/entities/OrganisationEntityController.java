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
import com.dogfood.aa20240808.domain.entities.OrganisationEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.OrganisationEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate OrganisationEntity controller
*
* @author sys
*/
@RestController
public class OrganisationEntityController {
    @Resource
    private OrganisationEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "ff1d9fc0-18c5-44ce-9627-0546418a7ac8",rules = { })})
    @PostMapping("/api/organisation")
    public ApiReturn<OrganisationEntity> create(@RequestBody OrganisationEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "0640d5e2-74f8-4a4f-a9cc-c7d5e34bbccd",rules = { }),@ValidationRuleGroup(value = "6055bf4c-f0d0-4c60-9bb5-b7eda59a9259",rules = { }),@ValidationRuleGroup(value = "4ecf274d-9347-4795-8d20-308da56cc28f",rules = { })})
    @PutMapping("/api/organisation")
    public ApiReturn<OrganisationEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        OrganisationEntity entity = JacksonUtils.fromJson(map, OrganisationEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "9d3cf77e-08b6-48de-bfef-541522224104",rules = { })})
    @DeleteMapping("/api/organisation")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "e17f854c-84c3-4473-a168-61a9f2296fa2",rules = { }),@ValidationRuleGroup(value = "332f045e-314f-425c-915c-27a32f8ba018",rules = { }),@ValidationRuleGroup(value = "253106d7-2883-4d8e-bb27-e04b88f21ea3",rules = { }),@ValidationRuleGroup(value = "1ce352b4-ef16-464a-80d8-74c44c4ee1c5",rules = { }),@ValidationRuleGroup(value = "5c10f345-c605-4633-96e8-c1621ec70ced",rules = { })})
    @GetMapping("/api/organisation")
    public ApiReturn<OrganisationEntity> get( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.get( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/organisation/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}