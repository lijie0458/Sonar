package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface IAMLoadAccountBindDataCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E6204F88FA3760A005F0E371750B535E> getAnonymousStructure_E6204F88FA3760A005F0E371750B535E(); 

Long countAnonymousStructure_E6204F88FA3760A005F0E371750B535E(); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF> getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(@Param("userId") String userId); 

Long countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(@Param("userId") String userId); 


}
