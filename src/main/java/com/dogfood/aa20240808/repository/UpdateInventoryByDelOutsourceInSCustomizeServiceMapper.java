package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface UpdateInventoryByDelOutsourceInSCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6000B46E601140BAEDF82461B2120FA9> getAnonymousStructure_6000B46E601140BAEDF82461B2120FA9(@Param("outsourceInSCode") String outsourceInSCode); 

Long countAnonymousStructure_6000B46E601140BAEDF82461B2120FA9(@Param("outsourceInSCode") String outsourceInSCode); 


}
