package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.PermissionGroupEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate PermissionGroupEntity Mapper
*
* @author sys
*/
public interface PermissionGroupEntityMapper extends ReferenceHandleMapper {

    int insert(PermissionGroupEntity bean);
    int batchInsert(List<PermissionGroupEntity> beans);
    List<PermissionGroupEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(PermissionGroupEntity bean, List<String> updateFields);
    int batchUpdate(List<PermissionGroupEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    PermissionGroupEntity selectOne(Long id);

    int createOrUpdate(PermissionGroupEntity bean);
    int updateBy(PermissionGroupEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}