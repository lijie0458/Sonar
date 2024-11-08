package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A11152A0305D954062AEE1E2D51653C2; 
import java.math.BigDecimal; 
import org.apache.ibatis.annotations.Param; 

public interface LoadSaleOderByInventoryId2CustomizeServiceMapper {

List<AnonymousStructure_A11152A0305D954062AEE1E2D51653C2> getAnonymousStructure_A11152A0305D954062AEE1E2D51653C2(@Param("param1") List<Long> param1); 

Long countAnonymousStructure_A11152A0305D954062AEE1E2D51653C2(@Param("param1") List<Long> param1); 

BigDecimal getStructure1(@Param("item") AnonymousStructure_A11152A0305D954062AEE1E2D51653C2 item); 

}
