package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.ProductInStorageDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate ProductInStorageDetailsEntity Mapper
*
* @author sys
*/
public interface ProductInStorageDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(ProductInStorageDetailsEntity bean);
    int batchInsert(List<ProductInStorageDetailsEntity> beans);
    List<ProductInStorageDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(ProductInStorageDetailsEntity bean, List<String> updateFields);
    int batchUpdate(List<ProductInStorageDetailsEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    ProductInStorageDetailsEntity selectOne(Long id);

    int createOrUpdate(ProductInStorageDetailsEntity bean);
    int updateBy(ProductInStorageDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}