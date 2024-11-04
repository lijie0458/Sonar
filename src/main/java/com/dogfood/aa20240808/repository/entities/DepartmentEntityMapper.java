package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.DepartmentEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate DepartmentEntity Mapper
*
* @author sys
*/
public interface DepartmentEntityMapper extends ReferenceHandleMapper {

    int insert(DepartmentEntity bean);
    int batchInsert(List<DepartmentEntity> beans);
    List<DepartmentEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(DepartmentEntity bean, List<String> updateFields);
    int batchUpdate(List<DepartmentEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    DepartmentEntity selectOne(Long id);

    int createOrUpdate(DepartmentEntity bean);
    int updateBy(DepartmentEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}