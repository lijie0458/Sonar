package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.ProductReturnStorageEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate ProductReturnStorageEntity Mapper
*
* @author sys
*/
public interface ProductReturnStorageEntityMapper extends ReferenceHandleMapper {

    int insert(ProductReturnStorageEntity bean);
    int batchInsert(List<ProductReturnStorageEntity> beans);
    List<ProductReturnStorageEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(ProductReturnStorageEntity bean, List<String> updateFields);
    int batchUpdate(List<ProductReturnStorageEntity> beans, List<String> updateFields);
    int delete(String id);
    int batchDelete(List<String> ids);
    ProductReturnStorageEntity selectOne(String id);

    int createOrUpdate(ProductReturnStorageEntity bean);
    int updateBy(ProductReturnStorageEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}