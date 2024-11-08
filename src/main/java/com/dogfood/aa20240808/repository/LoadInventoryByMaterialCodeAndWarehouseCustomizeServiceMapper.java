package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C; 
import org.apache.ibatis.annotations.Param; 

public interface LoadInventoryByMaterialCodeAndWarehouseCustomizeServiceMapper {

List<AnonymousStructure_2F4DB4E95AB871687BA63AFCB56ABB2C> getSql1(@Param("materialCode") String materialCode, @Param("location") Long location, @Param("lotNumber") String lotNumber, @Param("warehouse") Long warehouse); 

}
