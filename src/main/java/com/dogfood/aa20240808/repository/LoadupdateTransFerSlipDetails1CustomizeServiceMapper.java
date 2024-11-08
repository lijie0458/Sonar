package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_25E6E207A23A69C3FD2902BCF708440D; 
import org.apache.ibatis.annotations.Param; 

public interface LoadupdateTransFerSlipDetails1CustomizeServiceMapper {

List<AnonymousStructure_25E6E207A23A69C3FD2902BCF708440D> getSql1(@Param("OrderNumber") String OrderNumber); 

}
