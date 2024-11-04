package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import org.apache.ibatis.annotations.Param; 

public interface LoadCountProductionNumberCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6> getAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6(@Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum); 

Long countAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6(@Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum); 


}
