package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface UpdateOtherInSUnreturnQuantityCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AE46AD2B7381676FFE065B948F85DD20> getAnonymousStructure_AE46AD2B7381676FFE065B948F85DD20(@Param("otherReturnCode") String otherReturnCode); 

Long countAnonymousStructure_AE46AD2B7381676FFE065B948F85DD20(@Param("otherReturnCode") String otherReturnCode); 


}
