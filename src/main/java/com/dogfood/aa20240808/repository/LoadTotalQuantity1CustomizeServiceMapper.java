package com.dogfood.aa20240808.repository; 

import org.apache.ibatis.annotations.Param; 

public interface LoadTotalQuantity1CustomizeServiceMapper {

Long getStructure1(@Param("code") String code, @Param("id") Long id); 


}
