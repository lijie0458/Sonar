package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E6204F88FA3760A005F0E371750B535E; 
import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity; 
import org.apache.ibatis.annotations.Param; 

public interface IAMSaveIdentityCustomizeServiceMapper {

List<AnonymousStructure_E6204F88FA3760A005F0E371750B535E> getAnonymousStructure_E6204F88FA3760A005F0E371750B535E(@Param("sourceDto") IdentitySourceConfigEntity sourceDto); 

Long countAnonymousStructure_E6204F88FA3760A005F0E371750B535E(@Param("sourceDto") IdentitySourceConfigEntity sourceDto); 

Long getStructure1(@Param("sourceDto") IdentitySourceConfigEntity sourceDto); 

}
