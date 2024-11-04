package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface UpdateProductInSUnreturnQuantityCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A5F5ED3CF74D96011E0704718C47ACE4> getAnonymousStructure_A5F5ED3CF74D96011E0704718C47ACE4(@Param("productReturnCode") String productReturnCode); 

Long countAnonymousStructure_A5F5ED3CF74D96011E0704718C47ACE4(@Param("productReturnCode") String productReturnCode); 


}
