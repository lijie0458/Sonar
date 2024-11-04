package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadAduitSelectByOrderNumberCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9C387961E6D66F52987268EB7DB609B7> getAnonymousStructure_9C387961E6D66F52987268EB7DB609B7(@Param("orderNumber") String orderNumber); 

Long countAnonymousStructure_9C387961E6D66F52987268EB7DB609B7(@Param("orderNumber") String orderNumber); 


}
