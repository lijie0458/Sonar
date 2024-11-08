package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.InventoryEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate InventoryEntity Mapper
*
* @author sys
*/
public interface InventoryEntityMapper extends ReferenceHandleMapper {

    int insert(InventoryEntity bean);

    int batchInsert(List<InventoryEntity> beans);

    int updateBy(InventoryEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(InventoryEntity bean);

    int update(InventoryEntity bean, List<String> updateFields);

    int batchUpdate(List<InventoryEntity> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    InventoryEntity selectOne(Long id);


    List<InventoryEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}