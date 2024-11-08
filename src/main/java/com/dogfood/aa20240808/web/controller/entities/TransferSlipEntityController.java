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
import com.dogfood.aa20240808.domain.entities.TransferSlipEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.TransferSlipEntityService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate TransferSlipEntity controller
*
* @author sys
*/
@RestController
public class TransferSlipEntityController {
    @Resource
    private TransferSlipEntityService service;


    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "4146c8ebd3114440b414c9d9e8e7b6f2",rules = { })})
    @GetMapping("/api/transfer-slip")
    public ApiReturn<TransferSlipEntity> get( @RequestParam(required = true) String documentNumber ) { 
        return ApiReturn.of(service.get( documentNumber )); 
    }


    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "cbb16fe7-ad1a-47c6-93fa-3d5716bbcbbe",rules = { @ValidationRule(value = "required",targetName = "body.requestDate",argvs = ""),@ValidationRule(value = "required",targetName = "body.shippingClerk",argvs = ""),@ValidationRule(value = "required",targetName = "body.inspector",argvs = ""),@ValidationRule(value = "maxLength",targetName = "body.summary",argvs = "{\"max\":4000}")})})
    @PostMapping("/api/transfer-slip")
    public ApiReturn<TransferSlipEntity> create(@RequestBody TransferSlipEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "e6dea747-1af5-4809-9025-a2bd45f4d0d8",rules = { }),@ValidationRuleGroup(value = "5cd6a84e-11a3-4ea3-b50f-b1607774fcf5",rules = { @ValidationRule(value = "required",targetName = "filter.entity.requestDate",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.shippingClerk",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.inspector",argvs = ""),@ValidationRule(value = "maxLength",targetName = "filter.entity.summary",argvs = "{\"max\":4000}")}),@ValidationRuleGroup(value = "52049b82-d66f-4189-a40f-344d1c9ae39d",rules = { })})
    @PutMapping("/api/transfer-slip")
    public ApiReturn<TransferSlipEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        TransferSlipEntity entity = JacksonUtils.fromJson(map, TransferSlipEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "3dce2d87-0d6b-4edb-8abc-cce910b0b896",rules = { })})
    @DeleteMapping("/api/transfer-slip")
    public ApiReturn<Long> delete( @RequestParam(required = true) String documentNumber ) { 
        return ApiReturn.of(service.delete( documentNumber )); 
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/transfer-slip/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

}