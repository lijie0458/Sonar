package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.OtherReturnStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import com.dogfood.aa20240808.domain.entities.OtherInStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_8BFFB96D9E1305E2BCB428D1CD810283 {

    public OtherReturnStorageDetailsEntity otherReturnStorageDetails;
    public OtherInStorageDetailsEntity otherInStorageDetails;
    public InventoryEntity inventory;
    public OtherReturnStorageDetailsEntity getOtherReturnStorageDetails() {
        return otherReturnStorageDetails;
    } 

    public void setOtherReturnStorageDetails(OtherReturnStorageDetailsEntity otherReturnStorageDetails) {
        this.otherReturnStorageDetails = otherReturnStorageDetails; 
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
