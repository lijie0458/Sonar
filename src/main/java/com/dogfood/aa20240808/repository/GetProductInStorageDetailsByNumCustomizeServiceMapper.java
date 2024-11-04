package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetProductInStorageDetailsByNumCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DE3F897B0BDAE2532E935544A33C053B> getAnonymousStructure_DE3F897B0BDAE2532E935544A33C053B(@Param("num") String num); 

Long countAnonymousStructure_DE3F897B0BDAE2532E935544A33C053B(@Param("num") String num); 


}
