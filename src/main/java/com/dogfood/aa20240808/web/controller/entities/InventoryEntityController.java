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
import com.dogfood.aa20240808.domain.entities.InventoryEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.InventoryEntityService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate InventoryEntity controller
*
* @author sys
*/
@RestController
public class InventoryEntityController {
    @Resource
    private InventoryEntityService service;


    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "cddbc797-e73f-4c54-a0f3-ee878610765c",rules = { }),@ValidationRuleGroup(value = "28306f265d914f21972a09945db1a2a0",rules = { }),@ValidationRuleGroup(value = "6ed23241a50240599f77138fde1e0854",rules = { }),@ValidationRuleGroup(value = "34117b97-3dd9-4de9-a13f-a1b055d3c517",rules = { }),@ValidationRuleGroup(value = "fc724964-dd45-4e7d-a3cc-241724650a43",rules = { }),@ValidationRuleGroup(value = "9f1744a9-8bb3-44d6-aefb-1967266cceaf",rules = { }),@ValidationRuleGroup(value = "33bce120-93a3-41f3-afd2-ceea143a9009",rules = { }),@ValidationRuleGroup(value = "f046a5dc-1e52-4e18-935b-9b058a1ae7bf",rules = { @ValidationRule(value = "required",targetName = "id",argvs = "")}),@ValidationRuleGroup(value = "bbd3719131ca437ebfc85e7c51797745",rules = { })})
    @GetMapping("/api/inventory")
    public ApiReturn<InventoryEntity> get( @RequestParam(required = true) Long id ) { 
        return ApiReturn.of(service.get( id )); 
    }


    /**
    * auto gen batch create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "65f9b769-5f1c-48a4-b603-51ccca5d52f7",rules = { }),@ValidationRuleGroup(value = "92e2e519d68a488085d957f9fe77c9b8",rules = { }),@ValidationRuleGroup(value = "0c01b783-918f-4e33-85cc-2ad2f9caf0f3",rules = { }),@ValidationRuleGroup(value = "76c30649-65a1-4eab-91ac-3678ce40db38",rules = { })})
    @PostMapping("/api/inventory/batch")
    public ApiReturn<List<InventoryEntity>> batchCreate(@RequestBody List<InventoryEntity> body) {
        return ApiReturn.of(service.batchCreate(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "2a3bb7e4-46c2-4ec0-8ec7-81e88aa22947",rules = { }),@ValidationRuleGroup(value = "f6e844723d8d4f64aac602ae75cfcda2",rules = { }),@ValidationRuleGroup(value = "e691eaed-ee3e-4175-80c0-c82191f69291",rules = { })})
    @PutMapping("/api/inventory")
    public ApiReturn<InventoryEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        InventoryEntity entity = JacksonUtils.fromJson(map, InventoryEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen batch update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "16cc8a28-9bff-480b-a99a-78aa942fe96b",rules = { }),@ValidationRuleGroup(value = "62866a21-2952-4a84-b57e-3a56d1344df2",rules = { }),@ValidationRuleGroup(value = "363b4c17-93e4-4183-b6df-b58a091fc318",rules = { }),@ValidationRuleGroup(value = "1c794f6e-cd3c-4625-9f08-2a300208549d",rules = { }),@ValidationRuleGroup(value = "f0fbf59cc822402692d2067e149b30e8",rules = { }),@ValidationRuleGroup(value = "86d93126-362c-41cf-83c5-e96cc86d464f",rules = { }),@ValidationRuleGroup(value = "242dd6571eef409cb77f85e7236aef90",rules = { }),@ValidationRuleGroup(value = "5c8c8e984d9648e08349380033a09763",rules = { }),@ValidationRuleGroup(value = "ba2f3fe8c6544caab207d0b747d6cb77",rules = { }),@ValidationRuleGroup(value = "755be8220525484686fb984132edcdcf",rules = { }),@ValidationRuleGroup(value = "2d03911d-6b28-4983-98d8-df8739722cf1",rules = { }),@ValidationRuleGroup(value = "3152a1de-ac6f-47fa-8142-335889424ab0",rules = { })})
    @PutMapping("/api/inventory/batch")
    public ApiReturn<List<InventoryEntity>> batchUpdate(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntities() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        List<String> updateFields = filter.getProperties();
        List<InventoryEntity> entities = new ArrayList<>();
        for (Map map : filter.getEntities()) {
            entities.add(JacksonUtils.fromJson(map, InventoryEntity.class));
        }
        return ApiReturn.of(service.batchUpdate(entities, updateFields));
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/inventory/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

    /**
    * auto gen deleteBy method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "524d1b96f88c4353a10bd9cba51b224c",rules = { }),@ValidationRuleGroup(value = "be23a396-e87f-4f7f-972f-b9c6a22cb525",rules = { }),@ValidationRuleGroup(value = "037a677e-69f7-4660-b9fd-f57d82226ef7",rules = { })})
    @DeleteMapping("/api/inventory/by")
    public ApiReturn<Long> deleteBy(@RequestBody FilterWrapper wrapper) {
        if (wrapper == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, InventoryEntity.class);
        }
        return ApiReturn.of(service.deleteBy(wrapper.getReturnExpression()));
    }

}