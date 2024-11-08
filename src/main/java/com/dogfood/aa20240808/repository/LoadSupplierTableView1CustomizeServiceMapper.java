package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DBA0A9D85716CA3769232B481797F39F; 
import com.dogfood.aa20240808.domain.entities.SupplierDetailsEntity; 
import org.apache.ibatis.annotations.Param; 

public interface LoadSupplierTableView1CustomizeServiceMapper {

List<AnonymousStructure_DBA0A9D85716CA3769232B481797F39F> getAnonymousStructure_DBA0A9D85716CA3769232B481797F39F(@Param("filter") SupplierDetailsEntity filter, @Param("SupplierId") Long SupplierId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_DBA0A9D85716CA3769232B481797F39F(@Param("filter") SupplierDetailsEntity filter, @Param("SupplierId") Long SupplierId, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

}
