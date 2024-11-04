package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_65D0EF330467EBAF8C83901C34CF0460 {

    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A1C3A855CCD635641331B29B571163B> list = new ArrayList<>();
    public Long total;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A1C3A855CCD635641331B29B571163B> getList() {
        return list;
    } 

    public void setList(List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_6A1C3A855CCD635641331B29B571163B> list) {
        this.list = list; 
    } 

    public Long getTotal() {
        return total;
    } 

    public void setTotal(Long total) {
        this.total = total; 
    } 


}
