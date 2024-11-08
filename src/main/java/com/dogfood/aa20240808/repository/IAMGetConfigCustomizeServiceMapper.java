package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_95F91B06D36BBD34B9B470BF7A922AA3; 
import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E6204F88FA3760A005F0E371750B535E; 
import org.apache.ibatis.annotations.Param; 

public interface IAMGetConfigCustomizeServiceMapper {

List<AnonymousStructure_95F91B06D36BBD34B9B470BF7A922AA3> getAnonymousStructure_95F91B06D36BBD34B9B470BF7A922AA3(); 

Long countAnonymousStructure_95F91B06D36BBD34B9B470BF7A922AA3(); 

List<AnonymousStructure_E6204F88FA3760A005F0E371750B535E> getAnonymousStructure_E6204F88FA3760A005F0E371750B535E(@Param("state") IdentitySourceStateEnumEnum state); 

Long countAnonymousStructure_E6204F88FA3760A005F0E371750B535E(@Param("state") IdentitySourceStateEnumEnum state); 

List<AnonymousStructure_E6204F88FA3760A005F0E371750B535E> getAnonymousStructure_E6204F88FA3760A005F0E371750B535E1(); 

Long countAnonymousStructure_E6204F88FA3760A005F0E371750B535E1(); 

}
