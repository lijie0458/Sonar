package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5; 
import org.apache.ibatis.annotations.Param; 

public interface LCAPGetRoleBindUserListCustomizeServiceMapper {

List<AnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5> getAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5(@Param("inputRoleId") Long inputRoleId); 

Long countAnonymousStructure_E69C6A05AFC359D00B28F67D0E02C8E5(@Param("inputRoleId") Long inputRoleId); 

}
