package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate Warehouse_levelTwoEntity Mapper
*
* @author sys
*/
public interface Warehouse_levelTwoEntityMapper extends ReferenceHandleMapper {

    int insert(Warehouse_levelTwoEntity bean);
    int batchInsert(List<Warehouse_levelTwoEntity> beans);
    List<Warehouse_levelTwoEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(Warehouse_levelTwoEntity bean, List<String> updateFields);
    int batchUpdate(List<Warehouse_levelTwoEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    Warehouse_levelTwoEntity selectOne(Long id);

    int createOrUpdate(Warehouse_levelTwoEntity bean);
    int updateBy(Warehouse_levelTwoEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}