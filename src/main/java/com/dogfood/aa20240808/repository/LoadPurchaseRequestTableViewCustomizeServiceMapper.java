package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.entities.PurchaseRequestEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadPurchaseRequestTableViewCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7FF730EDA24859558C689731C4BB4575> getAnonymousStructure_7FF730EDA24859558C689731C4BB4575(@Param("filter") PurchaseRequestEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_7FF730EDA24859558C689731C4BB4575(@Param("filter") PurchaseRequestEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 


}
