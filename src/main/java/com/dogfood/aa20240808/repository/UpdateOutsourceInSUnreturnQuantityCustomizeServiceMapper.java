package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface UpdateOutsourceInSUnreturnQuantityCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A9D82433468B40EA67F827BB6DB2E71> getAnonymousStructure_6A9D82433468B40EA67F827BB6DB2E71(@Param("outsourceReturnCode") String outsourceReturnCode); 

Long countAnonymousStructure_6A9D82433468B40EA67F827BB6DB2E71(@Param("outsourceReturnCode") String outsourceReturnCode); 


}
