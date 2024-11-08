package com.dogfood.aa20240808.repository; 

import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D; 
import java.util.List; 
import com.netease.lowcode.auth.domain.LCAPUser; 
import org.apache.ibatis.annotations.Param; 

public interface GetUserInfoCustomizeServiceMapper {

List<AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D> getAnonymousStructure_767B64E0A8935388CB3E9BF139E6586D(@Param("global_CDD638E00095E76C42DB80D69DFDEC30_currentUser") LCAPUser global_CDD638E00095E76C42DB80D69DFDEC30_currentUser); 

}
