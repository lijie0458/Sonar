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
import com.dogfood.aa20240808.domain.entities.LCAPResource;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.domain.structure.*;
import com.dogfood.aa20240808.repository.entities.LCAPResourceMapper;
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
* auto generate LCAPResourceService ServiceImpl
*
* @author sys
*/
@Service
public class LCAPResourceService extends AbstractService {
    @Resource
    private LCAPResourceMapper mapper;
    @Resource
    private RelationInnerService relationInnerService;

    private Map<String, String> entityFieldNameTitleMap = new LinkedHashMap<String, String>();
    private Map<String, String> entityFieldTitleNameMap = new LinkedHashMap<String, String>();
    private Map<String, String> entityFiledColumnNameMap = new LinkedHashMap<>();

    public LCAPResourceService() {
        entityFieldNameTitleMap.put("id", "主键");
        entityFieldTitleNameMap.put("主键", "id");
        entityFiledColumnNameMap.put("id", "id");
        entityFieldNameTitleMap.put("createdTime", "创建时间");
        entityFieldTitleNameMap.put("创建时间", "createdTime");
        entityFiledColumnNameMap.put("createdTime", "created_time");
        entityFieldNameTitleMap.put("updatedTime", "更新时间");
        entityFieldTitleNameMap.put("更新时间", "updatedTime");
        entityFiledColumnNameMap.put("updatedTime", "updated_time");
        entityFieldNameTitleMap.put("createdBy", "创建者");
        entityFieldTitleNameMap.put("创建者", "createdBy");
        entityFiledColumnNameMap.put("createdBy", "created_by");
        entityFieldNameTitleMap.put("updatedBy", "更新者");
        entityFieldTitleNameMap.put("更新者", "updatedBy");
        entityFiledColumnNameMap.put("updatedBy", "updated_by");
        entityFieldNameTitleMap.put("uuid", "唯一标识");
        entityFieldTitleNameMap.put("唯一标识", "uuid");
        entityFiledColumnNameMap.put("uuid", "uuid");
        entityFieldNameTitleMap.put("name", "资源名称");
        entityFieldTitleNameMap.put("资源名称", "name");
        entityFiledColumnNameMap.put("name", "name");
        entityFieldNameTitleMap.put("description", "资源描述");
        entityFieldTitleNameMap.put("资源描述", "description");
        entityFiledColumnNameMap.put("description", "description");
        entityFieldNameTitleMap.put("type", "资源类型");
        entityFieldTitleNameMap.put("资源类型", "type");
        entityFiledColumnNameMap.put("type", "type");
        entityFieldNameTitleMap.put("clientType", "端标识");
        entityFieldTitleNameMap.put("端标识", "clientType");
        entityFiledColumnNameMap.put("clientType", "client_type");
    }

    /**
    * auto gen create method
    **/
    @Transactional(rollbackFor = Exception.class)
    public LCAPResource create(LCAPResource entity) {
        if (null == entity) {
            throw new HttpCodeException(400, "create param is required");
        }
        // fill default value
        entity.setId(SnowflakeIdWorker.getInstance().nextId());
        entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
        entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
        UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
        entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
        entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
        entity.setName(getOrDefault(entity.getName(), ""));
        paramValidate(entity);
        mapper.insert(entity);
        return entity;
    }

