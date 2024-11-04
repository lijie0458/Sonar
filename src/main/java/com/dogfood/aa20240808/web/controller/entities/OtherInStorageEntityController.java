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
import com.dogfood.aa20240808.domain.entities.OtherInStorageEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.OtherInStorageEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate OtherInStorageEntity controller
*
* @author sys
*/
@RestController
public class OtherInStorageEntityController {
    @Resource
    private OtherInStorageEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "60832874-f6be-4e1f-85f4-a0d86fccb69c",rules = { @ValidationRule(value = "filled",targetName = "body.applyDate",argvs = "")})})
    @PostMapping("/api/other-in-storage")
    public ApiReturn<OtherInStorageEntity> create(@RequestBody OtherInStorageEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "5e527ac8-f749-424c-b122-21dec76fb591",rules = { @ValidationRule(value = "filled",targetName = "filter.entity.applyDate",argvs = "")}),@ValidationRuleGroup(value = "c6e14645-728b-4ca6-adeb-5eedf0e53655",rules = { }),@ValidationRuleGroup(value = "b53cbe621de54a5bb64fdd1df4f8aab4",rules = { })})
    @PutMapping("/api/other-in-storage")
    public ApiReturn<OtherInStorageEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        OtherInStorageEntity entity = JacksonUtils.fromJson(map, OtherInStorageEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "ac0c14b7-bbaa-43b8-b632-30b8f16098db",rules = { })})
    @DeleteMapping("/api/other-in-storage")
    public ApiReturn<Long> delete( @RequestParam(required = true) String code ) { 
        return ApiReturn.of(service.delete( code )); 
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "004f0589-31cf-4b63-802f-708a61b35ec8",rules = { })})
    @GetMapping("/api/other-in-storage")
    public ApiReturn<OtherInStorageEntity> get( @RequestParam(required = true) String code ) { 
        return ApiReturn.of(service.get( code )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/other-in-storage/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}