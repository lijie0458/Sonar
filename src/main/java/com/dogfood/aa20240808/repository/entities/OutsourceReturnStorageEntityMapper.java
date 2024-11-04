package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate OutsourceReturnStorageEntity Mapper
*
* @author sys
*/
public interface OutsourceReturnStorageEntityMapper extends ReferenceHandleMapper {

    int insert(OutsourceReturnStorageEntity bean);
    int batchInsert(List<OutsourceReturnStorageEntity> beans);
    List<OutsourceReturnStorageEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(OutsourceReturnStorageEntity bean, List<String> updateFields);
    int batchUpdate(List<OutsourceReturnStorageEntity> beans, List<String> updateFields);
    int delete(String id);
    int batchDelete(List<String> ids);
    OutsourceReturnStorageEntity selectOne(String id);

    int createOrUpdate(OutsourceReturnStorageEntity bean);
    int updateBy(OutsourceReturnStorageEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}