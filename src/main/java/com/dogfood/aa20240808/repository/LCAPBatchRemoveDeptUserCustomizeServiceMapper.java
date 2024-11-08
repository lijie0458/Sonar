package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2; 
import org.apache.ibatis.annotations.Param; 

public interface LCAPBatchRemoveDeptUserCustomizeServiceMapper {

List<AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2> getAnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2(@Param("userIds") List<String> userIds, @Param("deptId") String deptId); 

List<AnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF2> getAnonymousStructure_AEEB828FDE3AE90342EE6479C9466DF21(@Param("rootDeptId") String rootDeptId, @Param("userIdList") List<String> userIdList); 

}
