package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetInventoryByMaterialDetails1CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344> getAnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344(@Param("warehouseId") Long warehouseId, @Param("locationId") Long locationId, @Param("materialCode") String materialCode); 


}
