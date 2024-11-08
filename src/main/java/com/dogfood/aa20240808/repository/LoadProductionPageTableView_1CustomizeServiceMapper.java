package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8; 
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import org.apache.ibatis.annotations.Param; 

public interface LoadProductionPageTableView_1CustomizeServiceMapper {

List<AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8> getAnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8(@Param("filter") ProductionMaterialRequisitionEntity filter, @Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8(@Param("filter") ProductionMaterialRequisitionEntity filter, @Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 

}
