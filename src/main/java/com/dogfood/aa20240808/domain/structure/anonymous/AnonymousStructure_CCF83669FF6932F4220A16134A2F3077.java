package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.OtherReturnStorageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_CCF83669FF6932F4220A16134A2F3077 {

    public OtherReturnStorageEntity otherReturnStorage;
    public OtherReturnStorageEntity getOtherReturnStorage() {
        return otherReturnStorage;
    } 

    public void setOtherReturnStorage(OtherReturnStorageEntity otherReturnStorage) {
        this.otherReturnStorage = otherReturnStorage; 
    } 


}
