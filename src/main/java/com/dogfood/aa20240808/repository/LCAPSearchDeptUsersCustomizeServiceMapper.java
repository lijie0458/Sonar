package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_9C0F38CE0B1F4B46D348B17C9BB990AA; 
import org.apache.ibatis.annotations.Param; 

public interface LCAPSearchDeptUsersCustomizeServiceMapper {

List<AnonymousStructure_9C0F38CE0B1F4B46D348B17C9BB990AA> getAnonymousStructure_9C0F38CE0B1F4B46D348B17C9BB990AA(@Param("name") String name); 

}
