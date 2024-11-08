package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.ThirdIdentityEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate ThirdIdentityEntity Mapper
*
* @author sys
*/
public interface ThirdIdentityEntityMapper extends ReferenceHandleMapper {

    int insert(ThirdIdentityEntity bean);

    int batchInsert(List<ThirdIdentityEntity> beans);

    int updateBy(ThirdIdentityEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(ThirdIdentityEntity bean);

    int update(ThirdIdentityEntity bean, List<String> updateFields);

    int batchUpdate(List<ThirdIdentityEntity> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    ThirdIdentityEntity selectOne(Long id);


    List<ThirdIdentityEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}