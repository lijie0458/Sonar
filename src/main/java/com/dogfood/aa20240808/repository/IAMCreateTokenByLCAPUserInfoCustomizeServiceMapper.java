package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5; 
import com.dogfood.aa20240808.domain.entities.LCAPUserRoleMapping; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_70791B893F53C2EFB9E501591763B020; 
import com.dogfood.aa20240808.domain.entities.ThirdIdentityEntity; 
import org.apache.ibatis.annotations.Param; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF; 

public interface IAMCreateTokenByLCAPUserInfoCustomizeServiceMapper {

List<AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF> getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(@Param("openid") String openid, @Param("identityId") Long identityId); 

Long countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(@Param("openid") String openid, @Param("identityId") Long identityId); 

List<AnonymousStructure_47C167E7217746A55100F50A57F637C0> getAnonymousStructure_47C167E7217746A55100F50A57F637C0(@Param("thirdIdentityInfo") ThirdIdentityEntity thirdIdentityInfo); 

Long countAnonymousStructure_47C167E7217746A55100F50A57F637C0(@Param("thirdIdentityInfo") ThirdIdentityEntity thirdIdentityInfo); 

List<AnonymousStructure_70791B893F53C2EFB9E501591763B020> getAnonymousStructure_70791B893F53C2EFB9E501591763B020(@Param("defaultRoleId") Long defaultRoleId); 

Long countAnonymousStructure_70791B893F53C2EFB9E501591763B020(@Param("defaultRoleId") Long defaultRoleId); 

List<AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5> getAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5(@Param("inputUserRolemapping") LCAPUserRoleMapping inputUserRolemapping); 

Long countAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5(@Param("inputUserRolemapping") LCAPUserRoleMapping inputUserRolemapping); 

List<String> getString(); 

Long countString(); 

String getSql1(@Param("pattern") String pattern); 

List<AnonymousStructure_70791B893F53C2EFB9E501591763B020> getAnonymousStructure_70791B893F53C2EFB9E501591763B0201(@Param("defaultRoleId") Long defaultRoleId); 

Long countAnonymousStructure_70791B893F53C2EFB9E501591763B0201(@Param("defaultRoleId") Long defaultRoleId); 

}
