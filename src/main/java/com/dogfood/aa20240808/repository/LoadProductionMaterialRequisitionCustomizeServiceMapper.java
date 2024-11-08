package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396; 
import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import org.apache.ibatis.annotations.Param; 

public interface LoadProductionMaterialRequisitionCustomizeServiceMapper {

List<AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396> getSql1(@Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum); 

}
