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
import com.dogfood.aa20240808.domain.entities.BePutInStorageEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.BePutInStorageEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate BePutInStorageEntity controller
*
* @author sys
*/
@RestController
public class BePutInStorageEntityController {
    @Resource
    private BePutInStorageEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "7ba221b8-9531-4850-84b5-75c265482fe0",rules = { @ValidationRule(value = "required",targetName = "body.warehouse",argvs = "")})})
    @PostMapping("/api/be-put-in-storage")
    public ApiReturn<BePutInStorageEntity> create(@RequestBody BePutInStorageEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "1e28857a1a2b4f969a1607ceb6fa543a",rules = { }),@ValidationRuleGroup(value = "e06a140b-f473-431c-abc6-181fc1cad85f",rules = { @ValidationRule(value = "required",targetName = "bePutInStorageId",argvs = "")})})
    @GetMapping("/api/be-put-in-storage")
    public ApiReturn<BePutInStorageEntity> get( @RequestParam(required = true) String bePutInStorageId ) { 
        return ApiReturn.of(service.get( bePutInStorageId )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/be-put-in-storage/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}