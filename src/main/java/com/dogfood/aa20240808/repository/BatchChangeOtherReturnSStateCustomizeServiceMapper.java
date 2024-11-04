package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.OtherReturnStorageStateEnumEnum; 
import org.apache.ibatis.annotations.Param; 

public interface BatchChangeOtherReturnSStateCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CCF83669FF6932F4220A16134A2F3077> getAnonymousStructure_CCF83669FF6932F4220A16134A2F3077(@Param("otherReturnSState") OtherReturnStorageStateEnumEnum otherReturnSState, @Param("codeList") List<String> codeList); 

Long countAnonymousStructure_CCF83669FF6932F4220A16134A2F3077(@Param("otherReturnSState") OtherReturnStorageStateEnumEnum otherReturnSState, @Param("codeList") List<String> codeList); 


}
