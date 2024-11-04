package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface PERGetPermissionResourseRelatedCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_53CA2F6F6A03F8C3D4CDE3AA6CF7AE9C> getAnonymousStructure_53CA2F6F6A03F8C3D4CDE3AA6CF7AE9C(@Param("permissionId") Long permissionId); 

Long countAnonymousStructure_53CA2F6F6A03F8C3D4CDE3AA6CF7AE9C(@Param("permissionId") Long permissionId); 


}
