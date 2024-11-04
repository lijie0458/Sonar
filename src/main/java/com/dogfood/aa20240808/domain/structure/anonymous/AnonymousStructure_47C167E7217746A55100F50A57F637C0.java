package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_47C167E7217746A55100F50A57F637C0 {

    public LCAPUser lCAPUser;
    public LCAPUser getLCAPUser() {
        return lCAPUser;
    } 

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser; 
    } 


}
