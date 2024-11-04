package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface IAMGetUserByUserIdCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0> getAnonymousStructure_47C167E7217746A55100F50A57F637C0(@Param("userId") String userId); 

Long countAnonymousStructure_47C167E7217746A55100F50A57F637C0(@Param("userId") String userId); 


}
