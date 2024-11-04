package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.OtherInStorageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_B3BBD4D12970AF27D4FDAF1D48D79119 {

    public OtherInStorageEntity otherInStorage;
    public OtherInStorageEntity getOtherInStorage() {
        return otherInStorage;
    } 

    public void setOtherInStorage(OtherInStorageEntity otherInStorage) {
        this.otherInStorage = otherInStorage; 
    } 


}
