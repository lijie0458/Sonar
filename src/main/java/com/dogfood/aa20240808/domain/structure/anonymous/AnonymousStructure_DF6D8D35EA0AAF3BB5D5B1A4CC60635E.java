package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_DF6D8D35EA0AAF3BB5D5B1A4CC60635E {

    public OutsourceReturnStorageDetailsEntity outsourceReturnStorageDetails;
    public OutsourceInStorageDetailsEntity outsourceInStorageDetails;
    public InventoryEntity inventory;
    public OutsourceReturnStorageDetailsEntity getOutsourceReturnStorageDetails() {
        return outsourceReturnStorageDetails;
    } 

    public void setOutsourceReturnStorageDetails(OutsourceReturnStorageDetailsEntity outsourceReturnStorageDetails) {
        this.outsourceReturnStorageDetails = outsourceReturnStorageDetails; 
    } 

    public OutsourceInStorageDetailsEntity getOutsourceInStorageDetails() {
        return outsourceInStorageDetails;
    } 

    public void setOutsourceInStorageDetails(OutsourceInStorageDetailsEntity outsourceInStorageDetails) {
        this.outsourceInStorageDetails = outsourceInStorageDetails; 
    } 

    public InventoryEntity getInventory() {
        return inventory;
    } 

    public void setInventory(InventoryEntity inventory) {
        this.inventory = inventory; 
    } 


}
