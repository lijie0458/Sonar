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
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageDetailsEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.OutsourceInStorageDetailsEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate OutsourceInStorageDetailsEntity controller
*
* @author sys
*/
@RestController
public class OutsourceInStorageDetailsEntityController {
    @Resource
    private OutsourceInStorageDetailsEntityService service;

    /**
    * auto gen batch create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "dff68cb3-dcc0-478c-98fb-9b44aebf9169",rules = { })})
    @PostMapping("/api/outsource-in-storage-details/batch")
    public ApiReturn<List<OutsourceInStorageDetailsEntity>> batchCreate(@RequestBody List<OutsourceInStorageDetailsEntity> body) {
        return ApiReturn.of(service.batchCreate(body));
    }

    /**
    * auto gen batch update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "92d5075e-2926-479c-a718-0e0fe03dcd9c",rules = { })})
    @PutMapping("/api/outsource-in-storage-details/batch")
    public ApiReturn<List<OutsourceInStorageDetailsEntity>> batchUpdate(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntities() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        List<String> updateFields = filter.getProperties();
        List<OutsourceInStorageDetailsEntity> entities = new ArrayList<>();
        for (Map map : filter.getEntities()) {
            entities.add(JacksonUtils.fromJson(map, OutsourceInStorageDetailsEntity.class));
        }
        return ApiReturn.of(service.batchUpdate(entities, updateFields));
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/outsource-in-storage-details/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

    /**
    * auto gen deleteBy method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "2677c154-5f6d-4752-aa4d-05c07e76b703",rules = { }),@ValidationRuleGroup(value = "2a355da8-3379-40cd-9edb-8b01d93b849d",rules = { })})
    @DeleteMapping("/api/outsource-in-storage-details/by")
    public ApiReturn<Long> deleteBy(@RequestBody FilterWrapper wrapper) {
        if (wrapper == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, OutsourceInStorageDetailsEntity.class);
        }
        return ApiReturn.of(service.deleteBy(wrapper.getReturnExpression()));
    }
}