package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetDataEditAuthorityCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_764AC7B785EFB4D4E2801B4A25796913> getAnonymousStructure_764AC7B785EFB4D4E2801B4A25796913(@Param("global_CDD638E00095E76C42DB80D69DFDEC30_currentUser") com.netease.lowcode.auth.domain.LCAPUser global_CDD638E00095E76C42DB80D69DFDEC30_currentUser); 

Long countAnonymousStructure_764AC7B785EFB4D4E2801B4A25796913(@Param("global_CDD638E00095E76C42DB80D69DFDEC30_currentUser") com.netease.lowcode.auth.domain.LCAPUser global_CDD638E00095E76C42DB80D69DFDEC30_currentUser); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_412E9C147CB3C99353FD18461376E868> getAnonymousStructure_412E9C147CB3C99353FD18461376E868(@Param("userInfo") com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_764AC7B785EFB4D4E2801B4A25796913 userInfo); 

Long countAnonymousStructure_412E9C147CB3C99353FD18461376E868(@Param("userInfo") com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_764AC7B785EFB4D4E2801B4A25796913 userInfo); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_412E9C147CB3C99353FD18461376E868> getAnonymousStructure_412E9C147CB3C99353FD18461376E8681(@Param("DepartmentAndSubordinateIdList") List<Long> DepartmentAndSubordinateIdList); 

Long countAnonymousStructure_412E9C147CB3C99353FD18461376E8681(@Param("DepartmentAndSubordinateIdList") List<Long> DepartmentAndSubordinateIdList); 


}
