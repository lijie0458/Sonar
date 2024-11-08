package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.OtherReturnStorageEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate OtherReturnStorageEntity Mapper
*
* @author sys
*/
public interface OtherReturnStorageEntityMapper extends ReferenceHandleMapper {

    int insert(OtherReturnStorageEntity bean);

    int batchInsert(List<OtherReturnStorageEntity> beans);

    int updateBy(OtherReturnStorageEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(OtherReturnStorageEntity bean);

    int update(OtherReturnStorageEntity bean, List<String> updateFields);

    int batchUpdate(List<OtherReturnStorageEntity> beans, List<String> updateFields);

    int delete(String id);

    int batchDelete(List<String> ids);

    OtherReturnStorageEntity selectOne(String id);


    List<OtherReturnStorageEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}