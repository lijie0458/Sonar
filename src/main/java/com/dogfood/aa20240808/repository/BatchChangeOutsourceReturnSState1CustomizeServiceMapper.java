package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.OutsourceReturnStorageStateEnumEnum; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170; 
import org.apache.ibatis.annotations.Param; 

public interface BatchChangeOutsourceReturnSState1CustomizeServiceMapper {

List<AnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170> getAnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170(@Param("outsourceReturnSState") OutsourceReturnStorageStateEnumEnum outsourceReturnSState, @Param("codeList") List<String> codeList); 

Long countAnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170(@Param("outsourceReturnSState") OutsourceReturnStorageStateEnumEnum outsourceReturnSState, @Param("codeList") List<String> codeList); 

}
