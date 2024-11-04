package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LCAPGetMappingByPermissionIdAndResourceIdCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF> getAnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF(@Param("permissionId") Long permissionId, @Param("resourceId") Long resourceId); 

Long countAnonymousStructure_D99966CE0A06FAAEEADD3A36C43F7DFF(@Param("permissionId") Long permissionId, @Param("resourceId") Long resourceId); 


}
