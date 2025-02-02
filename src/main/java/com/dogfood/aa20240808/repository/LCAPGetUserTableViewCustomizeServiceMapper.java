package com.dogfood.aa20240808.repository; 

import java.util.List; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import org.apache.ibatis.annotations.Param; 

public interface LCAPGetUserTableViewCustomizeServiceMapper {

List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_47C167E7217746A55100F50A57F637C0> getAnonymousStructure_47C167E7217746A55100F50A57F637C0(@Param("filter") LCAPUser filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 

Long countAnonymousStructure_47C167E7217746A55100F50A57F637C0(@Param("filter") LCAPUser filter, @Param("lcap_71860C77_page") Long lcap_71860C77_page, @Param("lcap_F7BD60B7_size") Long lcap_F7BD60B7_size, @Param("sort") String sort, @Param("order") String order); 


}
