package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_0C942FA717268536916F444E2B135D0C; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9C387961E6D66F52987268EB7DB609B7; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_19AE6979770076098EC91325F1B403C2; 
import org.apache.ibatis.annotations.Param; 

public interface LoadSalesReturnDetailsSelect_20CustomizeServiceMapper {

List<AnonymousStructure_19AE6979770076098EC91325F1B403C2> getAnonymousStructure_19AE6979770076098EC91325F1B403C2(@Param("id") Long id); 

Long countAnonymousStructure_19AE6979770076098EC91325F1B403C2(@Param("id") Long id); 

List<AnonymousStructure_19AE6979770076098EC91325F1B403C2> getAnonymousStructure_19AE6979770076098EC91325F1B403C21(@Param("id") Long id); 

Long countAnonymousStructure_19AE6979770076098EC91325F1B403C21(@Param("id") Long id); 

List<AnonymousStructure_9C387961E6D66F52987268EB7DB609B7> getAnonymousStructure_9C387961E6D66F52987268EB7DB609B7(@Param("item") String item); 

Long countAnonymousStructure_9C387961E6D66F52987268EB7DB609B7(@Param("item") String item); 

List<AnonymousStructure_0C942FA717268536916F444E2B135D0C> getSql1(@Param("item") String item); 

List<AnonymousStructure_19AE6979770076098EC91325F1B403C2> getAnonymousStructure_19AE6979770076098EC91325F1B403C22(@Param("TrueListOrderNumber") List<String> TrueListOrderNumber); 

Long countAnonymousStructure_19AE6979770076098EC91325F1B403C22(@Param("TrueListOrderNumber") List<String> TrueListOrderNumber); 

}
