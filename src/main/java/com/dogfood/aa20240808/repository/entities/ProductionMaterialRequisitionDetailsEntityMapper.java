package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionDetailsEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate ProductionMaterialRequisitionDetailsEntity Mapper
*
* @author sys
*/
public interface ProductionMaterialRequisitionDetailsEntityMapper extends ReferenceHandleMapper {

    int insert(ProductionMaterialRequisitionDetailsEntity bean);
    int batchInsert(List<ProductionMaterialRequisitionDetailsEntity> beans);
    List<ProductionMaterialRequisitionDetailsEntity> selectList(@Param("filter") AbstractQueryFilter filter);
    int count(@Param("filter") AbstractQueryFilter filter);

    int update(ProductionMaterialRequisitionDetailsEntity bean, List<String> updateFields);
    int batchUpdate(List<ProductionMaterialRequisitionDetailsEntity> beans, List<String> updateFields);
    int delete(Long id);
    int batchDelete(List<Long> ids);
    ProductionMaterialRequisitionDetailsEntity selectOne(Long id);

    int createOrUpdate(ProductionMaterialRequisitionDetailsEntity bean);
    int updateBy(ProductionMaterialRequisitionDetailsEntity bean, List<String> updateFields, AbstractQueryFilter filter);
    int deleteBy(@Param("filter") AbstractQueryFilter filter);

}