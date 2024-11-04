package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.SalesOrdersEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate SalesOrdersEntity Mapper
*
* @author sys
*/
public interface SalesOrdersEntityMapper extends ReferenceHandleMapper {

    int insert(SalesOrdersEntity bean);
    int batchInsert(List<SalesOrdersEntity> beans);
    List<SalesOrdersEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(SalesOrdersEntity bean, List<String> updateFields);
    int batchUpdate(List<SalesOrdersEntity> beans, List<String> updateFields);
    int delete(String id);
    int batchDelete(List<String> ids);
    SalesOrdersEntity selectOne(String id);

    int createOrUpdate(SalesOrdersEntity bean);
    int updateBy(SalesOrdersEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}