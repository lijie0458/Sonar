package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.LCAPRole;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate LCAPRole Mapper
*
* @author sys
*/
public interface LCAPRoleMapper extends ReferenceHandleMapper {

    int insert(LCAPRole bean);
    int batchInsert(List<LCAPRole> beans);
    List<LCAPRole> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(LCAPRole bean, List<String> updateFields);
    int batchUpdate(List<LCAPRole> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    LCAPRole selectOne(Long id);

    int createOrUpdate(LCAPRole bean);
    int updateBy(LCAPRole bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}