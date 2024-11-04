package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadPurchaseRequestcountCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_93C34739441EB8F4AE7F54EB8CA28354> getAnonymousStructure_93C34739441EB8F4AE7F54EB8CA28354(@Param("Code") List<Long> Code); 

Long countAnonymousStructure_93C34739441EB8F4AE7F54EB8CA28354(@Param("Code") List<Long> Code); 


}
