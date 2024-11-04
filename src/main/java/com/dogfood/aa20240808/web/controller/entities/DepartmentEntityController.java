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
import com.dogfood.aa20240808.domain.entities.DepartmentEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.DepartmentEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate DepartmentEntity controller
*
* @author sys
*/
@RestController
public class DepartmentEntityController {
    @Resource
    private DepartmentEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "99bd5a77-72fc-46cd-aec1-6f2df482eaf6",rules = { @ValidationRule(value = "required",targetName = "body.department_Name",argvs = ""),@ValidationRule(value = "required",targetName = "body.parent_id",argvs = "")})})
    @PostMapping("/api/department")
    public ApiReturn<DepartmentEntity> create(@RequestBody DepartmentEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "cc353ecc-b42e-4ad1-9352-d49fd49222ad",rules = { @ValidationRule(value = "required",targetName = "filter.entity.department_Name",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.parent_id",argvs = "")})})
    @PutMapping("/api/department")
    public ApiReturn<DepartmentEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        DepartmentEntity entity = JacksonUtils.fromJson(map, DepartmentEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "f4ff2e70-78ff-48b5-aed1-202da2921240",rules = { })})
    @DeleteMapping("/api/department")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }

    /**
    * auto gen batch delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "c4dfe155b0d24e5fbf7b7f8b12f930d2",rules = { })})
    @DeleteMapping("/api/department/batch")
    public ApiReturn<Long> batchDelete(@RequestBody List<Long> ids) {
        return ApiReturn.of(service.batchDelete(ids));
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "1b02de3d-c962-4b11-b7a0-65c8b4c773cb",rules = { }),@ValidationRuleGroup(value = "0546fd9a-8628-470f-addb-155e16be0be0",rules = { }),@ValidationRuleGroup(value = "20ad773596c047d2a3afe64cba63dc75",rules = { }),@ValidationRuleGroup(value = "10d9bb5e-f8f8-4e7c-9b20-9630350a8658",rules = { }),@ValidationRuleGroup(value = "f9015418487a4a109f58e052d6892bb6",rules = { }),@ValidationRuleGroup(value = "5bb61c898b7a4678b8dcf7421a446e69",rules = { }),@ValidationRuleGroup(value = "e9164017-39f8-4d71-9ece-1dc4abcdf153",rules = { }),@ValidationRuleGroup(value = "d1b87bfbcb654dd78c2f382917605593",rules = { }),@ValidationRuleGroup(value = "f50dec4c916845858e4a70f2d7874f43",rules = { }),@ValidationRuleGroup(value = "77e21adf-cb82-4103-8980-58f5cc80a721",rules = { })})
    @GetMapping("/api/department")
    public ApiReturn<DepartmentEntity> get( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.get( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/department/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}