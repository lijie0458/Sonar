package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_B008B6EA68E34052D6DD5E601C00DF35 {

    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170> list = new ArrayList<>();
    public Long total;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170> getList() {
        return list;
    } 

    public void setList(List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170> list) {
        this.list = list; 
    } 

    public Long getTotal() {
        return total;
    } 

    public void setTotal(Long total) {
        this.total = total; 
    } 


}
