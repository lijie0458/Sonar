package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8; 
import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadSupplierWithoutCurrentCustomizeServiceMapper {

List<AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8> getAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(@Param("currentSupplierId") Long currentSupplierId); 

Long countAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(@Param("currentSupplierId") Long currentSupplierId); 

}
