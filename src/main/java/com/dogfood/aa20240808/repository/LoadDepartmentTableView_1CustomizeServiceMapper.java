package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_412E9C147CB3C99353FD18461376E868; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import org.apache.ibatis.annotations.Param; 

public interface LoadDepartmentTableView_1CustomizeServiceMapper {

List<AnonymousStructure_412E9C147CB3C99353FD18461376E868> getAnonymousStructure_412E9C147CB3C99353FD18461376E868(@Param("filter") LCAPUser filter, @Param("departmentId") Long departmentId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_412E9C147CB3C99353FD18461376E868(@Param("filter") LCAPUser filter, @Param("departmentId") Long departmentId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

}
