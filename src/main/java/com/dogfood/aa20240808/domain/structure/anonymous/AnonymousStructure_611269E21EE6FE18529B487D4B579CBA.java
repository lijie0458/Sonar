package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.BePutInStorageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_611269E21EE6FE18529B487D4B579CBA {

    public BePutInStorageEntity bePutInStorage;
    public BePutInStorageEntity getBePutInStorage() {
        return bePutInStorage;
    } 

    public void setBePutInStorage(BePutInStorageEntity bePutInStorage) {
        this.bePutInStorage = bePutInStorage; 
    } 


}
