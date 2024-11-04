package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_F7663842FDC6CAB5DAA52F0830A1464E {

    public Warehouse_levelTwoEntity warehouse_levelTwo;
    public Warehouse_levelEntity warehouse_level;
    public LCAPUser lCAPUser;
    public Warehouse_levelTwoEntity getWarehouse_levelTwo() {
        return warehouse_levelTwo;
    } 

    public void setWarehouse_levelTwo(Warehouse_levelTwoEntity warehouse_levelTwo) {
        this.warehouse_levelTwo = warehouse_levelTwo; 
    } 

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
