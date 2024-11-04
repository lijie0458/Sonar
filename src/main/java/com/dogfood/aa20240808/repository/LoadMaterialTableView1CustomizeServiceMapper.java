package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadMaterialTableView1CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903> getAnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903(@Param("filter") MaterialDetailsEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("materialId") Long materialId, @Param("order") String order); 

Long countAnonymousStructure_57EC9DC25A1913F7F6DFD4D9F1334903(@Param("filter") MaterialDetailsEntity filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("materialId") Long materialId, @Param("order") String order); 


}
