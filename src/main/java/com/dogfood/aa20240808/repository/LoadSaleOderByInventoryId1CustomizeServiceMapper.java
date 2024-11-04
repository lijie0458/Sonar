package com.dogfood.aa20240808.repository; 

import java.util.List; 
import java.math.BigDecimal; 
import org.apache.ibatis.annotations.Param; 

public interface LoadSaleOderByInventoryId1CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C85FDC91EC43BBDC26B44837087D5D9A> getAnonymousStructure_C85FDC91EC43BBDC26B44837087D5D9A(@Param("param1") List<Long> param1); 

Long countAnonymousStructure_C85FDC91EC43BBDC26B44837087D5D9A(@Param("param1") List<Long> param1); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788> getAnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788(@Param("item") com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C85FDC91EC43BBDC26B44837087D5D9A item); 

Long countAnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788(@Param("item") com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C85FDC91EC43BBDC26B44837087D5D9A item); 

BigDecimal getStructure1(@Param("item") com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C85FDC91EC43BBDC26B44837087D5D9A item); 


}
