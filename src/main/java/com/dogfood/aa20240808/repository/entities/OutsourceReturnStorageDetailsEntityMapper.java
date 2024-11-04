package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate OutsourceReturnStorageDetailsEntity Mapper
*
* @author sys
*/
public interface OutsourceReturnStorageDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(OutsourceReturnStorageDetailsEntity bean);
    int batchInsert(List<OutsourceReturnStorageDetailsEntity> beans);
    List<OutsourceReturnStorageDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(OutsourceReturnStorageDetailsEntity bean, List<String> updateFields);
    int batchUpdate(List<OutsourceReturnStorageDetailsEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    OutsourceReturnStorageDetailsEntity selectOne(Long id);

    int createOrUpdate(OutsourceReturnStorageDetailsEntity bean);
    int updateBy(OutsourceReturnStorageDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}