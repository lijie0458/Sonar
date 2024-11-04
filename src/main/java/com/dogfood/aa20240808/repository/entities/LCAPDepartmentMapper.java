package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.LCAPDepartment;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate LCAPDepartment Mapper
*
* @author sys
*/
public interface LCAPDepartmentMapper extends ReferenceHandleMapper {

    int insert(LCAPDepartment bean);
    int batchInsert(List<LCAPDepartment> beans);
    List<LCAPDepartment> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(LCAPDepartment bean, List<String> updateFields);
    int batchUpdate(List<LCAPDepartment> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    LCAPDepartment selectOne(Long id);

    int createOrUpdate(LCAPDepartment bean);
    int updateBy(LCAPDepartment bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}