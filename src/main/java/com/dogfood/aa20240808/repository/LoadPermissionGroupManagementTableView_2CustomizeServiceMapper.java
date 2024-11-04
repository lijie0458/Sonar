package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadPermissionGroupManagementTableView_2CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5> getAnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5(@Param("perGroupId") Long perGroupId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5(@Param("perGroupId") Long perGroupId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 


}
