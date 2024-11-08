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
import com.dogfood.aa20240808.domain.entities.LCAPUser;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.LCAPUserService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate LCAPUser controller
*
* @author sys
*/
@RestController
public class LCAPUserController {
    @Resource
    private LCAPUserService service;


    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "44f1c0bb-4915-4bc2-9e03-cf731d9acf8a",rules = { }),@ValidationRuleGroup(value = "9c4f27f1-d320-468b-a9c7-c8e0833ef4ab",rules = { }),@ValidationRuleGroup(value = "ef9073fb0def4b7ebce3a19d26491d10",rules = { }),@ValidationRuleGroup(value = "ebca6fb1-599b-44ab-b97b-808eb3e97115",rules = { }),@ValidationRuleGroup(value = "7bab8f534d1546c698685ef7b65c6504",rules = { }),@ValidationRuleGroup(value = "25bf0e0d-daf7-470b-b64d-80439dbfcaaa",rules = { }),@ValidationRuleGroup(value = "b7cb53db-eebd-46ca-a884-42c940873159",rules = { }),@ValidationRuleGroup(value = "7623d8b1-3cd9-41ef-b18e-d4375854d262",rules = { }),@ValidationRuleGroup(value = "4c7cf51effd84e17b9d583674c2a5f7b",rules = { }),@ValidationRuleGroup(value = "4d4da81d7f0849578570a5298dc5e9f7",rules = { })})
    @GetMapping("/api/l-c-a-p-user")
    public ApiReturn<LCAPUser> get( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.get( id )); 
    }


    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "775e97be796b4929aea9b35397f50854",rules = { @ValidationRule(value = "mobile",targetName = "body.phone",argvs = "{\"locale\":\"zh-CN\",\"strict\":null}"),@ValidationRule(value = "email",targetName = "body.email",argvs = "")}),@ValidationRuleGroup(value = "0d926f66-916a-43fa-bd10-40e25190db8e",rules = { @ValidationRule(value = "mobile",targetName = "body.phone",argvs = "{\"locale\":\"zh-CN\",\"strict\":null}"),@ValidationRule(value = "email",targetName = "body.email",argvs = "")})})
    @PostMapping("/api/l-c-a-p-user")
    public ApiReturn<LCAPUser> create(@RequestBody LCAPUser body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "5df1a5a311194375b72f306efa773e16",rules = { }),@ValidationRuleGroup(value = "7941fbd4-4e5c-4c79-ae29-1383629e71b4",rules = { }),@ValidationRuleGroup(value = "6fd6deca1ba74926a27e76bb2d319250",rules = { @ValidationRule(value = "mobile",targetName = "filter.entity.phone",argvs = "{\"locale\":\"zh-CN\",\"strict\":null}"),@ValidationRule(value = "email",targetName = "filter.entity.email",argvs = "")}),@ValidationRuleGroup(value = "83ef02bb507343c2b665ac94c20fe0af",rules = { }),@ValidationRuleGroup(value = "a8022786-b4b2-4a50-9c78-02660a9a840b",rules = { }),@ValidationRuleGroup(value = "642b04b0-9c3c-48f7-876a-fe13e22b3d27",rules = { }),@ValidationRuleGroup(value = "f6e056f0-3790-4570-a0cb-0bbfac8b4457",rules = { }),@ValidationRuleGroup(value = "8ab11158-7cbf-4a7b-97cd-2846bec005b1",rules = { @ValidationRule(value = "mobile",targetName = "filter.entity.phone",argvs = "{\"locale\":\"zh-CN\",\"strict\":null}"),@ValidationRule(value = "email",targetName = "filter.entity.email",argvs = "")})})
    @PutMapping("/api/l-c-a-p-user")
    public ApiReturn<LCAPUser> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        LCAPUser entity = JacksonUtils.fromJson(map, LCAPUser.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen batch update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "f01ccbef-d414-458d-b73e-ccb8e1c3d87a",rules = { })})
    @PutMapping("/api/l-c-a-p-user/batch")
    public ApiReturn<List<LCAPUser>> batchUpdate(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntities() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        List<String> updateFields = filter.getProperties();
        List<LCAPUser> entities = new ArrayList<>();
        for (Map map : filter.getEntities()) {
            entities.add(JacksonUtils.fromJson(map, LCAPUser.class));
        }
        return ApiReturn.of(service.batchUpdate(entities, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "d25f1b6d-fb9c-45e1-b6ce-3ee5e1107626",rules = { }),@ValidationRuleGroup(value = "6d5e5bb1b1754825ab17a119e1433fdb",rules = { }),@ValidationRuleGroup(value = "4d2e7eb0-4b92-4d0d-a0ca-f528ca816de5",rules = { })})
    @DeleteMapping("/api/l-c-a-p-user")
    public ApiReturn<Long> delete( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.delete( id )); 
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/l-c-a-p-user/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

}