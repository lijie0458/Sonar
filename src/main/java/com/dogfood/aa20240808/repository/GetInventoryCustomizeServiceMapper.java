package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetInventoryCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344> getAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(@Param("materialCode") String materialCode, @Param("storageLocationId") Long storageLocationId, @Param("warehouse") Long warehouse); 

Long countAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(@Param("materialCode") String materialCode, @Param("storageLocationId") Long storageLocationId, @Param("warehouse") Long warehouse); 


}
