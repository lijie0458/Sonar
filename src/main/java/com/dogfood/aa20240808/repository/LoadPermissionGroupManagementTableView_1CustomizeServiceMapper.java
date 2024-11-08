package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E; 
import org.apache.ibatis.annotations.Param; 

public interface LoadPermissionGroupManagementTableView_1CustomizeServiceMapper {

List<AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E> getAnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

}
