package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.ProductReturnStorageDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate ProductReturnStorageDetailsEntity Mapper
*
* @author sys
*/
public interface ProductReturnStorageDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(ProductReturnStorageDetailsEntity bean);

    int batchInsert(List<ProductReturnStorageDetailsEntity> beans);

    int updateBy(ProductReturnStorageDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(ProductReturnStorageDetailsEntity bean);

    int update(ProductReturnStorageDetailsEntity bean, List<String> updateFields);

    int batchUpdate(List<ProductReturnStorageDetailsEntity> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    ProductReturnStorageDetailsEntity selectOne(Long id);


    List<ProductReturnStorageDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}