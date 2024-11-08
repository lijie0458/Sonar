package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_67157391F5C859BD7A607E15FE4E75BD; 
import org.apache.ibatis.annotations.Param; 

public interface GetMaterialDetailsByCodeListCustomizeServiceMapper {

List<AnonymousStructure_67157391F5C859BD7A607E15FE4E75BD> getAnonymousStructure_67157391F5C859BD7A607E15FE4E75BD(@Param("MaterialCodeList") List<String> MaterialCodeList); 

Long countAnonymousStructure_67157391F5C859BD7A607E15FE4E75BD(@Param("MaterialCodeList") List<String> MaterialCodeList); 

}
