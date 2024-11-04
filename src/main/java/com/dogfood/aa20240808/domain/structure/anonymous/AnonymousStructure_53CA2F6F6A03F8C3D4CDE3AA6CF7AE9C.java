package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPPerResMapping; 
import com.dogfood.aa20240808.domain.entities.LCAPResource; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_53CA2F6F6A03F8C3D4CDE3AA6CF7AE9C {

    public LCAPPerResMapping lCAPPerResMapping;
    public LCAPResource lCAPResource;
    public LCAPPerResMapping getLCAPPerResMapping() {
        return lCAPPerResMapping;
    } 

    public void setLCAPPerResMapping(LCAPPerResMapping lCAPPerResMapping) {
        this.lCAPPerResMapping = lCAPPerResMapping; 
    } 

    public LCAPResource getLCAPResource() {
        return lCAPResource;
    } 

    public void setLCAPResource(LCAPResource lCAPResource) {
        this.lCAPResource = lCAPResource; 
    } 


}
