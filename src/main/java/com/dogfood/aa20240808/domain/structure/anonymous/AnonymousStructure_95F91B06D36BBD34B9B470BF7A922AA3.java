package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.AppConfigEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_95F91B06D36BBD34B9B470BF7A922AA3 {

    public AppConfigEntity appConfig;
    public AppConfigEntity getAppConfig() {
        return appConfig;
    } 

    public void setAppConfig(AppConfigEntity appConfig) {
        this.appConfig = appConfig; 
    } 


}
