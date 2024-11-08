package com.dogfood.aa20240808.service.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
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

import com.dogfood.aa20240808.context.UserContext;
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.domain.structure.*;
import com.dogfood.aa20240808.exception.HttpCodeException;
import com.dogfood.aa20240808.repository.entities.MaterialDetailsEntityMapper;
import com.dogfood.aa20240808.service.dto.filters.*;
import com.dogfood.aa20240808.service.dto.filters.atomic.*;
import com.dogfood.aa20240808.service.dto.filters.logic.binary.matching.*;
import com.dogfood.aa20240808.service.dto.filters.logic.unary.*;
import com.dogfood.aa20240808.service.entities.AbstractService;
import com.dogfood.aa20240808.service.entities.inner.RelationInnerService;
import com.dogfood.aa20240808.util.CommonFunctionUtil;
import com.dogfood.aa20240808.util.ExcelUtil;
import com.dogfood.aa20240808.util.SnowflakeIdWorker;
/**
* auto generate MaterialDetailsEntityService ServiceImpl
*
* @author sys
*/
@Service
public class MaterialDetailsEntityService extends AbstractService {
    @Resource
    private MaterialDetailsEntityMapper mapper;
    @Resource
    private RelationInnerService relationInnerService;
    @Resource
    private MaterialDetailsEntityService entityService;

    private Map<String, String> entityFieldNameTitleMap = new LinkedHashMap<String, String>();
    private Map<String, String> entityFieldTitleNameMap = new LinkedHashMap<String, String>();
    private Map<String, String> entityFiledColumnNameMap = new LinkedHashMap<>();

    public MaterialDetailsEntityService() {
        entityFieldTitleNameMap.put("物料编号", "materialCode");
        entityFiledColumnNameMap.put("materialCode", "material_code");
        entityFieldTitleNameMap.put("物料名称", "material_name");
        entityFiledColumnNameMap.put("material_name", "material_name");
        entityFieldTitleNameMap.put("物料分类", "category_id");
        entityFiledColumnNameMap.put("category_id", "category_id");
        entityFieldTitleNameMap.put("规格型号", "specification");
        entityFiledColumnNameMap.put("specification", "specification");
        entityFieldTitleNameMap.put("单位", "unit");
        entityFiledColumnNameMap.put("unit", "unit");
        entityFieldTitleNameMap.put("description", "description");
        entityFiledColumnNameMap.put("description", "description");
        entityFieldTitleNameMap.put("is_batch_enabled", "is_batch_enabled");
        entityFiledColumnNameMap.put("is_batch_enabled", "is_batch_enabled");
        for (String fieldName : entityFieldNameTitleMap.keySet()) {
            String fieldTitle = entityFieldNameTitleMap.get(fieldName);
            entityFieldNameTitleMap.put(fieldName, fieldTitle);
        }
    }

