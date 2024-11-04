package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import com.dogfood.aa20240808.domain.entities.OtherInStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.OtherInStorageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_C4D609A7D421658ADC4BDA8783200DA9 {

    public OtherInStorageEntity otherInStorage;
    public OtherInStorageDetailsEntity otherInStorageDetails;
    public InventoryEntity inventory;
    public OtherInStorageEntity getOtherInStorage() {
        return otherInStorage;
    } 

    public void setOtherInStorage(OtherInStorageEntity otherInStorage) {
        this.otherInStorage = otherInStorage; 
    } 

    public OtherInStorageDetailsEntity getOtherInStorageDetails() {
        return otherInStorageDetails;
    } 

    public void setOtherInStorageDetails(OtherInStorageDetailsEntity otherInStorageDetails) {
        this.otherInStorageDetails = otherInStorageDetails; 
    } 

    public InventoryEntity getInventory() {
        return inventory;
    } 

    public void setInventory(InventoryEntity inventory) {
        this.inventory = inventory; 
    } 


}
