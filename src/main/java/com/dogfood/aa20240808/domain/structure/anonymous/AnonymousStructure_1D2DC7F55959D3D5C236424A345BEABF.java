package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import com.dogfood.aa20240808.domain.entities.TransferSlipDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_1D2DC7F55959D3D5C236424A345BEABF {

    public TransferSlipDetailsEntity transferSlipDetails;
    public InventoryEntity inventory;
    public TransferSlipDetailsEntity getTransferSlipDetails() {
        return transferSlipDetails;
    } 

    public void setTransferSlipDetails(TransferSlipDetailsEntity transferSlipDetails) {
        this.transferSlipDetails = transferSlipDetails; 
    } 

    public InventoryEntity getInventory() {
        return inventory;
    } 

    public void setInventory(InventoryEntity inventory) {
        this.inventory = inventory; 
    } 


}