    /**
    * auto gen list method
    **/
    public List<MaterialDetailsEntity> list(AbstractQueryFilter queryFilter) {
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

            List<MaterialDetailsEntity> data = list(queryFilter);
            String storeFilePath = ExcelUtil.write(data, MaterialDetailsEntity.class, exportFieldMap);
            org.springframework.core.io.Resource resource = null;
            String contentType = null;
            resource = new FileUrlResource(storeFilePath);
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
            if (contentType == null) {
                contentType = "application/octet-stream";
            }
            return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + MaterialDetailsEntity.class.getSimpleName() + ".xlsx\"")
                .body(resource);
        } catch (Exception e) {
            throw new HttpCodeException(500, e);
        }
    }

        /**
         * auto gen get method
         **/
        public MaterialDetailsEntity get( String materialCode ) { 
            if ( materialCode == null ) { 
                throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
            }

            MaterialDetailsEntity entity = mapper.selectOne( materialCode ); 

            if (null == entity) {
                throw new HttpCodeException(404, ErrorCodeEnum.DATA_NOT_EXIST.code);
            }
            return entity;
        }

    /**
    * auto gen create method
    **/
    @Transactional(rollbackFor = Exception.class)
    public MaterialDetailsEntity create(MaterialDetailsEntity entity) {
        if (null == entity) {
            throw new HttpCodeException(400, "create param is required");
        }
        // fill default value
        entity.setMaterial_name(getOrDefault(entity.getMaterial_name(), ""));
        entity.setCategory_id(getOrDefault(entity.getCategory_id(), 0L));
        entity.setUnit(getOrDefault(entity.getUnit(), 0L));
        entity.setIs_batch_enabled(getOrDefault(entity.getIs_batch_enabled(), true));
        paramValidate(entity);
        mapper.insert(entity);
        return entity;
    }

    /**
    * auto gen batch create method
    **/
    @Transactional(rollbackFor = Exception.class)
    public List<MaterialDetailsEntity> batchCreate(List<MaterialDetailsEntity> entities) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }


        // fill default value
        List<MaterialDetailsEntity> batchList = new ArrayList<>(100);
        for (MaterialDetailsEntity entity : entities) {
            entity.setMaterial_name(getOrDefault(entity.getMaterial_name(), ""));
            entity.setCategory_id(getOrDefault(entity.getCategory_id(), 0L));
            entity.setUnit(getOrDefault(entity.getUnit(), 0L));
            entity.setIs_batch_enabled(getOrDefault(entity.getIs_batch_enabled(), true));
            paramValidate(entity);
            if (batchList.size() >= 100) {
                mapper.batchInsert(batchList);
                batchList.clear();
            }
            batchList.add(entity);
        }
        if (batchList.size() > 0) {
            mapper.batchInsert(batchList);
        }
        return entities;
    }

    public void beforeUpdate(MaterialDetailsEntity entity) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "MaterialDetailsEntity");
        }
        if ( entity.getMaterialCode() == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }
    }

    /**
    * auto gen update method
    **/
    @Transactional
    public MaterialDetailsEntity update(MaterialDetailsEntity entity, List<String> updateFields) {
        beforeUpdate(entity);

        // updateFields为null时，默认全量更新
        if (null != updateFields && updateFields.size() == 1 &&  updateFields.contains("materialCode")) {
            return entity;
        } else {
            int rows = mapper.update(entity, updateFields);
            if (rows <= 0) {
                throw new HttpCodeException(404, ErrorCodeEnum.DATA_NOT_EXIST.code, entity.getClass().getName());
            }

            return get(entity.getMaterialCode());
        }
    }

    /**
    * auto gen batchUpdate method
    **/
    @Transactional(rollbackFor = Exception.class)
    public List<MaterialDetailsEntity> batchUpdate(List<MaterialDetailsEntity> entities, List<String> updateFields) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }

        if (updateFields != null && updateFields.size() == 1 && updateFields.contains("materialCode")) {
            // 进行局部更新的字段是主键，这种情况是没意义，直接返回就好
            return entities;
        }
        UserContext.UserInfo currentUserInfo = UserContext.getCurrentUserInfo();
        String currentUserName = null == currentUserInfo ? null : currentUserInfo.getUserName();
        List<MaterialDetailsEntity> batchList = new ArrayList<>(100);
        for (MaterialDetailsEntity entity : entities) {
            if (entity.getMaterialCode() == null ) {
                throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
            }

            batchList.add(entity);
            if (batchList.size() >= 100) {
                mapper.batchUpdate(batchList, updateFields);
                batchList.clear();
            }
        }

        if (batchList.size() > 0) {
            mapper.batchUpdate(batchList, updateFields);
            batchList.clear();
        }

        return entities;
    }

    /**
    * auto gen delete method
    **/
    @Transactional(rollbackFor = Exception.class)
    public long delete( String materialCode ) { 
        if ( materialCode == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }
        MaterialDetailsEntity entity = mapper.selectOne( materialCode ); 

        if (null == entity) {
            return 0;
        }
        relationInnerService.onDelete(entity);
        return mapper.delete( materialCode ); 
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
            .left(new ColumnQueryFilter("MaterialDetails", "material_details", "materialCode", "material_code"))
            .right(new ListLiteralQueryFilter(ids));
        CommonFunctionUtil.preHandleQueryExpression(inQueryFilter, entityFiledColumnNameMap);
        List<MaterialDetailsEntity>  entities = mapper.selectList(inQueryFilter);
        for (MaterialDetailsEntity entity : entities) {
            relationInnerService.onDelete(entity);
        }

        return mapper.batchDelete(ids);
    }

    /**
    * auto gen importFile method
    **/
    @Transactional(rollbackFor = Exception.class)
    public String importFile(MultipartFile file) {
        String type;
        String[] items = "\\.".split(Objects.requireNonNull(file.getOriginalFilename()));
        if (items.length > 1) {
            type = items[items.length - 1];
            if (!"xls".equalsIgnoreCase(type) && !"xlsx".equalsIgnoreCase(type)) {
                return "不支持的文件类型";
            }
        } else {
            return "不支持的文件类型";
        }

        try {
            List<MaterialDetailsEntity> data = ExcelUtil.read(file.getInputStream(), type, MaterialDetailsEntity.class, entityFieldTitleNameMap);
            entityService.batchCreate(data);
            return "ok";
        } catch (Exception e) {
            throw new HttpCodeException(500, e);
        }
    }
    /**
    * auto gen createOrUpdate method
    **/
    @Transactional(rollbackFor = Exception.class)
    public MaterialDetailsEntity createOrUpdate(MaterialDetailsEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, MaterialDetailsEntity.class);
        }

        if ( entity.getMaterialCode() == null ) { 
            // insert
            entity = entityService.create(entity);
        }  else {
            MaterialDetailsEntity existEntity = mapper.selectOne(entity.getMaterialCode()); 
            if (null == existEntity) {
                // insert
                entity.setMaterial_name(getOrDefault(entity.getMaterial_name(), ""));
                entity.setCategory_id(getOrDefault(entity.getCategory_id(), 0L));
                entity.setUnit(getOrDefault(entity.getUnit(), 0L));
                entity.setIs_batch_enabled(getOrDefault(entity.getIs_batch_enabled(), true));
                paramValidate(entity);
                mapper.createOrUpdate(entity);
            } else {
                // updateFields为null时，默认全量更新
                entity = entityService.update(entity, updateFields);
            }
        }
        return entity;
    }

    /**
    * auto gen updateBy method
    **/
    @Transactional(rollbackFor = Exception.class)
    public long updateBy(MaterialDetailsEntity entity, List<String> updateFields, AbstractQueryFilter filter) {

        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, MaterialDetailsEntity.class);
        }

        // updateFields为null时，默认全量更新
        if (null == filter) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, AbstractQueryFilter.class);
        }

        if (null != updateFields && updateFields.size() == 1 &&  updateFields.contains("materialCode")) {
            return 0;
        } else {
            CommonFunctionUtil.preHandleQueryExpression(filter, entityFiledColumnNameMap);
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