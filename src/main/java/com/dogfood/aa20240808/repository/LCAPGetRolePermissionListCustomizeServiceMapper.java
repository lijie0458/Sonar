package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LCAPGetRolePermissionListCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9D03344DB7AB35A991C54E50A80AE1F9> getAnonymousStructure_9D03344DB7AB35A991C54E50A80AE1F9(@Param("inputRoleId") Long inputRoleId); 

Long countAnonymousStructure_9D03344DB7AB35A991C54E50A80AE1F9(@Param("inputRoleId") Long inputRoleId); 


}
