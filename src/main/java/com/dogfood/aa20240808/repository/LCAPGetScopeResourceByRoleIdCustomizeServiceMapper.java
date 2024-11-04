package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LCAPGetScopeResourceByRoleIdCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF51E2CA3BEA957FFEB6CEA32F96003B> getAnonymousStructure_CF51E2CA3BEA957FFEB6CEA32F96003B(@Param("roleId") Long roleId); 

Long countAnonymousStructure_CF51E2CA3BEA957FFEB6CEA32F96003B(@Param("roleId") Long roleId); 


}
