package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadInventoryPageTableView_4CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9195440D3385CF4C1A29F6E904E75D4D> getAnonymousStructure_9195440D3385CF4C1A29F6E904E75D4D(@Param("filter") InventoryEntity filter, @Param("sort") String sort, @Param("order") String order); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_424448B1B7A0AC083FF2F95BF7CC36C4> getSql1(@Param("filter") InventoryEntity filter, @Param("lcap_AA9F73EE_limit") Long lcap_AA9F73EE_limit, @Param("lcap_7A86C157_offset") Long lcap_7A86C157_offset); 

Long countSql1(@Param("filter") InventoryEntity filter, @Param("lcap_AA9F73EE_limit") Long lcap_AA9F73EE_limit, @Param("lcap_7A86C157_offset") Long lcap_7A86C157_offset); 


}
