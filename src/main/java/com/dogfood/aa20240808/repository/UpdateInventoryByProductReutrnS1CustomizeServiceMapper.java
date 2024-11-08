package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E; 
import org.apache.ibatis.annotations.Param; 

public interface UpdateInventoryByProductReutrnS1CustomizeServiceMapper {

List<AnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E> getAnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E(@Param("outsourceReturnCode") String outsourceReturnCode); 

}
