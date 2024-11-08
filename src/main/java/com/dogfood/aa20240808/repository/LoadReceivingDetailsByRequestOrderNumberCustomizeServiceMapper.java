package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_08261F03DEBF4B95532DEB7351240F29; 
import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LoadReceivingDetailsByRequestOrderNumberCustomizeServiceMapper {

List<AnonymousStructure_08261F03DEBF4B95532DEB7351240F29> getAnonymousStructure_08261F03DEBF4B95532DEB7351240F29(@Param("order_number") String order_number); 

Long countAnonymousStructure_08261F03DEBF4B95532DEB7351240F29(@Param("order_number") String order_number); 

}
