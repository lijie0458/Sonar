package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetMaterialByIdListCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_988572FC06FE621688549C0BC53D9030> getAnonymousStructure_988572FC06FE621688549C0BC53D9030(@Param("idList") List<Long> idList); 

Long countAnonymousStructure_988572FC06FE621688549C0BC53D9030(@Param("idList") List<Long> idList); 


}
