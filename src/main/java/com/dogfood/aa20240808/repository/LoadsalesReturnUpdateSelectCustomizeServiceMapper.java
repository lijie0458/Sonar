package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C807E715FC032F8BE6027971BB14D4D0; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0C942FA717268536916F444E2B135D0C; 
import org.apache.ibatis.annotations.Param; 

public interface LoadsalesReturnUpdateSelectCustomizeServiceMapper {

List<AnonymousStructure_0C942FA717268536916F444E2B135D0C> getSql1(@Param("orderNumber") String orderNumber); 

List<AnonymousStructure_C807E715FC032F8BE6027971BB14D4D0> getAnonymousStructure_C807E715FC032F8BE6027971BB14D4D0(@Param("orderNumber") String orderNumber, @Param("ListMaterialDetailsCode") List<String> ListMaterialDetailsCode, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

Long countAnonymousStructure_C807E715FC032F8BE6027971BB14D4D0(@Param("orderNumber") String orderNumber, @Param("ListMaterialDetailsCode") List<String> ListMaterialDetailsCode, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

}
