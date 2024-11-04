package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import org.apache.ibatis.annotations.Param; 

public interface LoadProductionPageDetailsCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6> getAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6(@Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum, @Param("id") Long id); 

Long countAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6(@Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum, @Param("id") Long id); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3EB9CA1571074F966FC0C5CC8F563CDA> getAnonymousStructure_3EB9CA1571074F966FC0C5CC8F563CDA(@Param("item") String item); 

Long countAnonymousStructure_3EB9CA1571074F966FC0C5CC8F563CDA(@Param("item") String item); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F59E0BB3343234CE3AF6447EE8462582> getSql1(@Param("item") String item); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6> getAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E61(@Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum, @Param("TrueListOrderNumber") List<String> TrueListOrderNumber); 

Long countAnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E61(@Param("DistinctionEnum") DistinctionEnumEnum DistinctionEnum, @Param("TrueListOrderNumber") List<String> TrueListOrderNumber); 


}
