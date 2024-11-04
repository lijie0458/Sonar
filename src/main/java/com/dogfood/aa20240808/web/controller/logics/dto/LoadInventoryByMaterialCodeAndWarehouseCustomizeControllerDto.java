package com.dogfood.aa20240808.web.controller.logics.dto; 


public class LoadInventoryByMaterialCodeAndWarehouseCustomizeControllerDto {

    public Long location;
    public String materialCode;
    public String lotNumber;
    public Long warehouse;
    public Long getLocation() {
        return location;
    } 

    public void setLocation(Long location) {
        this.location = location; 
    } 

    public String getMaterialCode() {
        return materialCode;
    } 

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode; 
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
