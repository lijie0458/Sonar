package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_611269E21EE6FE18529B487D4B579CBA; 
import org.apache.ibatis.annotations.Param; 

public interface LoadAddGoodsReturnedNoteUpdateSelect_2CustomizeServiceMapper {

List<AnonymousStructure_611269E21EE6FE18529B487D4B579CBA> getAnonymousStructure_611269E21EE6FE18529B487D4B579CBA(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

Long countAnonymousStructure_611269E21EE6FE18529B487D4B579CBA(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

List<AnonymousStructure_611269E21EE6FE18529B487D4B579CBA> getAnonymousStructure_611269E21EE6FE18529B487D4B579CBA1(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("List") List<String> List); 

Long countAnonymousStructure_611269E21EE6FE18529B487D4B579CBA1(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("List") List<String> List); 

}
