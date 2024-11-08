package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.BePutInStorageEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate BePutInStorageEntity Mapper
*
* @author sys
*/
public interface BePutInStorageEntityMapper extends ReferenceHandleMapper {

    int insert(BePutInStorageEntity bean);

    int batchInsert(List<BePutInStorageEntity> beans);

    int updateBy(BePutInStorageEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(BePutInStorageEntity bean);

    int update(BePutInStorageEntity bean, List<String> updateFields);

    int batchUpdate(List<BePutInStorageEntity> beans, List<String> updateFields);

    int delete(String id);

    int batchDelete(List<String> ids);

    BePutInStorageEntity selectOne(String id);


    List<BePutInStorageEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}