    /**
    * auto gen batch create method
    **/
    @Transactional(rollbackFor = Exception.class)
    public List<LCAPResource> batchCreate(List<LCAPResource> entities) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }

        UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();

        // fill default value
        List<LCAPResource> batchList = new ArrayList<>(100);
        for (LCAPResource entity : entities) {
            entity.setId(SnowflakeIdWorker.getInstance().nextId());
            entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            entity.setName(getOrDefault(entity.getName(), ""));
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
    public LCAPResource update(LCAPResource entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "LCAPResource");
        }
        if ( entity.getId() == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }

        // updateFields为null时，默认全量更新
        if (null != updateFields && updateFields.size() == 1 &&  updateFields.contains("id")) {
            return entity;
        } else {
            UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
            String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
            int rows = mapper.update(entity, updateFields);
            if (rows <= 0) {
                throw new HttpCodeException(404, ErrorCodeEnum.DATA_NOT_EXIST.code, entity.getClass().getName());
            }

            return get(entity.getId());
        }
    }

    /**
    * auto gen batchUpdate method
    **/
    @Transactional(rollbackFor = Exception.class)
    public List<LCAPResource> batchUpdate(List<LCAPResource> entities, List<String> updateFields) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }
        // updateFields为null时，默认全量更新
        List<LCAPResource> updateEntities = new ArrayList<>(entities.size());
        for (LCAPResource entity : entities) {
            updateEntities.add(update(entity, updateFields));
        }

        return updateEntities;
    }

    /**
    * auto gen delete method
    **/
    @Transactional(rollbackFor = Exception.class)
    public long delete( Long id ) { 
        if ( id == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }
        LCAPResource entity = mapper.selectOne( id ); 

        if (null == entity) {
            return 0;
        }
        relationInnerService.onDelete(entity);
        return mapper.delete( id ); 
    }

    /**
    * auto gen batch delete method
    **/
    @Transactional(rollbackFor = Exception.class)
    public long batchDelete(List<Long> ids) {
        if (null == ids || ids.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }

        AbstractQueryFilter inQueryFilter = new InQueryFilter()
            .left(new ColumnQueryFilter("LCAPResource", "lcap_resource_a6d592", "id", "id"))
            .right(new ListLiteralQueryFilter(ids));
        CommonFunctionUtil.preHandleQueryExpression(inQueryFilter, entityFiledColumnNameMap);
        List<LCAPResource>  entities = mapper.selectList(inQueryFilter);
        for (LCAPResource entity : entities) {
            relationInnerService.onDelete(entity);
        }

        return mapper.batchDelete(ids);
    }

    /**
     * auto gen get method
     **/
    public LCAPResource get( Long id ) { 
        if ( id == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }

        LCAPResource entity = mapper.selectOne( id ); 

        return entity;
    }

    /**
    * auto gen list method
    **/
    public List<LCAPResource> list(AbstractQueryFilter queryFilter) {
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
            List<LCAPResource> data = ExcelUtil.read(file.getInputStream(), type, LCAPResource.class, entityFieldTitleNameMap);
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

            List<LCAPResource> data = list(queryFilter);
            String storeFilePath = ExcelUtil.write(data, LCAPResource.class, exportFieldMap);
            org.springframework.core.io.Resource resource = null;
            String contentType = null;
            resource = new FileUrlResource(storeFilePath);
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
            if (contentType == null) {
                contentType = "application/octet-stream";
            }
            return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + LCAPResource.class.getSimpleName() + ".xlsx\"")
                .body(resource);
        } catch (Exception e) {
            throw new HttpCodeException(500, e);
        }
    }

    /**
    * auto gen createOrUpdate method
    **/
    @Transactional(rollbackFor = Exception.class)
    public LCAPResource createOrUpdate(LCAPResource entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, LCAPResource.class);
        }

        if ( entity.getId() == null ) { 
            // insert
            entity = create(entity);
        }  else {
            LCAPResource existEntity = mapper.selectOne(entity.getId()); 
            if (null == existEntity) {
                // insert
                entity.setCreatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
                entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
                UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
                String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
                entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
                entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
                entity.setName(getOrDefault(entity.getName(), ""));
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
    public long updateBy(LCAPResource entity, List<String> updateFields, AbstractQueryFilter filter) {

        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, LCAPResource.class);
        }

        // updateFields为null时，默认全量更新
        if (null == filter) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, AbstractQueryFilter.class);
        }

        if (null != updateFields && updateFields.size() == 1 &&  updateFields.contains("id")) {
            return 0;
        } else {
            UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
            String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
            CommonFunctionUtil.preHandleQueryExpression(filter, entityFiledColumnNameMap);
            entity.setUpdatedTime(ZonedDateTime.now(ZoneId.of("UTC")));
            entity.setCreatedBy(StringUtils.isBlank(entity.getCreatedBy()) ? currentUserName : entity.getCreatedBy());
            entity.setUpdatedBy(StringUtils.isBlank(entity.getUpdatedBy()) ? currentUserName : entity.getUpdatedBy());
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