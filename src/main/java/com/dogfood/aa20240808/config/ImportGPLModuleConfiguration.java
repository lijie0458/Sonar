package com.dogfood.aa20240808.config; 

import org.springframework.context.annotation.Import; 
import org.springframework.context.annotation.Configuration; 

@Configuration
@Import(value = { com.netease.lib.mybatis.api.TestApi.class})
public class ImportGPLModuleConfiguration {

}
