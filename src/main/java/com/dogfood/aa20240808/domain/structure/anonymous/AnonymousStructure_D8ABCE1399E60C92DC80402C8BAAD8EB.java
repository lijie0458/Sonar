package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_D8ABCE1399E60C92DC80402C8BAAD8EB {

    public Storage_locationEntity storage_location;
    public Storage_locationEntity getStorage_location() {
        return storage_location;
    } 

    public void setStorage_location(Storage_locationEntity storage_location) {
        this.storage_location = storage_location; 
    } 


}
