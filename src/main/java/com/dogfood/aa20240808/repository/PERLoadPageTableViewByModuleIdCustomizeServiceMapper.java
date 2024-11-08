package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DA5E0BE32CB03F09D1E3DB37B65BA82E; 
import org.apache.ibatis.annotations.Param; 

public interface PERLoadPageTableViewByModuleIdCustomizeServiceMapper {

List<AnonymousStructure_DA5E0BE32CB03F09D1E3DB37B65BA82E> getAnonymousStructure_DA5E0BE32CB03F09D1E3DB37B65BA82E(@Param("moduleId") Long moduleId); 

Long countAnonymousStructure_DA5E0BE32CB03F09D1E3DB37B65BA82E(@Param("moduleId") Long moduleId); 

}
