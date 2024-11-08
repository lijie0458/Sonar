package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119; 
import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.OtherInStorageStateEnumEnum; 
import org.apache.ibatis.annotations.Param; 

public interface BatchChangeOtherInSStateCustomizeServiceMapper {

List<AnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119> getAnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119(@Param("otherInSState") OtherInStorageStateEnumEnum otherInSState, @Param("codeList") List<String> codeList); 

Long countAnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119(@Param("otherInSState") OtherInStorageStateEnumEnum otherInSState, @Param("codeList") List<String> codeList); 

}
