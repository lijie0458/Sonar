package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import org.apache.ibatis.annotations.Param; 

public interface IAMAccountBindOrUnBindCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0> getAnonymousStructure_47C167E7217746A55100F50A57F637C0(@Param("userName") String userName); 

Long countAnonymousStructure_47C167E7217746A55100F50A57F637C0(@Param("userName") String userName); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF> getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(@Param("identitySourceId") Long identitySourceId, @Param("userInfo") LCAPUser userInfo); 

Long countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(@Param("identitySourceId") Long identitySourceId, @Param("userInfo") LCAPUser userInfo); 

List<String> getString(); 

Long countString(); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF> getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF1(@Param("identitySourceId") Long identitySourceId, @Param("global_CDD638E00095E76C42DB80D69DFDEC30_currentUser") com.netease.lowcode.auth.domain.LCAPUser global_CDD638E00095E76C42DB80D69DFDEC30_currentUser); 

Long countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF1(@Param("identitySourceId") Long identitySourceId, @Param("global_CDD638E00095E76C42DB80D69DFDEC30_currentUser") com.netease.lowcode.auth.domain.LCAPUser global_CDD638E00095E76C42DB80D69DFDEC30_currentUser); 


}
