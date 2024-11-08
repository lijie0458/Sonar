package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_EB9388FD466AACADF9BAFA841AB181F9; 
import org.apache.ibatis.annotations.Param; 

public interface LoadEditToDetailsBydepartmentNumberCustomizeServiceMapper {

List<AnonymousStructure_EB9388FD466AACADF9BAFA841AB181F9> getAnonymousStructure_EB9388FD466AACADF9BAFA841AB181F9(@Param("department_Number") String department_Number); 

Long countAnonymousStructure_EB9388FD466AACADF9BAFA841AB181F9(@Param("department_Number") String department_Number); 

}
