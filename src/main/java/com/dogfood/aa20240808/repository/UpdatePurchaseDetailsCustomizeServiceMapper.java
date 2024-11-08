package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_1E1FD0FBFFD3C2705E03B08CB22F80C5; 
import org.apache.ibatis.annotations.Param; 

public interface UpdatePurchaseDetailsCustomizeServiceMapper {

List<AnonymousStructure_1E1FD0FBFFD3C2705E03B08CB22F80C5> getAnonymousStructure_1E1FD0FBFFD3C2705E03B08CB22F80C5(@Param("purchaseDetailsIdList") List<Long> purchaseDetailsIdList); 

}
