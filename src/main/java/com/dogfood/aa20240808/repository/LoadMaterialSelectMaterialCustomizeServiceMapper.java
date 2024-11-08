package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_988572FC06FE621688549C0BC53D9030; 
import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadMaterialSelectMaterialCustomizeServiceMapper {

List<AnonymousStructure_988572FC06FE621688549C0BC53D9030> getAnonymousStructure_988572FC06FE621688549C0BC53D9030(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

Long countAnonymousStructure_988572FC06FE621688549C0BC53D9030(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

}
