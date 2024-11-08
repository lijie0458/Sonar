package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.LCAPUser;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate LCAPUser Mapper
*
* @author sys
*/
public interface LCAPUserMapper extends ReferenceHandleMapper {

    int insert(LCAPUser bean);

    int batchInsert(List<LCAPUser> beans);

    int updateBy(LCAPUser bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(LCAPUser bean);

    int update(LCAPUser bean, List<String> updateFields);

    int batchUpdate(List<LCAPUser> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    LCAPUser selectOne(Long id);


    List<LCAPUser> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}