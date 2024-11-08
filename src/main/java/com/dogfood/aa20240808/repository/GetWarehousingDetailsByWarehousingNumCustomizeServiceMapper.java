package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E92E2863764D2238A46559F497F7ACA4; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB; 
import org.apache.ibatis.annotations.Param; 

public interface GetWarehousingDetailsByWarehousingNumCustomizeServiceMapper {

List<AnonymousStructure_E92E2863764D2238A46559F497F7ACA4> getAnonymousStructure_E92E2863764D2238A46559F497F7ACA4(@Param("warehousingNum") String warehousingNum); 

Long countAnonymousStructure_E92E2863764D2238A46559F497F7ACA4(@Param("warehousingNum") String warehousingNum); 

List<AnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB> getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(@Param("variable2") List<Long> variable2); 

Long countAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(@Param("variable2") List<Long> variable2); 

}
