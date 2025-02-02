package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.BePutInStorageDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate BePutInStorageDetailsEntity Mapper
*
* @author sys
*/
public interface BePutInStorageDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(BePutInStorageDetailsEntity bean);
    int batchInsert(List<BePutInStorageDetailsEntity> beans);
    List<BePutInStorageDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(BePutInStorageDetailsEntity bean, List<String> updateFields);
    int batchUpdate(List<BePutInStorageDetailsEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    BePutInStorageDetailsEntity selectOne(Long id);

    int createOrUpdate(BePutInStorageDetailsEntity bean);
    int updateBy(BePutInStorageDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}