package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPRole; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_70791B893F53C2EFB9E501591763B020 {

    public LCAPRole lCAPRole;
    public LCAPRole getLCAPRole() {
        return lCAPRole;
    } 

    public void setLCAPRole(LCAPRole lCAPRole) {
        this.lCAPRole = lCAPRole; 
    } 


}
