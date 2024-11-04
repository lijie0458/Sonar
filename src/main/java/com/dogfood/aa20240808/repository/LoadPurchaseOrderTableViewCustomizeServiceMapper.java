package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.entities.PurchaseOrderEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import org.apache.ibatis.annotations.Param; 

public interface LoadPurchaseOrderTableViewCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6> getAnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6(@Param("filter") PurchaseOrderEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6(@Param("filter") PurchaseOrderEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6> getAnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE61(@Param("filter") PurchaseOrderEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE61(@Param("filter") PurchaseOrderEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 


}
