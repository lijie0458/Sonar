package com.dogfood.aa20240808.config; 

import org.springframework.context.annotation.Import; 
import org.springframework.context.annotation.Configuration; 
import com.netease.http.httpclient.LCAPHttpClient; 

@Configuration
@Import(value = { LCAPHttpClient.class})
public class ImportGPLModuleConfiguration {

}
