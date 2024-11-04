package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.entities.Warehouse_levelEntity; 
import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadWarehouseTableViewCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6CA25F63D4A24168C85048D927F1049F> getAnonymousStructure_6CA25F63D4A24168C85048D927F1049F(@Param("filter") Warehouse_levelEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_6CA25F63D4A24168C85048D927F1049F(@Param("filter") Warehouse_levelEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 


}
