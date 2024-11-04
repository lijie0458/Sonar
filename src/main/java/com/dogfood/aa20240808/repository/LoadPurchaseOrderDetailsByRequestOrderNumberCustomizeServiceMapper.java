package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadPurchaseOrderDetailsByRequestOrderNumberCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_898D34F6DFA2CDBCB4C25D9754ABC005> getAnonymousStructure_898D34F6DFA2CDBCB4C25D9754ABC005(@Param("request_number") String request_number); 

Long countAnonymousStructure_898D34F6DFA2CDBCB4C25D9754ABC005(@Param("request_number") String request_number); 


}
