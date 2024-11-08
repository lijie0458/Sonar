package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ParmeStructureStructure {

    @Label("参数名")
    public String key;

    @Label("参数值")
    public String value;

    public String getKey() {
        return key;
    } 

    public void setKey(String key) {
        this.key = key; 
    } 

    public String getValue() {
        return value;
    } 

    public void setValue(String value) {
        this.value = value; 
    } 

}
