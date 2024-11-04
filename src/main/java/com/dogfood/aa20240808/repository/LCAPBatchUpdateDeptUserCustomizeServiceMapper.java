package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LCAPBatchUpdateDeptUserCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2> getAnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2(@Param("oldDeptId") String oldDeptId, @Param("userIds") List<String> userIds); 

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2> getAnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF21(@Param("userIdList") List<String> userIdList, @Param("deptId") String deptId); 


}
