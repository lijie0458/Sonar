package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface PERGetPermissionResourseNotRelatedCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_EA050579F163467B7D2FD3E8C15362AF> getAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF(@Param("relatedList") List<Long> relatedList); 

Long countAnonymousStructure_EA050579F163467B7D2FD3E8C15362AF(@Param("relatedList") List<Long> relatedList); 


}
