package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LCAPIsRoleNameRepeatedCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_70791B893F53C2EFB9E501591763B020> getAnonymousStructure_70791B893F53C2EFB9E501591763B020(@Param("roleName") String roleName); 

Long countAnonymousStructure_70791B893F53C2EFB9E501591763B020(@Param("roleName") String roleName); 


}
