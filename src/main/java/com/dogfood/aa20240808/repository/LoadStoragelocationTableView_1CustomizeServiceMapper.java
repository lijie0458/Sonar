package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadStoragelocationTableView_1CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B88F011A8230B3D8558EA571687E646A> getAnonymousStructure_B88F011A8230B3D8558EA571687E646A(@Param("filter") Storage_locationEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_B88F011A8230B3D8558EA571687E646A(@Param("filter") Storage_locationEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 


}
