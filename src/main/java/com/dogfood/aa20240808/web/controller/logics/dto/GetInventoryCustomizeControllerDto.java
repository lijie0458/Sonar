package com.dogfood.aa20240808.web.controller.logics.dto; 


public class GetInventoryCustomizeControllerDto {

    public String materialCode;
    public Long storageLocationId;
    public String lotNumber;
    public Long warehouse;
    public String getMaterialCode() {
        return materialCode;
    } 

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode; 
    } 

    public Long getStorageLocationId() {
        return storageLocationId;
    } 

    public void setStorageLocationId(Long storageLocationId) {
        this.storageLocationId = storageLocationId; 
    } 

    public String getLotNumber() {
        return lotNumber;
    } 

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber; 
    } 

    public Long getWarehouse() {
        return warehouse;
    } 

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse; 
    } 


}
