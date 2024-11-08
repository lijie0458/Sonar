package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface PERGetRoleIdListByUserIdCustomizeServiceMapper {

List<Long> getSql1(@Param("userId") String userId); 

}
