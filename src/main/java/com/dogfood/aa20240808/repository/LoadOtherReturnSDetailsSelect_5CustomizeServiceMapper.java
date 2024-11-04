package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadOtherReturnSDetailsSelect_5CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_98440B1FAD10952B517FBB02DA4BFEBF> getAnonymousStructure_98440B1FAD10952B517FBB02DA4BFEBF(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("otherInSCode") String otherInSCode); 

Long countAnonymousStructure_98440B1FAD10952B517FBB02DA4BFEBF(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("otherInSCode") String otherInSCode); 


}
