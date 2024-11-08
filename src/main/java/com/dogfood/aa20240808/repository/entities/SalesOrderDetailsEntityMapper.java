package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.SalesOrderDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate SalesOrderDetailsEntity Mapper
*
* @author sys
*/
public interface SalesOrderDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(SalesOrderDetailsEntity bean);

    int batchInsert(List<SalesOrderDetailsEntity> beans);

    int updateBy(SalesOrderDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(SalesOrderDetailsEntity bean);

    int update(SalesOrderDetailsEntity bean, List<String> updateFields);

    int batchUpdate(List<SalesOrderDetailsEntity> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    SalesOrderDetailsEntity selectOne(Long id);


    List<SalesOrderDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}