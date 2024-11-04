package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate OutsourceInStorageEntity Mapper
*
* @author sys
*/
public interface OutsourceInStorageEntityMapper extends ReferenceHandleMapper {

    int insert(OutsourceInStorageEntity bean);
    int batchInsert(List<OutsourceInStorageEntity> beans);
    List<OutsourceInStorageEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(OutsourceInStorageEntity bean, List<String> updateFields);
    int batchUpdate(List<OutsourceInStorageEntity> beans, List<String> updateFields);
    int delete(String id);
    int batchDelete(List<String> ids);
    OutsourceInStorageEntity selectOne(String id);

    int createOrUpdate(OutsourceInStorageEntity bean);
    int updateBy(OutsourceInStorageEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}