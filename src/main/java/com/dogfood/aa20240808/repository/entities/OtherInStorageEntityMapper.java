package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.OtherInStorageEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate OtherInStorageEntity Mapper
*
* @author sys
*/
public interface OtherInStorageEntityMapper extends ReferenceHandleMapper {

    int insert(OtherInStorageEntity bean);
    int batchInsert(List<OtherInStorageEntity> beans);
    List<OtherInStorageEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(OtherInStorageEntity bean, List<String> updateFields);
    int batchUpdate(List<OtherInStorageEntity> beans, List<String> updateFields);
    int delete(String id);
    int batchDelete(List<String> ids);
    OtherInStorageEntity selectOne(String id);

    int createOrUpdate(OtherInStorageEntity bean);
    int updateBy(OtherInStorageEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}