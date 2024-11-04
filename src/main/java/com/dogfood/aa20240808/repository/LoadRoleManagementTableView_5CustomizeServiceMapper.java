package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadRoleManagementTableView_5CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B> getAnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B(@Param("roleId") Long roleId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B(@Param("roleId") Long roleId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_412E9C147CB3C99353FD18461376E868> getAnonymousStructure_412E9C147CB3C99353FD18461376E868(@Param("variable2") List<String> variable2); 

Long countAnonymousStructure_412E9C147CB3C99353FD18461376E868(@Param("variable2") List<String> variable2); 


}
