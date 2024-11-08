package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.AppConfigEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate AppConfigEntity Mapper
*
* @author sys
*/
public interface AppConfigEntityMapper extends ReferenceHandleMapper {

    int insert(AppConfigEntity bean);

    int batchInsert(List<AppConfigEntity> beans);

    int updateBy(AppConfigEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(AppConfigEntity bean);

    int update(AppConfigEntity bean, List<String> updateFields);

    int batchUpdate(List<AppConfigEntity> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    AppConfigEntity selectOne(Long id);


    List<AppConfigEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}