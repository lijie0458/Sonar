package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_19AE6979770076098EC91325F1B403C2; 
import org.apache.ibatis.annotations.Param; 

public interface LoadCountsaleOrderCustomizeServiceMapper {

List<AnonymousStructure_19AE6979770076098EC91325F1B403C2> getAnonymousStructure_19AE6979770076098EC91325F1B403C2(@Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum); 

Long countAnonymousStructure_19AE6979770076098EC91325F1B403C2(@Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum); 

}
