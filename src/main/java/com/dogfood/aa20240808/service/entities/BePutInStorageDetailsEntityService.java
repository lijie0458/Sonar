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
import com.dogfood.aa20240808.domain.entities.BePutInStorageDetailsEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.domain.structure.*;
import com.dogfood.aa20240808.repository.entities.BePutInStorageDetailsEntityMapper;
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
* auto generate BePutInStorageDetailsEntityService ServiceImpl
*
* @author sys
*/
@Service
public class BePutInStorageDetailsEntityService extends AbstractService {
    @Resource
    private BePutInStorageDetailsEntityMapper mapper;
    @Resource
    private RelationInnerService relationInnerService;

    private Map<String, String> entityFieldNameTitleMap = new LinkedHashMap<String, String>();
    private Map<String, String> entityFieldTitleNameMap = new LinkedHashMap<String, String>();
    private Map<String, String> entityFiledColumnNameMap = new LinkedHashMap<>();

    public BePutInStorageDetailsEntityService() {
        entityFieldNameTitleMap.put("id", "id");
        entityFieldTitleNameMap.put("id", "id");
        entityFiledColumnNameMap.put("id", "id");
        entityFieldNameTitleMap.put("bePutInStorageId", "入库单号");
        entityFieldTitleNameMap.put("入库单号", "bePutInStorageId");
        entityFiledColumnNameMap.put("bePutInStorageId", "be_put_in_storage_id");
        entityFieldNameTitleMap.put("bePutInStorageQuantity", "入库数量");
        entityFieldTitleNameMap.put("入库数量", "bePutInStorageQuantity");
        entityFiledColumnNameMap.put("bePutInStorageQuantity", "be_put_in_storage_quantity");
        entityFieldNameTitleMap.put("materialNumber", "物料编码");
        entityFieldTitleNameMap.put("物料编码", "materialNumber");
        entityFiledColumnNameMap.put("materialNumber", "material_number");
        entityFieldNameTitleMap.put("receivableQuantity", "应收数量");
        entityFieldTitleNameMap.put("应收数量", "receivableQuantity");
        entityFiledColumnNameMap.put("receivableQuantity", "receivable_quantity");
        entityFieldNameTitleMap.put("batchNumber", "批号");
        entityFieldTitleNameMap.put("批号", "batchNumber");
        entityFiledColumnNameMap.put("batchNumber", "batch_number");
        entityFieldNameTitleMap.put("receivingDetailsId", "收货单明细Id");
        entityFieldTitleNameMap.put("收货单明细Id", "receivingDetailsId");
        entityFiledColumnNameMap.put("receivingDetailsId", "receiving_details_id");
    }

    /**
    * auto gen create method
    **/
    @Transactional(rollbackFor = Exception.class)
    public BePutInStorageDetailsEntity create(BePutInStorageDetailsEntity entity) {
        if (null == entity) {
            throw new HttpCodeException(400, "create param is required");
        }
        // fill default value
        entity.setId(SnowflakeIdWorker.getInstance().nextId());
        paramValidate(entity);
        mapper.insert(entity);
        return entity;
    }

    /**
    * auto gen batch create method
    **/
    @Transactional(rollbackFor = Exception.class)
    public List<BePutInStorageDetailsEntity> batchCreate(List<BePutInStorageDetailsEntity> entities) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }


        // fill default value
        List<BePutInStorageDetailsEntity> batchList = new ArrayList<>(100);
        for (BePutInStorageDetailsEntity entity : entities) {
            entity.setId(SnowflakeIdWorker.getInstance().nextId());
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
    public BePutInStorageDetailsEntity update(BePutInStorageDetailsEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "BePutInStorageDetailsEntity");
        }
        if ( entity.getId() == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }

        // updateFields为null时，默认全量更新
        if (null != updateFields && updateFields.size() == 1 &&  updateFields.contains("id")) {
            return entity;
        } else {
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
    public List<BePutInStorageDetailsEntity> batchUpdate(List<BePutInStorageDetailsEntity> entities, List<String> updateFields) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }
        // updateFields为null时，默认全量更新
        List<BePutInStorageDetailsEntity> updateEntities = new ArrayList<>(entities.size());
        for (BePutInStorageDetailsEntity entity : entities) {
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
        BePutInStorageDetailsEntity entity = mapper.selectOne( id ); 

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
            .left(new ColumnQueryFilter("BePutInStorageDetails", "be_put_in_storage_details", "id", "id"))
            .right(new ListLiteralQueryFilter(ids));
        CommonFunctionUtil.preHandleQueryExpression(inQueryFilter, entityFiledColumnNameMap);
        List<BePutInStorageDetailsEntity>  entities = mapper.selectList(inQueryFilter);
        for (BePutInStorageDetailsEntity entity : entities) {
            relationInnerService.onDelete(entity);
        }

        return mapper.batchDelete(ids);
    }

    /**
     * auto gen get method
     **/
    public BePutInStorageDetailsEntity get( Long id ) { 
        if ( id == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }

        BePutInStorageDetailsEntity entity = mapper.selectOne( id ); 

        return entity;
    }

    /**
    * auto gen list method
    **/
    public List<BePutInStorageDetailsEntity> list(AbstractQueryFilter queryFilter) {
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
            List<BePutInStorageDetailsEntity> data = ExcelUtil.read(file.getInputStream(), type, BePutInStorageDetailsEntity.class, entityFieldTitleNameMap);
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

            List<BePutInStorageDetailsEntity> data = list(queryFilter);
            String storeFilePath = ExcelUtil.write(data, BePutInStorageDetailsEntity.class, exportFieldMap);
            org.springframework.core.io.Resource resource = null;
            String contentType = null;
            resource = new FileUrlResource(storeFilePath);
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
            if (contentType == null) {
                contentType = "application/octet-stream";
            }
            return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + BePutInStorageDetailsEntity.class.getSimpleName() + ".xlsx\"")
                .body(resource);
        } catch (Exception e) {
            throw new HttpCodeException(500, e);
        }
    }

    /**
    * auto gen createOrUpdate method
    **/
    @Transactional(rollbackFor = Exception.class)
    public BePutInStorageDetailsEntity createOrUpdate(BePutInStorageDetailsEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, BePutInStorageDetailsEntity.class);
        }

        if ( entity.getId() == null ) { 
            // insert
            entity = create(entity);
        }  else {
            BePutInStorageDetailsEntity existEntity = mapper.selectOne(entity.getId()); 
            if (null == existEntity) {
                // insert
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
    public long updateBy(BePutInStorageDetailsEntity entity, List<String> updateFields, AbstractQueryFilter filter) {

        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, BePutInStorageDetailsEntity.class);
        }

        // updateFields为null时，默认全量更新
        if (null == filter) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, AbstractQueryFilter.class);
        }

        if (null != updateFields && updateFields.size() == 1 &&  updateFields.contains("id")) {
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