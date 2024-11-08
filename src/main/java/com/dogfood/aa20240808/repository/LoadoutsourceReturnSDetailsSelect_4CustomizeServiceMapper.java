package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_A658BA46DE07AAD9FEFF3102D27C33D8; 
import org.apache.ibatis.annotations.Param; 

public interface LoadoutsourceReturnSDetailsSelect_4CustomizeServiceMapper {

List<AnonymousStructure_A658BA46DE07AAD9FEFF3102D27C33D8> getAnonymousStructure_A658BA46DE07AAD9FEFF3102D27C33D8(@Param("code") String code, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

Long countAnonymousStructure_A658BA46DE07AAD9FEFF3102D27C33D8(@Param("code") String code, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

}
