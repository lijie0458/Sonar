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
import com.dogfood.aa20240808.domain.entities.ReceivingNotificationsEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.ReceivingNotificationsEntityService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate ReceivingNotificationsEntity controller
*
* @author sys
*/
@RestController
public class ReceivingNotificationsEntityController {
    @Resource
    private ReceivingNotificationsEntityService service;

    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "a225a2f6-9c60-4086-98c5-8b2da447e48e",rules = { })})
    @PostMapping("/api/receiving-notifications")
    public ApiReturn<ReceivingNotificationsEntity> create(@RequestBody ReceivingNotificationsEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "6c2d0e87-3b96-42b7-b939-3e7d772035f9",rules = { }),@ValidationRuleGroup(value = "e3ca14f89ae54f83bf33669de2ef957f",rules = { })})
    @GetMapping("/api/receiving-notifications")
    public ApiReturn<ReceivingNotificationsEntity> get( @RequestParam(required = true) String notificationId ) { 
        return ApiReturn.of(service.get( notificationId )); 
    }

    /**
    * auto gen import method
    **/
    @PostMapping("/api/receiving-notifications/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}