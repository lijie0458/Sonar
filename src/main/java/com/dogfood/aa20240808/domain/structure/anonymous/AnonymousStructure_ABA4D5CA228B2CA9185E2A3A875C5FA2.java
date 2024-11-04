package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_ABA4D5CA228B2CA9185E2A3A875C5FA2 {

    public Warehouse_levelTwoEntity warehouse_levelTwo;
    public Warehouse_levelTwoEntity getWarehouse_levelTwo() {
        return warehouse_levelTwo;
    } 

    public void setWarehouse_levelTwo(Warehouse_levelTwoEntity warehouse_levelTwo) {
        this.warehouse_levelTwo = warehouse_levelTwo; 
    } 


}
