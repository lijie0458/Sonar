package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.LCAPUserRoleMapping;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate LCAPUserRoleMapping Mapper
*
* @author sys
*/
public interface LCAPUserRoleMappingMapper extends ReferenceHandleMapper {

    int insert(LCAPUserRoleMapping bean);

    int batchInsert(List<LCAPUserRoleMapping> beans);

    int updateBy(LCAPUserRoleMapping bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(LCAPUserRoleMapping bean);

    int update(LCAPUserRoleMapping bean, List<String> updateFields);

    int batchUpdate(List<LCAPUserRoleMapping> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    LCAPUserRoleMapping selectOne(Long id);


    List<LCAPUserRoleMapping> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}