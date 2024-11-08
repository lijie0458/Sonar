package com.dogfood.aa20240808.repository; 

import com.netease.lowcode.template.common.structure.IAMUserInfo; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity; 
import com.netease.lowcode.template.common.structure.LoginFunctionInput; 
import org.apache.ibatis.annotations.Param; 
import com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF; 

public interface IAMFunctionLogicCustomizeServiceMapper {

List<IdentitySourceConfigEntity> getSql1(); 

IdentitySourceConfigEntity getSql2(@Param("param1") LoginFunctionInput param1); 

IdentitySourceConfigEntity getSql3(@Param("param1") LoginFunctionInput param1); 

List<AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF> getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(@Param("param1") LoginFunctionInput param1); 

Long countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF(@Param("param1") LoginFunctionInput param1); 

List<IdentitySourceConfigEntity> getSql4(); 

IdentitySourceConfigEntity getSql5(); 

List<AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF> getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF1(@Param("param1") LoginFunctionInput param1); 

Long countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF1(@Param("param1") LoginFunctionInput param1); 

List<IdentitySourceConfigEntity> getSql6(); 

IdentitySourceConfigEntity getSql7(@Param("param1") LoginFunctionInput param1); 

LCAPUser getSql8(@Param("param1") LoginFunctionInput param1); 

IdentitySourceConfigEntity getSql9(); 

IdentitySourceConfigEntity getSql10(); 

List<AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF> getAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF2(@Param("variable3") IAMUserInfo variable3); 

Long countAnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF2(@Param("variable3") IAMUserInfo variable3); 

}
