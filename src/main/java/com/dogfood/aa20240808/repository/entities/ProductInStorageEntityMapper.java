package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.ProductInStorageEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate ProductInStorageEntity Mapper
*
* @author sys
*/
public interface ProductInStorageEntityMapper extends ReferenceHandleMapper {

    int insert(ProductInStorageEntity bean);
    int batchInsert(List<ProductInStorageEntity> beans);
    List<ProductInStorageEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(ProductInStorageEntity bean, List<String> updateFields);
    int batchUpdate(List<ProductInStorageEntity> beans, List<String> updateFields);
    int delete(String id);
    int batchDelete(List<String> ids);
    ProductInStorageEntity selectOne(String id);

    int createOrUpdate(ProductInStorageEntity bean);
    int updateBy(ProductInStorageEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}