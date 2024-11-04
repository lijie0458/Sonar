package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import com.dogfood.aa20240808.domain.entities.SalesOrdersEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadSalesOrderPageTableView_2CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_89F444DCB36F3A425473660EC2B0814E> getAnonymousStructure_89F444DCB36F3A425473660EC2B0814E(@Param("filter") SalesOrdersEntity filter, @Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 


}
