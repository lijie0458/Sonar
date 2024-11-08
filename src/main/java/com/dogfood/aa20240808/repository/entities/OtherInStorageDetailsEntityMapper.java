package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.OtherInStorageDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate OtherInStorageDetailsEntity Mapper
*
* @author sys
*/
public interface OtherInStorageDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(OtherInStorageDetailsEntity bean);

    int batchInsert(List<OtherInStorageDetailsEntity> beans);

    int updateBy(OtherInStorageDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(OtherInStorageDetailsEntity bean);

    int update(OtherInStorageDetailsEntity bean, List<String> updateFields);

    int batchUpdate(List<OtherInStorageDetailsEntity> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    OtherInStorageDetailsEntity selectOne(Long id);


    List<OtherInStorageDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}