package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LogicStorageLocationCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2> getAnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2(@Param("warehouse_name") String warehouse_name, @Param("warehouse_code") String warehouse_code); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB> getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(); 


}
