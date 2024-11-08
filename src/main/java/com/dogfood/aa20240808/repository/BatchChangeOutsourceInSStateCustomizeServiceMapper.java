package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.OutsourceInStorageStateEnumEnum; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF; 
import org.apache.ibatis.annotations.Param; 

public interface BatchChangeOutsourceInSStateCustomizeServiceMapper {

List<AnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF> getAnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF(@Param("outsourceInSState") OutsourceInStorageStateEnumEnum outsourceInSState, @Param("codeList") List<String> codeList); 

Long countAnonymousStructure_6FC111F7C7EC90E00099159DA034D7FF(@Param("outsourceInSState") OutsourceInStorageStateEnumEnum outsourceInSState, @Param("codeList") List<String> codeList); 

}
