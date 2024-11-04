package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadsaleOrdersDetailsBySaleOrderNumCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_873CF28DE5093DD1906C2E345F84CE28> getAnonymousStructure_873CF28DE5093DD1906C2E345F84CE28(@Param("request_number") String request_number); 

Long countAnonymousStructure_873CF28DE5093DD1906C2E345F84CE28(@Param("request_number") String request_number); 


}
