package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6122FFF7EE63A7C8A589CA1BA02FF87D; 
import org.apache.ibatis.annotations.Param; 

public interface LoadProductReturnStorageDetailsSelect_3CustomizeServiceMapper {

List<AnonymousStructure_6122FFF7EE63A7C8A589CA1BA02FF87D> getAnonymousStructure_6122FFF7EE63A7C8A589CA1BA02FF87D(@Param("num") String num, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

Long countAnonymousStructure_6122FFF7EE63A7C8A589CA1BA02FF87D(@Param("num") String num, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

}
