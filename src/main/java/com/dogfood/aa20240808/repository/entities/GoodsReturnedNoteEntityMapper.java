package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate GoodsReturnedNoteEntity Mapper
*
* @author sys
*/
public interface GoodsReturnedNoteEntityMapper extends ReferenceHandleMapper {

    int insert(GoodsReturnedNoteEntity bean);

    int batchInsert(List<GoodsReturnedNoteEntity> beans);

    int updateBy(GoodsReturnedNoteEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(GoodsReturnedNoteEntity bean);

    int update(GoodsReturnedNoteEntity bean, List<String> updateFields);

    int batchUpdate(List<GoodsReturnedNoteEntity> beans, List<String> updateFields);

    int delete(String id);

    int batchDelete(List<String> ids);

    GoodsReturnedNoteEntity selectOne(String id);


    List<GoodsReturnedNoteEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}