package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPResource; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_EA050579F163467B7D2FD3E8C15362AF {

    public LCAPResource lCAPResource;
    public LCAPResource getLCAPResource() {
        return lCAPResource;
    } 

    public void setLCAPResource(LCAPResource lCAPResource) {
        this.lCAPResource = lCAPResource; 
    } 


}
