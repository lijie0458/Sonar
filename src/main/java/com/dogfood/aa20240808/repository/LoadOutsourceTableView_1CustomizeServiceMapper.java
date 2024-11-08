package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A; 
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadOutsourceTableView_1CustomizeServiceMapper {

List<AnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A> getAnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A(@Param("filter") OutsourceInStorageEntity filter, @Param("timeHorizon") TimeHorizonStructure timeHorizon, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("dataViewAuthority") List<String> dataViewAuthority, @Param("order") String order); 

Long countAnonymousStructure_C1C338E5A8F4775E2185681CBBA1877A(@Param("filter") OutsourceInStorageEntity filter, @Param("timeHorizon") TimeHorizonStructure timeHorizon, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("dataViewAuthority") List<String> dataViewAuthority, @Param("order") String order); 

}
