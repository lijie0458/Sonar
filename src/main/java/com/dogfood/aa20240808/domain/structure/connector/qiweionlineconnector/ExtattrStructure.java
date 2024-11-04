package com.dogfood.aa20240808.domain.structure.connector.qiweionlineconnector; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ExtattrStructure {

    public List<com.dogfood.aa20240808.domain.structure.connector.qiweionlineconnector.Attrs2Structure> attrs = new ArrayList<>();
    public List<com.dogfood.aa20240808.domain.structure.connector.qiweionlineconnector.Attrs2Structure> getAttrs() {
        return attrs;
    } 

    public void setAttrs(List<com.dogfood.aa20240808.domain.structure.connector.qiweionlineconnector.Attrs2Structure> attrs) {
        this.attrs = attrs; 
    } 


}
