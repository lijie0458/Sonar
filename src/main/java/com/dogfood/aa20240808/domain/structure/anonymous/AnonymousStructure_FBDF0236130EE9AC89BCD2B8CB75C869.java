package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_FBDF0236130EE9AC89BCD2B8CB75C869 {

    public Warehouse_levelEntity warehouse_level;
    public Warehouse_levelEntity getWarehouse_level() {
        return warehouse_level;
    } 

    public void setWarehouse_level(Warehouse_levelEntity warehouse_level) {
        this.warehouse_level = warehouse_level; 
    } 


}
