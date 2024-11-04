package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_D8CB63E646D19A8E127BF2A118560F92 {

    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_EA050579F163467B7D2FD3E8C15362AF> list = new ArrayList<>();
    public Long total;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_EA050579F163467B7D2FD3E8C15362AF> getList() {
        return list;
    } 

    public void setList(List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_EA050579F163467B7D2FD3E8C15362AF> list) {
        this.list = list; 
    } 

    public Long getTotal() {
        return total;
    } 

    public void setTotal(Long total) {
        this.total = total; 
    } 


}
