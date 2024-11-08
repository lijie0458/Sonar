package com.dogfood.aa20240808.repository; 

import java.math.BigDecimal; 
import org.apache.ibatis.annotations.Param; 

public interface LoadTotalByCodeCustomizeServiceMapper {

BigDecimal getSql1(@Param("param1") String param1); 

}
