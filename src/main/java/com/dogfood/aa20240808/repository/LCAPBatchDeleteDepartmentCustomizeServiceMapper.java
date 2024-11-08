package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_C3F54AE7C6EB0826B17CF78EDFE6659E; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2; 
import org.apache.ibatis.annotations.Param; 

public interface LCAPBatchDeleteDepartmentCustomizeServiceMapper {

List<String> getString(@Param("ids") List<Long> ids); 

List<AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2> getAnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2(@Param("deptIdList") List<String> deptIdList); 

List<AnonymousStructure_C3F54AE7C6EB0826B17CF78EDFE6659E> getSql1(@Param("deptIdList") List<String> deptIdList); 

}
