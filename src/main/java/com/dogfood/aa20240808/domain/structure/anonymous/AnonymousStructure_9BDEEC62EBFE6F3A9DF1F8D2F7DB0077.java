package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.PurchaseOrderDetailsListStructure; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_9BDEEC62EBFE6F3A9DF1F8D2F7DB0077 {

    public List<PurchaseOrderDetailsListStructure> list = new ArrayList<>();
    public Long total;
    public List<PurchaseOrderDetailsListStructure> getList() {
        return list;
    } 

    public void setList(List<PurchaseOrderDetailsListStructure> list) {
        this.list = list; 
    } 

    public Long getTotal() {
        return total;
    } 

    public void setTotal(Long total) {
        this.total = total; 
    } 


}
