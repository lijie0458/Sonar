package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.LCAPLogicViewMapping;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate LCAPLogicViewMapping Mapper
*
* @author sys
*/
public interface LCAPLogicViewMappingMapper extends ReferenceHandleMapper {

    int insert(LCAPLogicViewMapping bean);

    int batchInsert(List<LCAPLogicViewMapping> beans);

    int updateBy(LCAPLogicViewMapping bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(LCAPLogicViewMapping bean);

    int update(LCAPLogicViewMapping bean, List<String> updateFields);

    int batchUpdate(List<LCAPLogicViewMapping> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    LCAPLogicViewMapping selectOne(Long id);


    List<LCAPLogicViewMapping> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}