package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD; 
import org.apache.ibatis.annotations.Param; 

public interface LoadPermissionGroupManagementTableView_3CustomizeServiceMapper {

List<AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5> getAnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5(@Param("perGrouptId") Long perGrouptId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5(@Param("perGrouptId") Long perGrouptId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

List<AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD> getAnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD(@Param("variable2") List<Long> variable2); 

Long countAnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD(@Param("variable2") List<Long> variable2); 

}
