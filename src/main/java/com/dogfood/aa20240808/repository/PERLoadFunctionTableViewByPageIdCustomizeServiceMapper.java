package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface PERLoadFunctionTableViewByPageIdCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A1C3A855CCD635641331B29B571163B> getAnonymousStructure_6A1C3A855CCD635641331B29B571163B(@Param("pageId") Long pageId); 

Long countAnonymousStructure_6A1C3A855CCD635641331B29B571163B(@Param("pageId") Long pageId); 


}
