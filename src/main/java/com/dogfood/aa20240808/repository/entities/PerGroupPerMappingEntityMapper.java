package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.PerGroupPerMappingEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate PerGroupPerMappingEntity Mapper
*
* @author sys
*/
public interface PerGroupPerMappingEntityMapper extends ReferenceHandleMapper {

    int insert(PerGroupPerMappingEntity bean);

    int batchInsert(List<PerGroupPerMappingEntity> beans);

    int updateBy(PerGroupPerMappingEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(PerGroupPerMappingEntity bean);

    int update(PerGroupPerMappingEntity bean, List<String> updateFields);

    int batchUpdate(List<PerGroupPerMappingEntity> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    PerGroupPerMappingEntity selectOne(Long id);


    List<PerGroupPerMappingEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}