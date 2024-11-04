package com.dogfood.aa20240808.repository; 

import org.apache.ibatis.annotations.Param; 

public interface LoadTotalQuantity2CustomizeServiceMapper {

Long getStructure1(@Param("code") String code, @Param("id") Long id, @Param("batchNumber") String batchNumber); 


}
