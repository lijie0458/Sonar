package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E; 
import org.apache.ibatis.annotations.Param; 

public interface LoadWarehouseTableView1CustomizeServiceMapper {

List<AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E> getAnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E(@Param("filter") Warehouse_levelTwoEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E(@Param("filter") Warehouse_levelTwoEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

}
