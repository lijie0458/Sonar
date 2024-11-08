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
import com.dogfood.aa20240808.domain.entities.LCAPRolePerMapping;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.LCAPRolePerMappingService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate LCAPRolePerMapping controller
*
* @author sys
*/
@RestController
public class LCAPRolePerMappingController {
    @Resource
    private LCAPRolePerMappingService service;



    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "8407fbe0262a461c9fba53dccb1144a4",rules = { })})
    @PostMapping("/api/l-c-a-p-role-per-mapping")
    public ApiReturn<LCAPRolePerMapping> create(@RequestBody LCAPRolePerMapping body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen batch create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "a6aa16fa-4a72-480d-9433-7035f3a37326",rules = { })})
    @PostMapping("/api/l-c-a-p-role-per-mapping/batch")
    public ApiReturn<List<LCAPRolePerMapping>> batchCreate(@RequestBody List<LCAPRolePerMapping> body) {
        return ApiReturn.of(service.batchCreate(body));
    }

    /**
    * auto gen batch delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "da66a9f2-c26a-40be-a758-ba55e67ee8e2",rules = { })})
    @DeleteMapping("/api/l-c-a-p-role-per-mapping/batch")
    public ApiReturn<Long> batchDelete(@RequestBody List<Long> ids) {
        return ApiReturn.of(service.batchDelete(ids));
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/l-c-a-p-role-per-mapping/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

}