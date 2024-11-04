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
import com.dogfood.aa20240808.domain.entities.InventoryEntity;
import com.dogfood.aa20240808.domain.enumeration.*;
import com.dogfood.aa20240808.domain.structure.*;
import com.dogfood.aa20240808.repository.entities.InventoryEntityMapper;
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
* auto generate InventoryEntityService ServiceImpl
*
* @author sys
*/
@Service
public class InventoryEntityService extends AbstractService {
    @Resource
    private InventoryEntityMapper mapper;
    @Resource
    private RelationInnerService relationInnerService;

    private Map<String, String> entityFieldNameTitleMap = new LinkedHashMap<String, String>();
    private Map<String, String> entityFieldTitleNameMap = new LinkedHashMap<String, String>();
    private Map<String, String> entityFiledColumnNameMap = new LinkedHashMap<>();

    public InventoryEntityService() {
        entityFieldTitleNameMap.put("id", "id");
        entityFiledColumnNameMap.put("id", "id");
        entityFieldNameTitleMap.put("materialCode", "物料");
        entityFieldTitleNameMap.put("物料", "materialCode");
        entityFiledColumnNameMap.put("materialCode", "material_code");
        entityFieldNameTitleMap.put("lotNumber", "批号");
        entityFieldTitleNameMap.put("批号", "lotNumber");
        entityFiledColumnNameMap.put("lotNumber", "lot_number");
        entityFieldTitleNameMap.put("unit", "unit");
        entityFiledColumnNameMap.put("unit", "unit");
        entityFieldNameTitleMap.put("warehouse", "仓库");
        entityFieldTitleNameMap.put("仓库", "warehouse");
        entityFiledColumnNameMap.put("warehouse", "warehouse");
        entityFieldNameTitleMap.put("stockQuantity", "库存数量");
        entityFieldTitleNameMap.put("库存数量", "stockQuantity");
        entityFiledColumnNameMap.put("stockQuantity", "stock_quantity");
        entityFieldNameTitleMap.put("occupiedQuantity", "暂用数量");
        entityFieldTitleNameMap.put("暂用数量", "occupiedQuantity");
        entityFiledColumnNameMap.put("occupiedQuantity", "occupied_quantity");
        entityFieldNameTitleMap.put("availableQuantity", "可用数量");
        entityFieldTitleNameMap.put("可用数量", "availableQuantity");
        entityFiledColumnNameMap.put("availableQuantity", "available_quantity");
        entityFieldTitleNameMap.put("createdAt", "createdAt");
        entityFiledColumnNameMap.put("createdAt", "created_at");
        entityFieldTitleNameMap.put("updatedAt", "updatedAt");
        entityFiledColumnNameMap.put("updatedAt", "updated_at");
        entityFieldNameTitleMap.put("location", "库位");
        entityFieldTitleNameMap.put("库位", "location");
        entityFiledColumnNameMap.put("location", "location");
    }

    /**
    * auto gen create method
    **/
    @Transactional(rollbackFor = Exception.class)
    public InventoryEntity create(InventoryEntity entity) {
        if (null == entity) {
            throw new HttpCodeException(400, "create param is required");
        }
        // fill default value
        entity.setId(SnowflakeIdWorker.getInstance().nextId());
        entity.setMaterialCode(getOrDefault(entity.getMaterialCode(), ""));
        entity.setUnit(getOrDefault(entity.getUnit(), ""));
        entity.setWarehouse(getOrDefault(entity.getWarehouse(), 0L));
        entity.setStockQuantity(getOrDefault(entity.getStockQuantity(), BigDecimal.ZERO));
        entity.setOccupiedQuantity(getOrDefault(entity.getOccupiedQuantity(), BigDecimal.ZERO));
        entity.setAvailableQuantity(getOrDefault(entity.getAvailableQuantity(), 0L));
        paramValidate(entity);
        mapper.insert(entity);
        return entity;
    }

