package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.ReceivingDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate ReceivingDetailsEntity Mapper
*
* @author sys
*/
public interface ReceivingDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(ReceivingDetailsEntity bean);
    int batchInsert(List<ReceivingDetailsEntity> beans);
    List<ReceivingDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(ReceivingDetailsEntity bean, List<String> updateFields);
    int batchUpdate(List<ReceivingDetailsEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    ReceivingDetailsEntity selectOne(Long id);

    int createOrUpdate(ReceivingDetailsEntity bean);
    int updateBy(ReceivingDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}