package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadWarehouseByCodeCustomizeServiceMapper {

List<Long> getLong(@Param("param1") String param1); 

Long countLong(@Param("param1") String param1); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2> getAnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2(@Param("variable1") List<Long> variable1); 

Long countAnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2(@Param("variable1") List<Long> variable1); 


}
