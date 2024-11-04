package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadWarehousingTableView_1CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8> getAnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8(@Param("filter") ProductInStorageEntity filter, @Param("timeHorizon") TimeHorizonStructure timeHorizon, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("dataViewAuthority") List<String> dataViewAuthority, @Param("order") String order); 

Long countAnonymousStructure_81A8CC5CC06F9C7D99E953A4911ACAE8(@Param("filter") ProductInStorageEntity filter, @Param("timeHorizon") TimeHorizonStructure timeHorizon, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("dataViewAuthority") List<String> dataViewAuthority, @Param("order") String order); 


}
