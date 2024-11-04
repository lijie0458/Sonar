package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadCountInventoryByCodeAndWahouseCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C> getSql1(@Param("Warehouse") Long Warehouse, @Param("code") String code); 


}
