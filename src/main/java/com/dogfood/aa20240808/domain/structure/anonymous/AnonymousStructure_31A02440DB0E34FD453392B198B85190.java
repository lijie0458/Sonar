package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_31A02440DB0E34FD453392B198B85190 {

    public Boolean property1;
    public List<Long> property2 = new ArrayList<>();
    public Boolean getProperty1() {
        return property1;
    } 

    public void setProperty1(Boolean property1) {
        this.property1 = property1; 
    } 

    public List<Long> getProperty2() {
        return property2;
    } 

    public void setProperty2(List<Long> property2) {
        this.property2 = property2; 
    } 


}
