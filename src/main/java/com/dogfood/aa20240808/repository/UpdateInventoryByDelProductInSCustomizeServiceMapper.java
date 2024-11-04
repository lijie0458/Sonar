package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface UpdateInventoryByDelProductInSCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_551A796780D99168E3E45C648EE58217> getAnonymousStructure_551A796780D99168E3E45C648EE58217(@Param("productInSNum") String productInSNum); 

Long countAnonymousStructure_551A796780D99168E3E45C648EE58217(@Param("productInSNum") String productInSNum); 


}
