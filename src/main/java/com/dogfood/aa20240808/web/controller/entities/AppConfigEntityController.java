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
import com.dogfood.aa20240808.domain.entities.AppConfigEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.AppConfigEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate AppConfigEntity controller
*
* @author sys
*/
@RestController
public class AppConfigEntityController {
    @Resource
    private AppConfigEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "e4cb34e6-291b-4bcf-841b-89f13058ac5d",rules = { }),@ValidationRuleGroup(value = "bff89070-cb48-4856-bda6-fe983f7c4ba6",rules = { })})
    @PostMapping("/api/app-config")
    public ApiReturn<AppConfigEntity> create(@RequestBody AppConfigEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "8b0c4dd6-f96d-465e-8af1-0371fd51d975",rules = { }),@ValidationRuleGroup(value = "d52a45f7-05b8-4bd1-a826-862da59459a7",rules = { }),@ValidationRuleGroup(value = "4d4ab8da-1d32-4437-ae37-0fa4a0e1aea9",rules = { }),@ValidationRuleGroup(value = "963d571b-586f-48f0-a01f-bfb1848f2c1b",rules = { })})
    @PutMapping("/api/app-config")
    public ApiReturn<AppConfigEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        AppConfigEntity entity = JacksonUtils.fromJson(map, AppConfigEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/app-config/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}