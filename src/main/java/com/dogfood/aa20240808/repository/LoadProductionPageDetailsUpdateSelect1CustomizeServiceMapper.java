package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadProductionPageDetailsUpdateSelect1CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F59E0BB3343234CE3AF6447EE8462582> getSql1(@Param("orderNumber") String orderNumber); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_59171EEBD007C582328CDFD57C58FB34> getAnonymousStructure_59171EEBD007C582328CDFD57C58FB34(@Param("orderNumber") String orderNumber, @Param("ListMaterialDetailsCode") List<String> ListMaterialDetailsCode, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

Long countAnonymousStructure_59171EEBD007C582328CDFD57C58FB34(@Param("orderNumber") String orderNumber, @Param("ListMaterialDetailsCode") List<String> ListMaterialDetailsCode, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 


}
