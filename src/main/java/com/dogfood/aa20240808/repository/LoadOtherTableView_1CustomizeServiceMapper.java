package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import org.apache.ibatis.annotations.Param; 
import com.dogfood.aa20240808.domain.entities.OtherInStorageEntity; 

public interface LoadOtherTableView_1CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF> getAnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF(@Param("filter") OtherInStorageEntity filter, @Param("timeHorizon") TimeHorizonStructure timeHorizon, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("dataViewAuthority") List<String> dataViewAuthority, @Param("order") String order); 

Long countAnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF(@Param("filter") OtherInStorageEntity filter, @Param("timeHorizon") TimeHorizonStructure timeHorizon, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("dataViewAuthority") List<String> dataViewAuthority, @Param("order") String order); 


}
