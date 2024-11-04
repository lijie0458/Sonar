package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.SupplierEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate SupplierEntity Mapper
*
* @author sys
*/
public interface SupplierEntityMapper extends ReferenceHandleMapper {

    int insert(SupplierEntity bean);
    int batchInsert(List<SupplierEntity> beans);
    List<SupplierEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(SupplierEntity bean, List<String> updateFields);
    int batchUpdate(List<SupplierEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    SupplierEntity selectOne(Long id);

    int createOrUpdate(SupplierEntity bean);
    int updateBy(SupplierEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}