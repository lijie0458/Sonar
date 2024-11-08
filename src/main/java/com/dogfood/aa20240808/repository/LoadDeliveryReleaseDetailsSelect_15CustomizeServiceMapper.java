package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB; 
import org.apache.ibatis.annotations.Param; 

public interface LoadDeliveryReleaseDetailsSelect_15CustomizeServiceMapper {

List<AnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB> getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(@Param("warehouseId") Long warehouseId); 

Long countAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(@Param("warehouseId") Long warehouseId); 

}
