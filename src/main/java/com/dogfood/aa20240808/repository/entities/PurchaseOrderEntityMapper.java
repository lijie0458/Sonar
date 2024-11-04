package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.PurchaseOrderEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate PurchaseOrderEntity Mapper
*
* @author sys
*/
public interface PurchaseOrderEntityMapper extends ReferenceHandleMapper {

    int insert(PurchaseOrderEntity bean);
    int batchInsert(List<PurchaseOrderEntity> beans);
    List<PurchaseOrderEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(PurchaseOrderEntity bean, List<String> updateFields);
    int batchUpdate(List<PurchaseOrderEntity> beans, List<String> updateFields);
    int delete(String id);
    int batchDelete(List<String> ids);
    PurchaseOrderEntity selectOne(String id);

    int createOrUpdate(PurchaseOrderEntity bean);
    int updateBy(PurchaseOrderEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}