package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.LCAPPerResMapping;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate LCAPPerResMapping Mapper
*
* @author sys
*/
public interface LCAPPerResMappingMapper extends ReferenceHandleMapper {

    int insert(LCAPPerResMapping bean);
    int batchInsert(List<LCAPPerResMapping> beans);
    List<LCAPPerResMapping> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(LCAPPerResMapping bean, List<String> updateFields);
    int batchUpdate(List<LCAPPerResMapping> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    LCAPPerResMapping selectOne(Long id);

    int createOrUpdate(LCAPPerResMapping bean);
    int updateBy(LCAPPerResMapping bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}