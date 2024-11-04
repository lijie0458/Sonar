package com.dogfood.aa20240808.repository; 

import org.apache.ibatis.annotations.Param; 

public interface LoadCountByorderNumberCustomizeServiceMapper {

Long getSql1(@Param("orderNumber") String orderNumber); 


}
