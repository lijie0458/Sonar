package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.OtherReturnStorageDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate OtherReturnStorageDetailsEntity Mapper
*
* @author sys
*/
public interface OtherReturnStorageDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(OtherReturnStorageDetailsEntity bean);
    int batchInsert(List<OtherReturnStorageDetailsEntity> beans);
    List<OtherReturnStorageDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(OtherReturnStorageDetailsEntity bean, List<String> updateFields);
    int batchUpdate(List<OtherReturnStorageDetailsEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    OtherReturnStorageDetailsEntity selectOne(Long id);

    int createOrUpdate(OtherReturnStorageDetailsEntity bean);
    int updateBy(OtherReturnStorageDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}