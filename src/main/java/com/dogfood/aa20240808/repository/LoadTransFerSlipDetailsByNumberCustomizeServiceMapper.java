package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4D050CDD6A2A5B3718ED50006FF7EB5A; 
import org.apache.ibatis.annotations.Param; 

public interface LoadTransFerSlipDetailsByNumberCustomizeServiceMapper {

List<AnonymousStructure_4D050CDD6A2A5B3718ED50006FF7EB5A> getAnonymousStructure_4D050CDD6A2A5B3718ED50006FF7EB5A(@Param("documentNumber") String documentNumber); 

Long countAnonymousStructure_4D050CDD6A2A5B3718ED50006FF7EB5A(@Param("documentNumber") String documentNumber); 

}
