package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate GoodsReturnedNoteDetailsEntity Mapper
*
* @author sys
*/
public interface GoodsReturnedNoteDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(GoodsReturnedNoteDetailsEntity bean);
    int batchInsert(List<GoodsReturnedNoteDetailsEntity> beans);
    List<GoodsReturnedNoteDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(GoodsReturnedNoteDetailsEntity bean, List<String> updateFields);
    int batchUpdate(List<GoodsReturnedNoteDetailsEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    GoodsReturnedNoteDetailsEntity selectOne(Long id);

    int createOrUpdate(GoodsReturnedNoteDetailsEntity bean);
    int updateBy(GoodsReturnedNoteDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}