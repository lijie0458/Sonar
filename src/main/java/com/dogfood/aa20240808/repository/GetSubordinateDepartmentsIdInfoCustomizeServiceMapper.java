package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetSubordinateDepartmentsIdInfoCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0> getAnonymousStructure_3421ED028B001C489CD794910A15D0C0(@Param("departmentIdList") List<Long> departmentIdList); 

Long countAnonymousStructure_3421ED028B001C489CD794910A15D0C0(@Param("departmentIdList") List<Long> departmentIdList); 


}
