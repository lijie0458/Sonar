package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631; 
import org.apache.ibatis.annotations.Param; 

public interface LoadRoleManagementTableView_4CustomizeServiceMapper {

List<AnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631> getAnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631(@Param("roleId") Long roleId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_332BAA1FA3E1D6EDE0207753241B0631(@Param("roleId") Long roleId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

}
