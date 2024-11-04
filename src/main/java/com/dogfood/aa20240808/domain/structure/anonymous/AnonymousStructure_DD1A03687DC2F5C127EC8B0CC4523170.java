package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_DD1A03687DC2F5C127EC8B0CC4523170 {

    public OutsourceReturnStorageEntity outsourceReturnStorage;
    public OutsourceReturnStorageEntity getOutsourceReturnStorage() {
        return outsourceReturnStorage;
    } 

    public void setOutsourceReturnStorage(OutsourceReturnStorageEntity outsourceReturnStorage) {
        this.outsourceReturnStorage = outsourceReturnStorage; 
    } 


}
