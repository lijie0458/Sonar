package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.Warehouse_levelEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate Warehouse_levelEntity Mapper
*
* @author sys
*/
public interface Warehouse_levelEntityMapper extends ReferenceHandleMapper {

    int insert(Warehouse_levelEntity bean);

    int batchInsert(List<Warehouse_levelEntity> beans);

    int updateBy(Warehouse_levelEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(Warehouse_levelEntity bean);

    int update(Warehouse_levelEntity bean, List<String> updateFields);

    int batchUpdate(List<Warehouse_levelEntity> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    Warehouse_levelEntity selectOne(Long id);


    List<Warehouse_levelEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}