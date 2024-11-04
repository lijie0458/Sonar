package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPUserDeptMapping; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_9C0F38CE0B1F4B46D348B17C9BB990AA {

    public LCAPUserDeptMapping lCAPUserDeptMapping;
    public LCAPUser lCAPUser;
    public LCAPUserDeptMapping getLCAPUserDeptMapping() {
        return lCAPUserDeptMapping;
    } 

    public void setLCAPUserDeptMapping(LCAPUserDeptMapping lCAPUserDeptMapping) {
        this.lCAPUserDeptMapping = lCAPUserDeptMapping; 
    } 

    public LCAPUser getLCAPUser() {
        return lCAPUser;
    } 

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser; 
    } 


}
