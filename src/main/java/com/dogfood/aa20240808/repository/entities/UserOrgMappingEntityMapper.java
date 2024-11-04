package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.UserOrgMappingEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate UserOrgMappingEntity Mapper
*
* @author sys
*/
public interface UserOrgMappingEntityMapper extends ReferenceHandleMapper {

    int insert(UserOrgMappingEntity bean);
    int batchInsert(List<UserOrgMappingEntity> beans);
    List<UserOrgMappingEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(UserOrgMappingEntity bean, List<String> updateFields);
    int batchUpdate(List<UserOrgMappingEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    UserOrgMappingEntity selectOne(Long id);

    int createOrUpdate(UserOrgMappingEntity bean);
    int updateBy(UserOrgMappingEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}