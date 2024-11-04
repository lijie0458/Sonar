package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadWarehousingDetailsSelect_15CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC> getAnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

Long countAnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 


}
