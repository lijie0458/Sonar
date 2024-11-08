package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_01FBFC2B31545FDB6654B351805441A4; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_72217EE9E320F7E2EB0031D1F9C3975F; 
import org.apache.ibatis.annotations.Param; 

public interface LoadWarehouseinventoryByOrderNumberCustomizeServiceMapper {

List<AnonymousStructure_01FBFC2B31545FDB6654B351805441A4> getSql1(@Param("OrderNumber") String OrderNumber); 

List<AnonymousStructure_72217EE9E320F7E2EB0031D1F9C3975F> getSql2(@Param("OrderNumber") String OrderNumber); 

}
