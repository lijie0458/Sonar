package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetWarehousingDetailsByCode1CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CA8F7694D8827E13359AFAFE050C3CB8> getAnonymousStructure_CA8F7694D8827E13359AFAFE050C3CB8(@Param("Code") String Code); 

Long countAnonymousStructure_CA8F7694D8827E13359AFAFE050C3CB8(@Param("Code") String Code); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB> getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(@Param("variable2") List<Long> variable2); 

Long countAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(@Param("variable2") List<Long> variable2); 


}
