package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetInventory_HomePageCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B4B1E36E87120D339E94C04920333A45> getAnonymousStructure_B4B1E36E87120D339E94C04920333A45(@Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_B4B1E36E87120D339E94C04920333A45(@Param("sort") String sort, @Param("order") String order); 


}
