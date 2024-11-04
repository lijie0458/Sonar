package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadSalesOrderPageDetailsSelect_12CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1> getAnonymousStructure_826FFD3E738FEC2EAB499855162B82C1(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

Long countAnonymousStructure_826FFD3E738FEC2EAB499855162B82C1(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 


}
