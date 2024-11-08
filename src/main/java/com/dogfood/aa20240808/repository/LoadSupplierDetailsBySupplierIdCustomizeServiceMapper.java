package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E310A9D695F45E4453B876CB739D4C34; 
import org.apache.ibatis.annotations.Param; 

public interface LoadSupplierDetailsBySupplierIdCustomizeServiceMapper {

List<AnonymousStructure_E310A9D695F45E4453B876CB739D4C34> getAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(@Param("supplierId") Long supplierId); 

Long countAnonymousStructure_E310A9D695F45E4453B876CB739D4C34(@Param("supplierId") Long supplierId); 

}
