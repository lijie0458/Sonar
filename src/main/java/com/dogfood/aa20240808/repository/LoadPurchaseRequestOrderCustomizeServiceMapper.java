package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_01111CA3E3650D568675CF6F150A301E; 
import org.apache.ibatis.annotations.Param; 

public interface LoadPurchaseRequestOrderCustomizeServiceMapper {

List<AnonymousStructure_01111CA3E3650D568675CF6F150A301E> getAnonymousStructure_01111CA3E3650D568675CF6F150A301E(@Param("Code") List<Long> Code); 

Long countAnonymousStructure_01111CA3E3650D568675CF6F150A301E(@Param("Code") List<Long> Code); 

}
