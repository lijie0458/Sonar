package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate MeasuringUnitEntity Mapper
*
* @author sys
*/
public interface MeasuringUnitEntityMapper extends ReferenceHandleMapper {

    int insert(MeasuringUnitEntity bean);
    int batchInsert(List<MeasuringUnitEntity> beans);
    List<MeasuringUnitEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(MeasuringUnitEntity bean, List<String> updateFields);
    int batchUpdate(List<MeasuringUnitEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    MeasuringUnitEntity selectOne(Long id);

    int createOrUpdate(MeasuringUnitEntity bean);
    int updateBy(MeasuringUnitEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}