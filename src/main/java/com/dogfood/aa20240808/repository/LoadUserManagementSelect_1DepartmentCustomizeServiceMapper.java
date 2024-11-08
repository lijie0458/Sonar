package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_3421ED028B001C489CD794910A15D0C0; 
import org.apache.ibatis.annotations.Param; 

public interface LoadUserManagementSelect_1DepartmentCustomizeServiceMapper {

List<AnonymousStructure_3421ED028B001C489CD794910A15D0C0> getAnonymousStructure_3421ED028B001C489CD794910A15D0C0(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

Long countAnonymousStructure_3421ED028B001C489CD794910A15D0C0(@Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size); 

}
