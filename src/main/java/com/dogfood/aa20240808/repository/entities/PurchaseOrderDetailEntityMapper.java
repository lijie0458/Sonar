package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.PurchaseOrderDetailEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate PurchaseOrderDetailEntity Mapper
*
* @author sys
*/
public interface PurchaseOrderDetailEntityMapper extends ReferenceHandleMapper {

    int insert(PurchaseOrderDetailEntity bean);

    int batchInsert(List<PurchaseOrderDetailEntity> beans);

    int updateBy(PurchaseOrderDetailEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(PurchaseOrderDetailEntity bean);

    int update(PurchaseOrderDetailEntity bean, List<String> updateFields);

    int batchUpdate(List<PurchaseOrderDetailEntity> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    PurchaseOrderDetailEntity selectOne(Long id);


    List<PurchaseOrderDetailEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}