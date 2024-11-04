package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadlocationIdByWareHouseCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B88F011A8230B3D8558EA571687E646A> getAnonymousStructure_B88F011A8230B3D8558EA571687E646A(@Param("id") Long id); 

Long countAnonymousStructure_B88F011A8230B3D8558EA571687E646A(@Param("id") Long id); 


}
