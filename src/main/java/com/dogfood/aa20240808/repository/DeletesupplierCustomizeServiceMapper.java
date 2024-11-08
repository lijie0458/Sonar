package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E310A9D695F45E4453B876CB739D4C34; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073; 
import org.apache.ibatis.annotations.Param; 

public interface DeletesupplierCustomizeServiceMapper {

List<AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8> getAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(@Param("param1") Long param1); 

Long countAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(@Param("param1") Long param1); 

List<AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8> getAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C81(@Param("variable1") AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8 variable1); 

Long countAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C81(@Param("variable1") AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8 variable1); 

List<AnonymousStructure_E310A9D695F45E4453B876CB739D4C34> getAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(@Param("DeleteSubclassListId") List<Long> DeleteSubclassListId); 

Long countAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(@Param("DeleteSubclassListId") List<Long> DeleteSubclassListId); 

List<AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073> getAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(@Param("variable2") List<Long> variable2); 

Long countAnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073(@Param("variable2") List<Long> variable2); 

}
