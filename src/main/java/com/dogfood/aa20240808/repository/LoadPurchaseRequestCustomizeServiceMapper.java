package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadPurchaseRequestCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_01111CA3E3650D568675CF6F150A301E> getAnonymousStructure_01111CA3E3650D568675CF6F150A301E(@Param("Code") List<String> Code); 

Long countAnonymousStructure_01111CA3E3650D568675CF6F150A301E(@Param("Code") List<String> Code); 


}
