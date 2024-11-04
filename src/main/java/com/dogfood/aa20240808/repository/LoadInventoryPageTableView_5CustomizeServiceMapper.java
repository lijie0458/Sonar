package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadInventoryPageTableView_5CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A5883BF58719F0F4646C4980B8917913> getAnonymousStructure_A5883BF58719F0F4646C4980B8917913(@Param("filter") InventoryEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_A5883BF58719F0F4646C4980B8917913(@Param("filter") InventoryEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6CB10721F5792DE379A9BB7841F3A2C2> getSql1(@Param("filter") InventoryEntity filter, @Param("size") Long size, @Param("page1") Long page1); 


}
