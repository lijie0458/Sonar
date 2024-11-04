package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_950B930A01B608CCA173536BB93CD694 {

    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119> list = new ArrayList<>();
    public Long total;
    public List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119> getList() {
        return list;
    } 

    public void setList(List<com.dogfood.aa20240808.domain.structure.anonymous.AnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119> list) {
        this.list = list; 
    } 

    public Long getTotal() {
        return total;
    } 

    public void setTotal(Long total) {
        this.total = total; 
    } 


}
