package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadProductReturnStorageDetailsSelect_1CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_742E48DFC5C3FE76DFBCFC5AEB7FA442> getAnonymousStructure_742E48DFC5C3FE76DFBCFC5AEB7FA442(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("isUpdate") Boolean isUpdate); 

Long countAnonymousStructure_742E48DFC5C3FE76DFBCFC5AEB7FA442(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("isUpdate") Boolean isUpdate); 


}