    /**
    * auto gen batch create method
    **/
    @Transactional(rollbackFor = Exception.class)
    public List<InventoryEntity> batchCreate(List<InventoryEntity> entities) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }


        // fill default value
        List<InventoryEntity> batchList = new ArrayList<>(100);
        for (InventoryEntity entity : entities) {
            entity.setId(SnowflakeIdWorker.getInstance().nextId());
            entity.setMaterialCode(getOrDefault(entity.getMaterialCode(), ""));
            entity.setUnit(getOrDefault(entity.getUnit(), ""));
            entity.setWarehouse(getOrDefault(entity.getWarehouse(), 0L));
            entity.setStockQuantity(getOrDefault(entity.getStockQuantity(), BigDecimal.ZERO));
            entity.setOccupiedQuantity(getOrDefault(entity.getOccupiedQuantity(), BigDecimal.ZERO));
            entity.setAvailableQuantity(getOrDefault(entity.getAvailableQuantity(), 0L));
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
    public InventoryEntity update(InventoryEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, "InventoryEntity");
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
    public List<InventoryEntity> batchUpdate(List<InventoryEntity> entities, List<String> updateFields) {
        if (null == entities || entities.isEmpty()) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_NOTHING_TODO.code);
        }
        // updateFields为null时，默认全量更新
        List<InventoryEntity> updateEntities = new ArrayList<>(entities.size());
        for (InventoryEntity entity : entities) {
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
        InventoryEntity entity = mapper.selectOne( id ); 

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
            .left(new ColumnQueryFilter("Inventory", "inventory", "id", "id"))
            .right(new ListLiteralQueryFilter(ids));
        CommonFunctionUtil.preHandleQueryExpression(inQueryFilter, entityFiledColumnNameMap);
        List<InventoryEntity>  entities = mapper.selectList(inQueryFilter);
        for (InventoryEntity entity : entities) {
            relationInnerService.onDelete(entity);
        }

        return mapper.batchDelete(ids);
    }

    /**
     * auto gen get method
     **/
    public InventoryEntity get( Long id ) { 
        if ( id == null ) { 
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_PRIMARY_KEY_REQUIRED.code);
        }

        InventoryEntity entity = mapper.selectOne( id ); 

        return entity;
    }

    /**
    * auto gen list method
    **/
    public List<InventoryEntity> list(AbstractQueryFilter queryFilter) {
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
            List<InventoryEntity> data = ExcelUtil.read(file.getInputStream(), type, InventoryEntity.class, entityFieldTitleNameMap);
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

            List<InventoryEntity> data = list(queryFilter);
            String storeFilePath = ExcelUtil.write(data, InventoryEntity.class, exportFieldMap);
            org.springframework.core.io.Resource resource = null;
            String contentType = null;
            resource = new FileUrlResource(storeFilePath);
            contentType = request.getServletContext().getMimeType(resource.getFile().getAbsolutePath());
            if (contentType == null) {
                contentType = "application/octet-stream";
            }
            return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType(contentType))
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + InventoryEntity.class.getSimpleName() + ".xlsx\"")
                .body(resource);
        } catch (Exception e) {
            throw new HttpCodeException(500, e);
        }
    }

    /**
    * auto gen createOrUpdate method
    **/
    @Transactional(rollbackFor = Exception.class)
    public InventoryEntity createOrUpdate(InventoryEntity entity, List<String> updateFields) {
        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, InventoryEntity.class);
        }

        if ( entity.getId() == null ) { 
            // insert
            entity = create(entity);
        }  else {
            InventoryEntity existEntity = mapper.selectOne(entity.getId()); 
            if (null == existEntity) {
                // insert
                entity.setMaterialCode(getOrDefault(entity.getMaterialCode(), ""));
                entity.setUnit(getOrDefault(entity.getUnit(), ""));
                entity.setWarehouse(getOrDefault(entity.getWarehouse(), 0L));
                entity.setStockQuantity(getOrDefault(entity.getStockQuantity(), BigDecimal.ZERO));
                entity.setOccupiedQuantity(getOrDefault(entity.getOccupiedQuantity(), BigDecimal.ZERO));
                entity.setAvailableQuantity(getOrDefault(entity.getAvailableQuantity(), 0L));
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
    public long updateBy(InventoryEntity entity, List<String> updateFields, AbstractQueryFilter filter) {

        if (null == entity) {
            throw new HttpCodeException(400, ErrorCodeEnum.PARAM_REQUIRED.code, InventoryEntity.class);
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