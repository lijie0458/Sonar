package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadGoodsReturnedNoteDetailsBygoodsReturnedNoteCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6657CD3B9E0C841818A0548291FF597D> getAnonymousStructure_6657CD3B9E0C841818A0548291FF597D(@Param("order_number") String order_number); 

Long countAnonymousStructure_6657CD3B9E0C841818A0548291FF597D(@Param("order_number") String order_number); 


}
