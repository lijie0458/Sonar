package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPRolePerMapping; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_1C8D1250B6DC21B85363C7974FAD68BD {

    public LCAPRolePerMapping lCAPRolePerMapping;
    public LCAPRolePerMapping getLCAPRolePerMapping() {
        return lCAPRolePerMapping;
    } 

    public void setLCAPRolePerMapping(LCAPRolePerMapping lCAPRolePerMapping) {
        this.lCAPRolePerMapping = lCAPRolePerMapping; 
    } 


}
