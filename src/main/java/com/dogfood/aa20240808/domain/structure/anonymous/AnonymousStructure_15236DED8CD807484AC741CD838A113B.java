package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_15236DED8CD807484AC741CD838A113B {

    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073> list = new ArrayList<>();
    public Long total;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073> getList() {
        return list;
    } 

    public void setList(List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B0D6BA4B2283DC4DA976DAF31C826073> list) {
        this.list = list; 
    } 

    public Long getTotal() {
        return total;
    } 

    public void setTotal(Long total) {
        this.total = total; 
    } 


}
