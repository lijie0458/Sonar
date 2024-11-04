package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 

public interface LCAPGetUserListCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0> getAnonymousStructure_47C167E7217746A55100F50A57F637C0(@Param("queryParam") String queryParam); 

Long countAnonymousStructure_47C167E7217746A55100F50A57F637C0(@Param("queryParam") String queryParam); 


}
