package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate IdentitySourceConfigEntity Mapper
*
* @author sys
*/
public interface IdentitySourceConfigEntityMapper extends ReferenceHandleMapper {

    int insert(IdentitySourceConfigEntity bean);
    int batchInsert(List<IdentitySourceConfigEntity> beans);
    List<IdentitySourceConfigEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(IdentitySourceConfigEntity bean, List<String> updateFields);
    int batchUpdate(List<IdentitySourceConfigEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    IdentitySourceConfigEntity selectOne(Long id);

    int createOrUpdate(IdentitySourceConfigEntity bean);
    int updateBy(IdentitySourceConfigEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}