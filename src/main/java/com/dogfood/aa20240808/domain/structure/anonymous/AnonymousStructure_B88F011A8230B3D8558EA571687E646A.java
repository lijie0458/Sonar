package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_B88F011A8230B3D8558EA571687E646A {

    public Storage_locationEntity storage_location;
    public Warehouse_levelTwoEntity warehouse_levelTwo;
    public Storage_locationEntity getStorage_location() {
        return storage_location;
    } 

    public void setStorage_location(Storage_locationEntity storage_location) {
        this.storage_location = storage_location; 
    } 

    public Warehouse_levelTwoEntity getWarehouse_levelTwo() {
        return warehouse_levelTwo;
    } 

    public void setWarehouse_levelTwo(Warehouse_levelTwoEntity warehouse_levelTwo) {
        this.warehouse_levelTwo = warehouse_levelTwo; 
    } 


}
