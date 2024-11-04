package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.entities.OtherReturnStorageEntity; 
import org.apache.ibatis.annotations.Param; 
import com.dogfood.aa20240808.domain.entities.OtherInStorageEntity; 

public interface LoadOtherReturnStorageTableView_4CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC> getAnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC(@Param("filter") OtherInStorageEntity filter, @Param("timeHorizon") TimeHorizonStructure timeHorizon, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("filter1") OtherReturnStorageEntity filter1, @Param("sort") String sort, @Param("dataViewAuthority") List<String> dataViewAuthority, @Param("order") String order); 

Long countAnonymousStructure_1679D465C0FA8643966EC3B0EF0EDFFC(@Param("filter") OtherInStorageEntity filter, @Param("timeHorizon") TimeHorizonStructure timeHorizon, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("filter1") OtherReturnStorageEntity filter1, @Param("sort") String sort, @Param("dataViewAuthority") List<String> dataViewAuthority, @Param("order") String order); 


}
