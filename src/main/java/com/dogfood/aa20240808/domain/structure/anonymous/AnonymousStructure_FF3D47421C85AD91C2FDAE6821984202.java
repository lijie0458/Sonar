package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPDepartment; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_FF3D47421C85AD91C2FDAE6821984202 {

    public LCAPDepartment lCAPDepartment;
    public LCAPDepartment getLCAPDepartment() {
        return lCAPDepartment;
    } 

    public void setLCAPDepartment(LCAPDepartment lCAPDepartment) {
        this.lCAPDepartment = lCAPDepartment; 
    } 


}
