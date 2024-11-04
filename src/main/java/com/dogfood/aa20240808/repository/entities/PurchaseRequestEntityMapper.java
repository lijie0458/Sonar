package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.PurchaseRequestEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate PurchaseRequestEntity Mapper
*
* @author sys
*/
public interface PurchaseRequestEntityMapper extends ReferenceHandleMapper {

    int insert(PurchaseRequestEntity bean);
    int batchInsert(List<PurchaseRequestEntity> beans);
    List<PurchaseRequestEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(PurchaseRequestEntity bean, List<String> updateFields);
    int batchUpdate(List<PurchaseRequestEntity> beans, List<String> updateFields);
    int delete(String id);
    int batchDelete(List<String> ids);
    PurchaseRequestEntity selectOne(String id);

    int createOrUpdate(PurchaseRequestEntity bean);
    int updateBy(PurchaseRequestEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}