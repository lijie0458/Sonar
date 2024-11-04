package com.dogfood.aa20240808.repository; 

import java.math.BigDecimal; 
import org.apache.ibatis.annotations.Param; 

public interface LoadUnshippedQuantityCustomizeServiceMapper {

BigDecimal getStructure1(@Param("id") Long id, @Param("notid") Long notid); 


}
