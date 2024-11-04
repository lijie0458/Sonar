package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadSupplierSelectSupplierCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8> getAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

Long countAnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 


}
