package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 
import com.dogfood.aa20240808.domain.entities.LCAPPermission; 

public interface LoadPermissionResourceManagementTableView_1CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD> getAnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD(@Param("filter") LCAPPermission filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD(@Param("filter") LCAPPermission filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 


}
