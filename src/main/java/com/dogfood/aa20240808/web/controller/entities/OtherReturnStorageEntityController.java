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
import com.dogfood.aa20240808.domain.entities.OtherReturnStorageEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.OtherReturnStorageEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate OtherReturnStorageEntity controller
*
* @author sys
*/
@RestController
public class OtherReturnStorageEntityController {
    @Resource
    private OtherReturnStorageEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "33ab9698-666d-472f-9912-f32beb431d5a",rules = { })})
    @PostMapping("/api/other-return-storage")
    public ApiReturn<OtherReturnStorageEntity> create(@RequestBody OtherReturnStorageEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "b3a6fafa-07ed-42d4-910e-20b123006b1c",rules = { }),@ValidationRuleGroup(value = "26708c71-638f-4563-8565-ba67e2d084ab",rules = { }),@ValidationRuleGroup(value = "51450979-ec81-4eae-8e6e-c358ff71f356",rules = { })})
    @PutMapping("/api/other-return-storage")
    public ApiReturn<OtherReturnStorageEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        OtherReturnStorageEntity entity = JacksonUtils.fromJson(map, OtherReturnStorageEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "a317e62a-ba81-44e6-876f-f53882d623b3",rules = { })})
    @DeleteMapping("/api/other-return-storage")
    public ApiReturn<Long> delete( @RequestParam(required = true) String returnCode ) { 
        return ApiReturn.of(service.delete( returnCode )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/other-return-storage/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}