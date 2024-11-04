package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetStoragelocationByStorageCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB> getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(@Param("storageId") Long storageId); 

Long countAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(@Param("storageId") Long storageId); 


}
