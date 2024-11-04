package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_D064F9FB058DBE7CA5880F9FE42F0344 {

    public InventoryEntity inventory;
    public InventoryEntity getInventory() {
        return inventory;
    } 

    public void setInventory(InventoryEntity inventory) {
        this.inventory = inventory; 
    } 


}
