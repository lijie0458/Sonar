package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface PERGetUserListByRoleIdCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B> getAnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B(@Param("roleId") Long roleId); 

Long countAnonymousStructure_B5031BE337A8E75F153A8EDD97EDE05B(@Param("roleId") Long roleId); 


}
