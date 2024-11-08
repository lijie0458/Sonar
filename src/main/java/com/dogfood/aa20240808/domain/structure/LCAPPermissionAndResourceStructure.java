package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class LCAPPermissionAndResourceStructure {

    public String text;

    public Long value;

    public String getText() {
        return text;
    } 

    public void setText(String text) {
        this.text = text; 
    } 

    public Long getValue() {
        return value;
    } 

    public void setValue(Long value) {
        this.value = value; 
    } 

}
