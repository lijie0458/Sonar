package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.AppCacheEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_34E3E39EB45447A8EA8054133B60899D {

    public AppCacheEntity appCache;
    public AppCacheEntity getAppCache() {
        return appCache;
    } 

    public void setAppCache(AppCacheEntity appCache) {
        this.appCache = appCache; 
    } 


}
