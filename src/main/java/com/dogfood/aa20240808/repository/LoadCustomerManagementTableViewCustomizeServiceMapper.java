package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.entities.CustomerManagementEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadCustomerManagementTableViewCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1> getAnonymousStructure_826FFD3E738FEC2EAB499855162B82C1(@Param("filter") CustomerManagementEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_826FFD3E738FEC2EAB499855162B82C1(@Param("filter") CustomerManagementEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 


}
