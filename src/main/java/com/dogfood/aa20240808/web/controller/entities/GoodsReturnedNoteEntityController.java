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
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.GoodsReturnedNoteEntityService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate GoodsReturnedNoteEntity controller
*
* @author sys
*/
@RestController
public class GoodsReturnedNoteEntityController {
    @Resource
    private GoodsReturnedNoteEntityService service;


    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "aa7183f5f0e24e4eb3cad43ba84ad4eb",rules = { }),@ValidationRuleGroup(value = "aae56b69-c7bc-422f-9c0a-efb4ff99a9df",rules = { })})
    @GetMapping("/api/goods-returned-note")
    public ApiReturn<GoodsReturnedNoteEntity> get( @RequestParam(required = true) String goodsReturnedNote ) { 
        return ApiReturn.of(service.get( goodsReturnedNote )); 
    }


    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "9a8dda4c-f45d-4500-9356-4c148c17c7e1",rules = { @ValidationRule(value = "maxLength",targetName = "body.annex",argvs = "{\"max\":4000}")}),@ValidationRuleGroup(value = "7367dfb3405646048977b02e97b780f9",rules = { })})
    @PostMapping("/api/goods-returned-note")
    public ApiReturn<GoodsReturnedNoteEntity> create(@RequestBody GoodsReturnedNoteEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "76cd9481-987c-4481-b6a6-d2e8f99ca35b",rules = { @ValidationRule(value = "maxLength",targetName = "filter.entity.annex",argvs = "{\"max\":4000}")}),@ValidationRuleGroup(value = "5c052e9dc9334d6fa8d010008db2d975",rules = { }),@ValidationRuleGroup(value = "8de3153f-e674-47c9-b360-7d7fee85ee04",rules = { }),@ValidationRuleGroup(value = "9e898f99-84f7-40d3-a72b-56778028a629",rules = { })})
    @PutMapping("/api/goods-returned-note")
    public ApiReturn<GoodsReturnedNoteEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        GoodsReturnedNoteEntity entity = JacksonUtils.fromJson(map, GoodsReturnedNoteEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/goods-returned-note/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

}