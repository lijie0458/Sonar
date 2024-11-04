package com.dogfood.aa20240808.web.controller.logics.dto; 


public class GetInventoryByMaterialDetails2CustomizeControllerDto {

    public Long warehouseId;
    public String materialCode;
    public String lotNumber;
    public Long getWarehouseId() {
        return warehouseId;
    } 

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId; 
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


}
