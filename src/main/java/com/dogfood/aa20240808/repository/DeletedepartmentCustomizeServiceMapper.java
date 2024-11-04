package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface DeletedepartmentCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0> getAnonymousStructure_3421ED028B001C489CD794910A15D0C0(@Param("param1") Long param1); 

Long countAnonymousStructure_3421ED028B001C489CD794910A15D0C0(@Param("param1") Long param1); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0> getAnonymousStructure_3421ED028B001C489CD794910A15D0C01(@Param("variable1") com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0 variable1); 

Long countAnonymousStructure_3421ED028B001C489CD794910A15D0C01(@Param("variable1") com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0 variable1); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0> getAnonymousStructure_47C167E7217746A55100F50A57F637C0(@Param("DeleteSubclassListId") List<Long> DeleteSubclassListId); 

Long countAnonymousStructure_47C167E7217746A55100F50A57F637C0(@Param("DeleteSubclassListId") List<Long> DeleteSubclassListId); 


}
