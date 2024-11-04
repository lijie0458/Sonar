package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.ListTransferSlipStructure; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_A617B684B2576BF205A0A005CC8AF429 {

    public List<ListTransferSlipStructure> list = new ArrayList<>();
    public Long total;
    public List<ListTransferSlipStructure> getList() {
        return list;
    } 

    public void setList(List<ListTransferSlipStructure> list) {
        this.list = list; 
    } 

    public Long getTotal() {
        return total;
    } 

    public void setTotal(Long total) {
        this.total = total; 
    } 


}
