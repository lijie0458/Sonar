package com.dogfood.aa20240808.service.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.ArrayList;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.http.ResponseEntity;
import org.springframework.core.io.FileUrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.apache.commons.lang3.StringUtils;

import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.domain.entities.PurchaseRequestEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.domain.structure.*;
import com.dogfood.aa20240808.repository.entities.PurchaseRequestEntityMapper;
import com.dogfood.aa20240808.util.SnowflakeIdWorker;
import com.dogfood.aa20240808.util.CommonFunctionUtil;
import com.dogfood.aa20240808.service.entities.AbstractService;
import com.dogfood.aa20240808.service.entities.inner.RelationInnerService;
import com.dogfood.aa20240808.service.dto.filters.*;
import com.dogfood.aa20240808.service.dto.filters.atomic.*;
import com.dogfood.aa20240808.service.dto.filters.logic.unary.*;
import com.dogfood.aa20240808.service.dto.filters.logic.binary.matching.*;
import com.dogfood.aa20240808.util.ExcelUtil;
import com.dogfood.aa20240808.context.UserContext;
/**
* auto generate PurchaseRequestEntityService ServiceImpl
*
* @author sys
*/
@Service
public class PurchaseRequestEntityService extends AbstractService {
    @Resource
    private PurchaseRequestEntityMapper mapper;
    @Resource
    private RelationInnerService relationInnerService;

    private Map<String, String> entityFieldNameTitleMap = new LinkedHashMap<String, String>();
    private Map<String, String> entityFieldTitleNameMap = new LinkedHashMap<String, String>();
    private Map<String, String> entityFiledColumnNameMap = new LinkedHashMap<>();

    public PurchaseRequestEntityService() {
        entityFieldNameTitleMap.put("title", "标题");
        entityFieldTitleNameMap.put("标题", "title");
        entityFiledColumnNameMap.put("title", "title");
        entityFieldNameTitleMap.put("requestNumber", "单号");
        entityFieldTitleNameMap.put("单号", "requestNumber");
        entityFiledColumnNameMap.put("requestNumber", "request_number");
        entityFieldNameTitleMap.put("department", "部门");
        entityFieldTitleNameMap.put("部门", "department");
        entityFiledColumnNameMap.put("department", "department");
        entityFieldNameTitleMap.put("requestReason", "申请原因");
        entityFieldTitleNameMap.put("申请原因", "requestReason");
        entityFiledColumnNameMap.put("requestReason", "request_reason");
        entityFieldNameTitleMap.put("annex", "附件");
        entityFieldTitleNameMap.put("附件", "annex");
        entityFiledColumnNameMap.put("annex", "annex");
        entityFieldNameTitleMap.put("createdBy", "申请人");
        entityFieldTitleNameMap.put("申请人", "createdBy");
        entityFiledColumnNameMap.put("createdBy", "created_by");
        entityFieldNameTitleMap.put("approvalStatus", "审批状态");
        entityFieldTitleNameMap.put("审批状态", "approvalStatus");
        entityFiledColumnNameMap.put("approvalStatus", "approval_status");
        entityFieldNameTitleMap.put("applicationDate", "申请日期");
        entityFieldTitleNameMap.put("申请日期", "applicationDate");
        entityFiledColumnNameMap.put("applicationDate", "application_date");
    }

    /**
    * auto gen create method
    **/
    @Transactional(rollbackFor = Exception.class)
    public PurchaseRequestEntity create(PurchaseRequestEntity entity) {
        if (null == entity) {
            throw new HttpCodeException(400, "create param is required");
        }
        // fill default value
        UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
        entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
        paramValidate(entity);
        mapper.insert(entity);
        return entity;
    }

