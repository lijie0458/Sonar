package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.AppConfigEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ConfigResStructure {

    public AppConfigEntity appConfig;

    public IdentityConfigStructure idectityConfig;

    public AppConfigEntity getAppConfig() {
        return appConfig;
    } 

    public void setAppConfig(AppConfigEntity appConfig) {
        this.appConfig = appConfig; 
    } 

    public IdentityConfigStructure getIdectityConfig() {
        return idectityConfig;
    } 

    public void setIdectityConfig(IdentityConfigStructure idectityConfig) {
        this.idectityConfig = idectityConfig; 
    } 

}
