package com.dogfood.aa20240808.repository; 

import java.util.List; 
import org.apache.ibatis.annotations.Param; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF; 

public interface IAMSocialIdentityLoginCustomizeServiceMapper {

List<AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF> getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(@Param("openId") String openId); 

Long countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(@Param("openId") String openId); 

}
