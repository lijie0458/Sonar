package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_6CA25F63D4A24168C85048D927F1049F {

    public Warehouse_levelEntity warehouse_level;
    public LCAPUser lCAPUser;
    public Warehouse_levelEntity getWarehouse_level() {
        return warehouse_level;
    } 

    public void setWarehouse_level(Warehouse_levelEntity warehouse_level) {
        this.warehouse_level = warehouse_level; 
    } 

    public LCAPUser getLCAPUser() {
        return lCAPUser;
    } 

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser; 
    } 


}
