package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadPurchaseDetailsByRequestNumberCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_01111CA3E3650D568675CF6F150A301E> getAnonymousStructure_01111CA3E3650D568675CF6F150A301E(@Param("request_number") String request_number); 

Long countAnonymousStructure_01111CA3E3650D568675CF6F150A301E(@Param("request_number") String request_number); 


}
