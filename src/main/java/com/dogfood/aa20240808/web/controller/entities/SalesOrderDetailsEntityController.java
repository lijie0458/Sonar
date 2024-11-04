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
import com.dogfood.aa20240808.domain.entities.SalesOrderDetailsEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.SalesOrderDetailsEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate SalesOrderDetailsEntity controller
*
* @author sys
*/
@RestController
public class SalesOrderDetailsEntityController {
    @Resource
    private SalesOrderDetailsEntityService service;

    /**
    * auto gen batch create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "60d53f0fb22e423d85b51bc06f483cd5",rules = { }),@ValidationRuleGroup(value = "07f966bf0eaf4760b7f4b897b077cdb8",rules = { }),@ValidationRuleGroup(value = "923bda27c3a848a4948d7ffdd4f94a37",rules = { }),@ValidationRuleGroup(value = "8df07d4a8ff743438502f531b73ae882",rules = { })})
    @PostMapping("/api/sales-order-details/batch")
    public ApiReturn<List<SalesOrderDetailsEntity>> batchCreate(@RequestBody List<SalesOrderDetailsEntity> body) {
        return ApiReturn.of(service.batchCreate(body));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "620147c4-6961-4d0d-b586-f35ebede326b",rules = { }),@ValidationRuleGroup(value = "776065f04b214da6b009e150b44fa29a",rules = { }),@ValidationRuleGroup(value = "43da40aa-2632-4744-9e49-4c173799cfb0",rules = { }),@ValidationRuleGroup(value = "c5143cf291b6424aa101ec6419a89959",rules = { })})
    @DeleteMapping("/api/sales-order-details")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/sales-order-details/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

    /**
    * auto gen deleteBy method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "f9cc532b1fa3410fb2405e331f9977ed",rules = { }),@ValidationRuleGroup(value = "7d75c604-1258-41a1-812a-32321b029006",rules = { }),@ValidationRuleGroup(value = "69a44d55-e66a-4280-ac9c-9bd2d8acbcb8",rules = { }),@ValidationRuleGroup(value = "c3b6d0b18c904d73995fb362ca20e90c",rules = { }),@ValidationRuleGroup(value = "39e10e9cab584943a68cd6959cad3aec",rules = { }),@ValidationRuleGroup(value = "90a20ef497754faea187f1fdc977833b",rules = { })})
    @DeleteMapping("/api/sales-order-details/by")
    public ApiReturn<Long> deleteBy(@RequestBody FilterWrapper wrapper) {
        if (wrapper == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, SalesOrderDetailsEntity.class);
        }
        return ApiReturn.of(service.deleteBy(wrapper.getReturnExpression()));
    }
}