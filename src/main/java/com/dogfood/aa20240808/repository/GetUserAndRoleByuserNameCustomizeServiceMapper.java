package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface GetUserAndRoleByuserNameCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DB888B8BD7DBFF31665BCA5E50FB8625> getAnonymousStructure_DB888B8BD7DBFF31665BCA5E50FB8625(@Param("userName") String userName); 


}
