package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate Storage_locationEntity Mapper
*
* @author sys
*/
public interface Storage_locationEntityMapper extends ReferenceHandleMapper {

    int insert(Storage_locationEntity bean);
    int batchInsert(List<Storage_locationEntity> beans);
    List<Storage_locationEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(Storage_locationEntity bean, List<String> updateFields);
    int batchUpdate(List<Storage_locationEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    Storage_locationEntity selectOne(Long id);

    int createOrUpdate(Storage_locationEntity bean);
    int updateBy(Storage_locationEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}