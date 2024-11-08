package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_F4686D0EDB15544AA67D0364F6D71209; 

public interface LoadReceivingDetailsByRequestOrderNumber1CustomizeServiceMapper {

List<AnonymousStructure_F4686D0EDB15544AA67D0364F6D71209> getAnonymousStructure_F4686D0EDB15544AA67D0364F6D71209(@Param("order_number") String order_number); 

Long countAnonymousStructure_F4686D0EDB15544AA67D0364F6D71209(@Param("order_number") String order_number); 

}
