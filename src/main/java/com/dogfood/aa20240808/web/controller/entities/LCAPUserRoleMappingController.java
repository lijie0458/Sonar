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
import com.dogfood.aa20240808.domain.entities.LCAPUserRoleMapping;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.LCAPUserRoleMappingService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate LCAPUserRoleMapping controller
*
* @author sys
*/
@RestController
public class LCAPUserRoleMappingController {
    @Resource
    private LCAPUserRoleMappingService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "04aa301b15ec4ed9bd9f05fe539456f8",rules = { }),@ValidationRuleGroup(value = "4ff4bbb303244b18b800eff5cd794405",rules = { })})
    @PostMapping("/api/l-c-a-p-user-role-mapping")
    public ApiReturn<LCAPUserRoleMapping> create(@RequestBody LCAPUserRoleMapping body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen batch create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "1ea8e4274eee48da9d2e26a27319bbd5",rules = { })})
    @PostMapping("/api/l-c-a-p-user-role-mapping/batch")
    public ApiReturn<List<LCAPUserRoleMapping>> batchCreate(@RequestBody List<LCAPUserRoleMapping> body) {
        return ApiReturn.of(service.batchCreate(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "fe5252b664ee4575ade12c4da2ba5ec6",rules = { })})
    @PutMapping("/api/l-c-a-p-user-role-mapping")
    public ApiReturn<LCAPUserRoleMapping> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        LCAPUserRoleMapping entity = JacksonUtils.fromJson(map, LCAPUserRoleMapping.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "2a447a69a8eb4507b8f6ead068196a57",rules = { }),@ValidationRuleGroup(value = "f639b13331354c5b82c034355e590564",rules = { })})
    @DeleteMapping("/api/l-c-a-p-user-role-mapping")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/l-c-a-p-user-role-mapping/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}