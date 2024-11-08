package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E6204F88FA3760A005F0E371750B535E; 
import org.apache.ibatis.annotations.Param; 

public interface IAMGetIdentitySourceByStateCustomizeServiceMapper {

List<AnonymousStructure_E6204F88FA3760A005F0E371750B535E> getAnonymousStructure_E6204F88FA3760A005F0E371750B535E(); 

Long countAnonymousStructure_E6204F88FA3760A005F0E371750B535E(); 

List<AnonymousStructure_E6204F88FA3760A005F0E371750B535E> getAnonymousStructure_E6204F88FA3760A005F0E371750B535E1(@Param("variable1") IdentitySourceStateEnumEnum variable1); 

Long countAnonymousStructure_E6204F88FA3760A005F0E371750B535E1(@Param("variable1") IdentitySourceStateEnumEnum variable1); 

}
