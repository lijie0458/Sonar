package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPPermission; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_92F2372792A8A12DF53175B7AD25D2FD {

    public LCAPPermission lCAPPermission;
    public LCAPPermission getLCAPPermission() {
        return lCAPPermission;
    } 

    public void setLCAPPermission(LCAPPermission lCAPPermission) {
        this.lCAPPermission = lCAPPermission; 
    } 


}
