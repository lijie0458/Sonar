package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.PurchaseDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate PurchaseDetailsEntity Mapper
*
* @author sys
*/
public interface PurchaseDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(PurchaseDetailsEntity bean);

    int batchInsert(List<PurchaseDetailsEntity> beans);

    int updateBy(PurchaseDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(PurchaseDetailsEntity bean);

    int update(PurchaseDetailsEntity bean, List<String> updateFields);

    int batchUpdate(List<PurchaseDetailsEntity> beans, List<String> updateFields);

    int delete(Long id);

    int batchDelete(List<Long> ids);

    PurchaseDetailsEntity selectOne(Long id);


    List<PurchaseDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}