package com.dogfood.aa20240808.repository.entities;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.math.BigDecimal;
import java.math.BigDecimal;
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionEntity;
import com.dogfood.aa20240808.repository.ReferenceHandleMapper;
import com.dogfood.aa20240808.service.dto.filters.AbstractQueryFilter;
import org.apache.ibatis.annotations.Param;
/**
* auto generate ProductionMaterialRequisitionEntity Mapper
*
* @author sys
*/
public interface ProductionMaterialRequisitionEntityMapper extends ReferenceHandleMapper {

    int insert(ProductionMaterialRequisitionEntity bean);

    int batchInsert(List<ProductionMaterialRequisitionEntity> beans);

    int updateBy(ProductionMaterialRequisitionEntity bean, List<String> updateFields, AbstractQueryFilter filter);

    int deleteBy(@Param("filter") AbstractQueryFilter filter);

    int createOrUpdate(ProductionMaterialRequisitionEntity bean);

    int update(ProductionMaterialRequisitionEntity bean, List<String> updateFields);

    int batchUpdate(List<ProductionMaterialRequisitionEntity> beans, List<String> updateFields);

    int delete(String id);

    int batchDelete(List<String> ids);

    ProductionMaterialRequisitionEntity selectOne(String id);


    List<ProductionMaterialRequisitionEntity> selectList(@Param("filter") AbstractQueryFilter filter);

    int count(@Param("filter") AbstractQueryFilter filter);
}