package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate MaterialDetailsEntity Mapper
*
* @author sys
*/
public interface MaterialDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(MaterialDetailsEntity bean);

    int batchInsert(List<MaterialDetailsEntity> beans);

    int updateBy(MaterialDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(MaterialDetailsEntity bean);

    int update(MaterialDetailsEntity bean, List<String> updateFields);

    int batchUpdate(List<MaterialDetailsEntity> beans, List<String> updateFields);

    int delete(String id);

    int batchDelete(List<String> ids);

    MaterialDetailsEntity selectOne(String id);


    List<MaterialDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}