package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.CustomerManagementEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate CustomerManagementEntity Mapper
*
* @author sys
*/
public interface CustomerManagementEntityMapper extends ReferenceHandleMapper {

    int insert(CustomerManagementEntity bean);
    int batchInsert(List<CustomerManagementEntity> beans);
    List<CustomerManagementEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(CustomerManagementEntity bean, List<String> updateFields);
    int batchUpdate(List<CustomerManagementEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    CustomerManagementEntity selectOne(Long id);

    int createOrUpdate(CustomerManagementEntity bean);
    int updateBy(CustomerManagementEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}