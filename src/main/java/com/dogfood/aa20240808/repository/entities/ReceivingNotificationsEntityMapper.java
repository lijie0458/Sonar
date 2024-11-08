package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.ReceivingNotificationsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate ReceivingNotificationsEntity Mapper
*
* @author sys
*/
public interface ReceivingNotificationsEntityMapper extends ReferenceHandleMapper {

    int insert(ReceivingNotificationsEntity bean);

    int batchInsert(List<ReceivingNotificationsEntity> beans);

    int updateBy(ReceivingNotificationsEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(ReceivingNotificationsEntity bean);

    int update(ReceivingNotificationsEntity bean, List<String> updateFields);

    int batchUpdate(List<ReceivingNotificationsEntity> beans, List<String> updateFields);

    int delete(String id);

    int batchDelete(List<String> ids);

    ReceivingNotificationsEntity selectOne(String id);


    List<ReceivingNotificationsEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}