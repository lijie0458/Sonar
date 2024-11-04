package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetOutsourceInSDetailsByOutsourceInSCodeCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_77A91D1F4D3302BA86978D8B97972F3D> getAnonymousStructure_77A91D1F4D3302BA86978D8B97972F3D(@Param("outsourceInSCode") String outsourceInSCode); 

Long countAnonymousStructure_77A91D1F4D3302BA86978D8B97972F3D(@Param("outsourceInSCode") String outsourceInSCode); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB> getAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(@Param("variable2") List<Long> variable2); 

Long countAnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB(@Param("variable2") List<Long> variable2); 


}
