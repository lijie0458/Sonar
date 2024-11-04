package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.ReceivingDetailsStructureStructure; 
import java.util.List; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_69DB7B117C9C727DD189B37EADB841E6 {

    public List<ReceivingDetailsStructureStructure> list = new ArrayList<>();
    public List<ReceivingDetailsStructureStructure> getList() {
        return list;
    } 

    public void setList(List<ReceivingDetailsStructureStructure> list) {
        this.list = list; 
    } 


}
