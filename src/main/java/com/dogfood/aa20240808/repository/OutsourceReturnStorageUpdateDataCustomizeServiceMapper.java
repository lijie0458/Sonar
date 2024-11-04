package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface OutsourceReturnStorageUpdateDataCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_4DBC1F436BCB644A600B40AB5CBA5EDA> getAnonymousStructure_4DBC1F436BCB644A600B40AB5CBA5EDA(@Param("outsourceReturnCode") String outsourceReturnCode); 

Long countAnonymousStructure_4DBC1F436BCB644A600B40AB5CBA5EDA(@Param("outsourceReturnCode") String outsourceReturnCode); 


}
