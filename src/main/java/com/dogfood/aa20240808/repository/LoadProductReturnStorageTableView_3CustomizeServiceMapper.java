package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.entities.ProductReturnStorageEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3AA16578BD81DFBC3A3467B39A512413; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadProductReturnStorageTableView_3CustomizeServiceMapper {

List<AnonymousStructure_3AA16578BD81DFBC3A3467B39A512413> getAnonymousStructure_3AA16578BD81DFBC3A3467B39A512413(@Param("filter") ProductInStorageEntity filter, @Param("timeHorizon") TimeHorizonStructure timeHorizon, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("filter1") ProductReturnStorageEntity filter1, @Param("sort") String sort, @Param("dataViewAuthority") List<String> dataViewAuthority, @Param("order") String order); 

Long countAnonymousStructure_3AA16578BD81DFBC3A3467B39A512413(@Param("filter") ProductInStorageEntity filter, @Param("timeHorizon") TimeHorizonStructure timeHorizon, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("filter1") ProductReturnStorageEntity filter1, @Param("sort") String sort, @Param("dataViewAuthority") List<String> dataViewAuthority, @Param("order") String order); 

}
