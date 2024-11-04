package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.entities.BePutInStorageEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import org.apache.ibatis.annotations.Param; 

public interface LoadBePutInStorageListTableView_2CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B3517114D7D75A04E66F8916E0CC7388> getAnonymousStructure_B3517114D7D75A04E66F8916E0CC7388(@Param("filter") BePutInStorageEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_B3517114D7D75A04E66F8916E0CC7388(@Param("filter") BePutInStorageEntity filter, @Param("dataViewAuthorityUserNameList") List<String> dataViewAuthorityUserNameList, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("TimeHorizon") TimeHorizonStructure TimeHorizon, @Param("sort") String sort, @Param("order") String order); 


}
