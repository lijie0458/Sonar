package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate OutsourceInStorageDetailsEntity Mapper
*
* @author sys
*/
public interface OutsourceInStorageDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(OutsourceInStorageDetailsEntity bean);
    int batchInsert(List<OutsourceInStorageDetailsEntity> beans);
    List<OutsourceInStorageDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(OutsourceInStorageDetailsEntity bean, List<String> updateFields);
    int batchUpdate(List<OutsourceInStorageDetailsEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    OutsourceInStorageDetailsEntity selectOne(Long id);

    int createOrUpdate(OutsourceInStorageDetailsEntity bean);
    int updateBy(OutsourceInStorageDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}