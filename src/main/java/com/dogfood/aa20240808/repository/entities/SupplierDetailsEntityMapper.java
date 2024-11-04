package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.SupplierDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate SupplierDetailsEntity Mapper
*
* @author sys
*/
public interface SupplierDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(SupplierDetailsEntity bean);
    int batchInsert(List<SupplierDetailsEntity> beans);
    List<SupplierDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(SupplierDetailsEntity bean, List<String> updateFields);
    int batchUpdate(List<SupplierDetailsEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    SupplierDetailsEntity selectOne(Long id);

    int createOrUpdate(SupplierDetailsEntity bean);
    int updateBy(SupplierDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}