package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.ScheduleEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate ScheduleEntity Mapper
*
* @author sys
*/
public interface ScheduleEntityMapper extends ReferenceHandleMapper {

    int insert(ScheduleEntity bean);
    int batchInsert(List<ScheduleEntity> beans);
    List<ScheduleEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(ScheduleEntity bean, List<String> updateFields);
    int batchUpdate(List<ScheduleEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    ScheduleEntity selectOne(Long id);

    int createOrUpdate(ScheduleEntity bean);
    int updateBy(ScheduleEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}