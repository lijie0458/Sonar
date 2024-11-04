package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.PageEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate PageEntity Mapper
*
* @author sys
*/
public interface PageEntityMapper extends ReferenceHandleMapper {

    int insert(PageEntity bean);
    int batchInsert(List<PageEntity> beans);
    List<PageEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(PageEntity bean, List<String> updateFields);
    int batchUpdate(List<PageEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    PageEntity selectOne(Long id);

    int createOrUpdate(PageEntity bean);
    int updateBy(PageEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}