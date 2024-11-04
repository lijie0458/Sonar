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
import com.dogfood.aa20240808.domain.entities.SupplierDetailsEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.SupplierDetailsEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate SupplierDetailsEntity controller
*
* @author sys
*/
@RestController
public class SupplierDetailsEntityController {
    @Resource
    private SupplierDetailsEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "57d9a76a-bcdb-43d0-bfa2-5f4b98eb7152",rules = { @ValidationRule(value = "required",targetName = "body.supplier_name",argvs = ""),@ValidationRule(value = "pattern",targetName = "body.supplier_name",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "maxLength",targetName = "body.credit_code",argvs = "{\"max\":18}")}),@ValidationRuleGroup(value = "914c37a3-7105-4a13-ac1e-203270ebdb8f",rules = { })})
    @PostMapping("/api/supplier-details")
    public ApiReturn<SupplierDetailsEntity> create(@RequestBody SupplierDetailsEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "3f03a2c0-ee80-42d5-89bb-66d7ca08339c",rules = { @ValidationRule(value = "required",targetName = "filter.entity.supplier_name",argvs = ""),@ValidationRule(value = "pattern",targetName = "filter.entity.supplier_name",argvs = "{\"re\":\".*[\\\\u4e00-\\\\u9fa5].*\",\"strict\":false,\"matchCase\":true}"),@ValidationRule(value = "maxLength",targetName = "filter.entity.credit_code",argvs = "{\"max\":18}")}),@ValidationRuleGroup(value = "06feeee0-152c-45e0-a4f6-5f1301df3165",rules = { })})
    @PutMapping("/api/supplier-details")
    public ApiReturn<SupplierDetailsEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        SupplierDetailsEntity entity = JacksonUtils.fromJson(map, SupplierDetailsEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "a227e7b6-9317-4da9-b5e1-e72807ffee1c",rules = { })})
    @DeleteMapping("/api/supplier-details")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "95428fabba8d4cd08bf6ebd859702141",rules = { }),@ValidationRuleGroup(value = "1df89e6d-ffba-4ec0-9189-1705f8c47be0",rules = { @ValidationRule(value = "required",targetName = "id",argvs = "")}),@ValidationRuleGroup(value = "9c87e08b1040447ca18dbfbc8066b05e",rules = { }),@ValidationRuleGroup(value = "6df4a519-b4f0-4da2-bcae-3268be414451",rules = { }),@ValidationRuleGroup(value = "3d49d0652b8f4ab1b927bff0d22bfa50",rules = { @ValidationRule(value = "required",targetName = "id",argvs = "")})})
    @GetMapping("/api/supplier-details")
    public ApiReturn<SupplierDetailsEntity> get( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.get( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/supplier-details/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}