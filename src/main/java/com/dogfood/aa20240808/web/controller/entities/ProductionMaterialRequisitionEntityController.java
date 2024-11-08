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
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import com.dogfood.aa20240808.service.dto.filters.EntityFilter;
import com.dogfood.aa20240808.service.dto.filters.FilterWrapper;
import com.dogfood.aa20240808.service.entities.ProductionMaterialRequisitionEntityService;
import com.dogfood.aa20240808.util.JacksonUtils;
import com.dogfood.aa20240808.web.ApiReturn;
import com.dogfood.aa20240808.web.validation.*;

/**
* auto generate ProductionMaterialRequisitionEntity controller
*
* @author sys
*/
@RestController
public class ProductionMaterialRequisitionEntityController {
    @Resource
    private ProductionMaterialRequisitionEntityService service;


    /**
    * auto gen get method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "9800e85f0d284f7c89bd16d215e33c17",rules = { }),@ValidationRuleGroup(value = "496a4692-09f5-4970-8a0a-45028ea4265c",rules = { }),@ValidationRuleGroup(value = "978aeb08-ebf5-4ba6-80f8-2436f8790bb1",rules = { }),@ValidationRuleGroup(value = "dab44441-72fe-45bf-87ce-dbda90748e0b",rules = { }),@ValidationRuleGroup(value = "bd5a1c77-be18-484b-81dc-d82291aebf49",rules = { }),@ValidationRuleGroup(value = "dc31bdac-bee9-424b-91f5-da3204d9c270",rules = { }),@ValidationRuleGroup(value = "f196d909-61e2-42cb-bee5-10e5195f4887",rules = { }),@ValidationRuleGroup(value = "a25aa3ef-c5e5-4a55-beba-b69b61e09dd0",rules = { })})
    @GetMapping("/api/production-material-requisition")
    public ApiReturn<ProductionMaterialRequisitionEntity> get( @RequestParam(required = true) String documentNumber ) { 
        return ApiReturn.of(service.get( documentNumber )); 
    }


    /**
    * auto gen create method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "34fa7a5e-846a-4bf4-9a11-af9992298d5e",rules = { @ValidationRule(value = "required",targetName = "body.department",argvs = ""),@ValidationRule(value = "required",targetName = "body.employee",argvs = ""),@ValidationRule(value = "required",targetName = "body.requestDate",argvs = "")}),@ValidationRuleGroup(value = "4fc81f6c-b9d5-4228-95bc-c730f282504c",rules = { @ValidationRule(value = "required",targetName = "body.department",argvs = ""),@ValidationRule(value = "required",targetName = "body.employee",argvs = ""),@ValidationRule(value = "required",targetName = "body.requestDate",argvs = "")}),@ValidationRuleGroup(value = "f438676c9dfb4cdcb6cbcf15491812ad",rules = { @ValidationRule(value = "required",targetName = "body.department",argvs = ""),@ValidationRule(value = "required",targetName = "body.employee",argvs = ""),@ValidationRule(value = "required",targetName = "body.requestDate",argvs = "")})})
    @PostMapping("/api/production-material-requisition")
    public ApiReturn<ProductionMaterialRequisitionEntity> create(@RequestBody ProductionMaterialRequisitionEntity body) {
        return ApiReturn.of(service.create(body));
    }

    /**
    * auto gen update method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "dc5076a8-30e8-445e-ae66-e40144778060",rules = { }),@ValidationRuleGroup(value = "45b5531f-5fc7-49ad-b124-e275058e6693",rules = { }),@ValidationRuleGroup(value = "031f580bfd6b41faa66fe830692a154b",rules = { @ValidationRule(value = "required",targetName = "filter.entity.department",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.employee",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.requestDate",argvs = "")}),@ValidationRuleGroup(value = "15493bc3-5718-4463-b70f-39cf67c6df40",rules = { }),@ValidationRuleGroup(value = "8b274d1b-ea95-4364-be35-115b7772f936",rules = { @ValidationRule(value = "required",targetName = "filter.entity.department",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.employee",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.requestDate",argvs = "")}),@ValidationRuleGroup(value = "a2426aed-c43c-48e5-b1a7-79e6dc7213ec",rules = { }),@ValidationRuleGroup(value = "11066335-b0f6-46a9-92a6-84117802b802",rules = { }),@ValidationRuleGroup(value = "14206c6e-bcc2-468a-8b06-75c00abbf639",rules = { @ValidationRule(value = "required",targetName = "filter.entity.department",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.employee",argvs = ""),@ValidationRule(value = "required",targetName = "filter.entity.requestDate",argvs = "")}),@ValidationRuleGroup(value = "7a7ea20f-f70f-4f46-b829-547d66f38857",rules = { }),@ValidationRuleGroup(value = "da150f36-d2ca-4b7b-9ac7-99b43668ee2d",rules = { }),@ValidationRuleGroup(value = "781e978c-47e2-4bf3-92c0-7ee7ab2aad30",rules = { }),@ValidationRuleGroup(value = "29f85ee9-b967-43a8-935c-399fe0a12696",rules = { }),@ValidationRuleGroup(value = "aad598d9-4381-459b-813a-a7ee98a89a46",rules = { }),@ValidationRuleGroup(value = "2cfb9bad-481c-48ee-8c50-2901721e708c",rules = { }),@ValidationRuleGroup(value = "f6f5b783-2751-45d0-9620-2025f6d395c9",rules = { })})
    @PutMapping("/api/production-material-requisition")
    public ApiReturn<ProductionMaterialRequisitionEntity> update(@RequestBody EntityFilter filter) {
        if (filter == null || filter.getEntity() == null) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "");
        }
        Map map = filter.getEntity();
        ProductionMaterialRequisitionEntity entity = JacksonUtils.fromJson(map, ProductionMaterialRequisitionEntity.class);
        List<String> updateFields = filter.getProperties();
        return ApiReturn.of(service.update(entity, updateFields));
    }

    /**
    * auto gen delete method
    **/
    @Validation(value = { @ValidationRuleGroup(value = "c8ce6137e2c0475f950f0c3abc73c00a",rules = { }),@ValidationRuleGroup(value = "fcd3dd98-6d8a-4026-bc54-c002c3fbba14",rules = { }),@ValidationRuleGroup(value = "ed6c9127-ad49-4dec-ba53-1918410fc177",rules = { }),@ValidationRuleGroup(value = "f8152e62-a35c-419e-b595-fe9fa5ef2fd2",rules = { }),@ValidationRuleGroup(value = "12b18fea-c2f4-44ef-a6e6-daf15e83d9da",rules = { }),@ValidationRuleGroup(value = "c27503f7-87fe-4516-9e54-a719fa785a32",rules = { })})
    @DeleteMapping("/api/production-material-requisition")
    public ApiReturn<Long> delete( @RequestParam(required = true) String documentNumber ) { 
        return ApiReturn.of(service.delete( documentNumber )); 
    }


    /**
    * auto gen import method
    **/
    @PostMapping("/api/production-material-requisition/import")
    public ApiReturn<String> importEntities(@RequestParam("file") MultipartFile file) {
        return ApiReturn.of(service.importFile(file));
    }

}