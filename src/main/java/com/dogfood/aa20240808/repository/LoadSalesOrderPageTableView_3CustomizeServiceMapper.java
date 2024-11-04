package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import com.dogfood.aa20240808.domain.entities.SalesOrdersEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadSalesOrderPageTableView_3CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_89F444DCB36F3A425473660EC2B0814E> getAnonymousStructure_89F444DCB36F3A425473660EC2B0814E(@Param("filter") SalesOrdersEntity filter, @Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_89F444DCB36F3A425473660EC2B0814E(@Param("filter") SalesOrdersEntity filter, @Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 


}
