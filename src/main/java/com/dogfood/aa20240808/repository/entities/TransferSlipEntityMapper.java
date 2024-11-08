package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.TransferSlipEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate TransferSlipEntity Mapper
*
* @author sys
*/
public interface TransferSlipEntityMapper extends ReferenceHandleMapper {

    int insert(TransferSlipEntity bean);

    int batchInsert(List<TransferSlipEntity> beans);

    int updateBy(TransferSlipEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(TransferSlipEntity bean);

    int update(TransferSlipEntity bean, List<String> updateFields);

    int batchUpdate(List<TransferSlipEntity> beans, List<String> updateFields);

    int delete(String id);

    int batchDelete(List<String> ids);

    TransferSlipEntity selectOne(String id);


    List<TransferSlipEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}