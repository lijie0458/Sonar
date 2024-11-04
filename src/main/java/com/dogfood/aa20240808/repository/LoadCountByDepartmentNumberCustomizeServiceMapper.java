package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadCountByDepartmentNumberCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_EC270C00E4349160B6B0C122490BDB1B> getAnonymousStructure_EC270C00E4349160B6B0C122490BDB1B(@Param("param1") String param1); 

Long countAnonymousStructure_EC270C00E4349160B6B0C122490BDB1B(@Param("param1") String param1); 


}
