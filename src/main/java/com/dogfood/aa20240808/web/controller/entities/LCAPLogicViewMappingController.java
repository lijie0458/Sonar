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
import com.dogfood.aa20240808.domain.entities.LCAPLogicViewMapping;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.service.entities.LCAPLogicViewMappingService;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.domain.PageOf;
import com.dogfood.aa20240808.util.JacksonUtils;

/**
* auto generate LCAPLogicViewMapping controller
*
* @author sys
*/
@RestController
public class LCAPLogicViewMappingController {
    @Resource
    private LCAPLogicViewMappingService service;

    /**
    * auto gen import method
    **/
    @PostMapping("/api/l-c-a-p-logic-view-mapping/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }
}