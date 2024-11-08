package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E4D66C6B00115C2619796053521EA8C0; 
import org.apache.ibatis.annotations.Param; 

public interface LoadMeasuringUnitTableViewCustomizeServiceMapper {

List<AnonymousStructure_E4D66C6B00115C2619796053521EA8C0> getAnonymousStructure_E4D66C6B00115C2619796053521EA8C0(@Param("filter") MeasuringUnitEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_E4D66C6B00115C2619796053521EA8C0(@Param("filter") MeasuringUnitEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

}
