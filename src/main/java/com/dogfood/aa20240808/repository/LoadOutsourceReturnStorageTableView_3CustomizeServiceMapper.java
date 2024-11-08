package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D197371FE2667B32C94A3A8A43575C1A; 
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageEntity; 
import org.apache.ibatis.annotations.Param; 
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageEntity; 

public interface LoadOutsourceReturnStorageTableView_3CustomizeServiceMapper {

List<AnonymousStructure_D197371FE2667B32C94A3A8A43575C1A> getAnonymousStructure_D197371FE2667B32C94A3A8A43575C1A(@Param("filter") OutsourceInStorageEntity filter, @Param("timeHorizon") TimeHorizonStructure timeHorizon, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("filter1") OutsourceReturnStorageEntity filter1, @Param("sort") String sort, @Param("dataViewAuthority") List<String> dataViewAuthority, @Param("order") String order); 

Long countAnonymousStructure_D197371FE2667B32C94A3A8A43575C1A(@Param("filter") OutsourceInStorageEntity filter, @Param("timeHorizon") TimeHorizonStructure timeHorizon, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("filter1") OutsourceReturnStorageEntity filter1, @Param("sort") String sort, @Param("dataViewAuthority") List<String> dataViewAuthority, @Param("order") String order); 

}
