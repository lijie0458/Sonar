package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.MaterialEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_988572FC06FE621688549C0BC53D9030 {

    public MaterialEntity material;
    public MaterialEntity getMaterial() {
        return material;
    } 

    public void setMaterial(MaterialEntity material) {
        this.material = material; 
    } 


}