    /**
    * auto gen batch create method
    **/
    @Transactional(rollbackFor = Exception.class)
    public List<PurchaseRequestEntity> batchCreate(List<PurchaseRequestEntity> entities) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }

        UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();

        // fill default value
        List<PurchaseRequestEntity> batchList = new ArrayList<>(100);
        for (PurchaseRequestEntity entity : entities) {
            entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
            paramValidate(entity);
            if (batchList.size() >= 100) {
                mapper.batchInsert(batchList);
                batchList.clear();
            }
            batchList.add(entity);
        }
        if (batchList.size() >= 0) {
            mapper.batchInsert(batchList);
        }
        return entities;
    }

    /**
    * auto gen update method
    **/
    @Transactional
    public PurchaseRequestEntity update(PurchaseRequestEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "PurchaseRequestEntity");
        }
        if ( entity.getRequestNumber() == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }

        // updateFields为null时，默认全量更新
        if (null != updateFields && updateFields.size() == 1 &&  updateFields.contains("requestNumber")) {
            return entity;
        } else {
            int rows = mapper.update(entity, updateFields);
            if (rows <= 0) {
                throw new HttpCodeException(404, ErrorCodeEnum.DATA_NOT_EXIST.code, entity.getClass().getName());
            }

            return get(entity.getRequestNumber());
        }
    }

    /**
    * auto gen batchUpdate method
    **/
    @Transactional(rollbackFor = Exception.class)
    public List<PurchaseRequestEntity> batchUpdate(List<PurchaseRequestEntity> entities, List<String> updateFields) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }
        // updateFields为null时，默认全量更新
        List<PurchaseRequestEntity> updateEntities = new ArrayList<>(entities.size());
        for (PurchaseRequestEntity entity : entities) {
            updateEntities.add(update(entity, updateFields));
        }

        return updateEntities;
    }

    /**
    * auto gen delete method
    **/
    @Transactional(rollbackFor = Exception.class)
    public long delete( String requestNumber ) { 
        if ( requestNumber == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }
        PurchaseRequestEntity entity = mapper.selectOne( requestNumber ); 

        if (null == entity) {
            return 0;
        }
        relationInnerService.onDelete(entity);
        return mapper.delete( requestNumber ); 
    }

    /**
    * auto gen batch delete method
    **/
    @Transactional(rollbackFor = Exception.class)
    public long batchDelete(List<String> ids) {
        if (null == ids || ids.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }

        AbstractQueryFilter inQueryFilter = new InQueryFilter()
            .left(new ColumnQueryFilter("PurchaseRequest", "purchase_request", "requestNumber", "request_number"))
            .right(new ListLiteralQueryFilter(ids));
        CommonFunctionUtil.preHandleQueryExpression(inQueryFilter, entityFiledColumnNameMap);
        List<PurchaseRequestEntity>  entities = mapper.selectList(inQueryFilter);
        for (PurchaseRequestEntity entity : entities) {
            relationInnerService.onDelete(entity);
        }

        return mapper.batchDelete(ids);
    }

    /**
     * auto gen get method
     **/
    public PurchaseRequestEntity get( String requestNumber ) { 
        if ( requestNumber == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }

        PurchaseRequestEntity entity = mapper.selectOne( requestNumber ); 

        return entity;
    }

    /**
    * auto gen list method
    **/
    public List<PurchaseRequestEntity> list(AbstractQueryFilter queryFilter) {
        if (null == queryFilter) {
            queryFilter = new UnaryExpressionFilter();
        }
        CommonFunctionUtil.preHandleQueryExpression(queryFilter, entityFiledColumnNameMap);
        return mapper.selectList(queryFilter);
    }

    /**
    * auto gen count method
    **/
    public long count(AbstractQueryFilter queryFilter) {
        if (null == queryFilter) {
            queryFilter = new UnaryExpressionFilter();
        }
        CommonFunctionUtil.preHandleQueryExpression(queryFilter, entityFiledColumnNameMap);
        return mapper.count(queryFilter);
    }

    /**
    * auto gen importFile method
    **/
    @Transactional(rollbackFor = Exception.class)
    public String importFile(MultipartFile file) {
        String type;
        String[] items = file.getOriginalFilename().split("\\.");
        if (items.length > 1) {
            type = items[items.length - 1];
            if (!"xls".equalsIgnoreCase(type) && !"xlsx".equalsIgnoreCase(type)) {
                return "不支持的文件类型";
            }
        } else {
            return "不支持的文件类型";
        }

        try {
            List<PurchaseRequestEntity> data = ExcelUtil.read(file.getInputStream(), type, PurchaseRequestEntity.class, entityFieldTitleNameMap);
            batchCreate(data);
            return "ok";
        } catch (Exception e) {
            throw new HttpCodeException(500, e);
        }
    }

    /**
    * auto gen export method
    **/
    public ResponseEntity<org.springframework.core.io.Resource> export(AbstractQueryFilter queryFilter, String fields, HttpServletRequest request) {
        try {
            Map<String, String> exportFieldMap = entityFieldNameTitleMap;
            if (fields != null && !"".equals(fields.trim())) {
                for (String filedName : fields.split(",")) {
                    exportFieldMap = new LinkedHashMap<String, String>();
                    exportFieldMap.put(filedName, entityFieldNameTitleMap.get(filedName));
                }
            }

            List<PurchaseRequestEntity> data = list(queryFilter);
            String storeFilePath = ExcelUtil.write(data, PurchaseRequestEntity.class, exportFieldMap);
            org.springframework.core.io.Resource resource = null;
            String contentType = null;
            resource = new FileUrlResource(storeFilePath);
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
            if (contentType == null) {
                contentType = "application/octet-stream";
            }
            return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + PurchaseRequestEntity.class.getSimpleName() + ".xlsx\"")
                .body(resource);
        } catch (Exception e) {
            throw new HttpCodeException(500, e);
        }
    }

    /**
    * auto gen createOrUpdate method
    **/
    @Transactional(rollbackFor = Exception.class)
    public PurchaseRequestEntity createOrUpdate(PurchaseRequestEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, PurchaseRequestEntity.class);
        }

        if ( entity.getRequestNumber() == null ) { 
            // insert
            entity = create(entity);
        }  else {
            PurchaseRequestEntity existEntity = mapper.selectOne(entity.getRequestNumber()); 
            if (null == existEntity) {
                // insert
                UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
                String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
                entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
                paramValidate(entity);
                mapper.createOrUpdate(entity);
            } else {
                // updateFields为null时，默认全量更新
                entity = update(entity, updateFields);
            }
        }
        return entity;
    }

    /**
    * auto gen updateBy method
    **/
    @Transactional(rollbackFor = Exception.class)
    public long updateBy(PurchaseRequestEntity entity, List<String> updateFields, AbstractQueryFilter filter) {

        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, PurchaseRequestEntity.class);
        }

        // updateFields为null时，默认全量更新
        if (null == filter) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, AbstractQueryFilter.class);
        }

        if (null != updateFields && updateFields.size() == 1 &&  updateFields.contains("requestNumber")) {
            return 0;
        } else {
            UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
            String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
            CommonFunctionUtil.preHandleQueryExpression(filter, entityFiledColumnNameMap);
            entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
            return mapper.updateBy(entity, updateFields, filter);
        }
    }

    /**
    * auto gen deleteBy method
    **/
    @Transactional(rollbackFor = Exception.class)
    public long deleteBy(AbstractQueryFilter filter) {
        if (null == filter) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, AbstractQueryFilter.class);
        }

        CommonFunctionUtil.preHandleQueryExpression(filter, entityFiledColumnNameMap);
        return mapper.deleteBy(filter);
    }
}