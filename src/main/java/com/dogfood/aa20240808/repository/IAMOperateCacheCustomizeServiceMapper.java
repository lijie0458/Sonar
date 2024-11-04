package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface IAMOperateCacheCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_34E3E39EB45447A8EA8054133B60899D> getAnonymousStructure_34E3E39EB45447A8EA8054133B60899D(@Param("key") String key); 

Long countAnonymousStructure_34E3E39EB45447A8EA8054133B60899D(@Param("key") String key); 


}
