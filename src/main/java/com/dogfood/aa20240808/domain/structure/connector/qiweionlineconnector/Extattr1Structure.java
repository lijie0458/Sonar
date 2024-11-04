package com.dogfood.aa20240808.domain.structure.connector.qiweionlineconnector; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Extattr1Structure {

    public List<com.dogfood.aa20240808.domain.structure.connector.qiweionlineconnector.Attrs3Structure> attrs = new ArrayList<>();
    public List<com.dogfood.aa20240808.domain.structure.connector.qiweionlineconnector.Attrs3Structure> getAttrs() {
        return attrs;
    } 

    public void setAttrs(List<com.dogfood.aa20240808.domain.structure.connector.qiweionlineconnector.Attrs3Structure> attrs) {
        this.attrs = attrs; 
    } 


}
