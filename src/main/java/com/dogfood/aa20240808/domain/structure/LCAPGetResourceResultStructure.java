package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class LCAPGetResourceResultStructure {

    public String resourceValue;
    public String resourceType;
    public String getResourceValue() {
        return resourceValue;
    } 

    public void setResourceValue(String resourceValue) {
        this.resourceValue = resourceValue; 
    } 

    public String getResourceType() {
        return resourceType;
    } 

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType; 
    } 


}
