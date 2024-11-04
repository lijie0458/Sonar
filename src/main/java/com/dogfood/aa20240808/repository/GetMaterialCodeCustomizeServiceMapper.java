package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetMaterialCodeCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC> getAnonymousStructure_DA2B9A95B590E6E3C6876A301B6487BC(@Param("materialCode") String materialCode); 


}
