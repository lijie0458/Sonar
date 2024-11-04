package com.dogfood.aa20240808.web.controller.logics.dto; 


public class LoadCountInventoryByCodeAndWahouseCustomizeControllerDto {

    public Long Warehouse;
    public String code;
    public Long getWarehouse() {
        return Warehouse;
    } 

    public void setWarehouse(Long Warehouse) {
        this.Warehouse = Warehouse; 
    } 

    public String getCode() {
        return code;
    } 

    public void setCode(String code) {
        this.code = code; 
    } 


}
