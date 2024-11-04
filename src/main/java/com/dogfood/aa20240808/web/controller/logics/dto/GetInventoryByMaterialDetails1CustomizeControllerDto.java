package com.dogfood.aa20240808.web.controller.logics.dto; 


public class GetInventoryByMaterialDetails1CustomizeControllerDto {

    public Long warehouseId;
    public Long locationId;
    public String materialCode;
    public Long getWarehouseId() {
        return warehouseId;
    } 

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId; 
    } 

    public Long getLocationId() {
        return locationId;
    } 

    public void setLocationId(Long locationId) {
        this.locationId = locationId; 
    } 

    public String getMaterialCode() {
        return materialCode;
    } 

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode; 
    } 


}
