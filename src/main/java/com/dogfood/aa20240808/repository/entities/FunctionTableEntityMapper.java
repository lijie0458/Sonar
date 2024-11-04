package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.FunctionTableEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate FunctionTableEntity Mapper
*
* @author sys
*/
public interface FunctionTableEntityMapper extends ReferenceHandleMapper {

    int insert(FunctionTableEntity bean);
    int batchInsert(List<FunctionTableEntity> beans);
    List<FunctionTableEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(FunctionTableEntity bean, List<String> updateFields);
    int batchUpdate(List<FunctionTableEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    FunctionTableEntity selectOne(Long id);

    int createOrUpdate(FunctionTableEntity bean);
    int updateBy(FunctionTableEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}