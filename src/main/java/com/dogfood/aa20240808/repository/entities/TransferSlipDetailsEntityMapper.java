package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.TransferSlipDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate TransferSlipDetailsEntity Mapper
*
* @author sys
*/
public interface TransferSlipDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(TransferSlipDetailsEntity bean);
    int batchInsert(List<TransferSlipDetailsEntity> beans);
    List<TransferSlipDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(TransferSlipDetailsEntity bean, List<String> updateFields);
    int batchUpdate(List<TransferSlipDetailsEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    TransferSlipDetailsEntity selectOne(Long id);

    int createOrUpdate(TransferSlipDetailsEntity bean);
    int updateBy(TransferSlipDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}