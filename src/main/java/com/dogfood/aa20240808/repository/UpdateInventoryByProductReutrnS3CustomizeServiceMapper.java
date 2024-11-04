package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface UpdateInventoryByProductReutrnS3CustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_FD131DC799F7188AD2865421C2FAC4D7> getAnonymousStructure_FD131DC799F7188AD2865421C2FAC4D7(@Param("goodsReturnCode") String goodsReturnCode); 


}
