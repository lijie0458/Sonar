package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface UpdateInventoryByDelOtherInSCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C4D609A7D421658ADC4BDA8783200DA9> getAnonymousStructure_C4D609A7D421658ADC4BDA8783200DA9(@Param("otherCode") String otherCode); 

Long countAnonymousStructure_C4D609A7D421658ADC4BDA8783200DA9(@Param("otherCode") String otherCode); 


}
