package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface PERLoadOrgUserTableViewCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D> getAnonymousStructure_767B64E0A8935388CB3E9BF139E6586D(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("orgId") Long orgId); 

Long countAnonymousStructure_767B64E0A8935388CB3E9BF139E6586D(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("orgId") Long orgId); 


}
