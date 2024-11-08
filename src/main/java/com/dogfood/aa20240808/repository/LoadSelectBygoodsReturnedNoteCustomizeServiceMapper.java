package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C1F3F9BB7937A30CE4567980C1B22693; 
import org.apache.ibatis.annotations.Param; 

public interface LoadSelectBygoodsReturnedNoteCustomizeServiceMapper {

List<AnonymousStructure_C1F3F9BB7937A30CE4567980C1B22693> getAnonymousStructure_C1F3F9BB7937A30CE4567980C1B22693(@Param("goodsReturnedNote") String goodsReturnedNote); 

Long countAnonymousStructure_C1F3F9BB7937A30CE4567980C1B22693(@Param("goodsReturnedNote") String goodsReturnedNote); 

}
