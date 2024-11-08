package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344; 
import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadSelectInventoryByCodeAndCustomizeServiceMapper {

List<AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344> getAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(@Param("warehouse") Long warehouse, @Param("Code") List<String> Code, @Param("batchNumber") List<String> batchNumber); 

Long countAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(@Param("warehouse") Long warehouse, @Param("Code") List<String> Code, @Param("batchNumber") List<String> batchNumber); 

}
