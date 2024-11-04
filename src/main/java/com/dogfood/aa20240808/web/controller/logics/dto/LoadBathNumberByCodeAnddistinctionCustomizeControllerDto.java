package com.dogfood.aa20240808.web.controller.logics.dto; 


public class LoadBathNumberByCodeAnddistinctionCustomizeControllerDto {

    public Long distinction;
    public Long warehouse;
    public String Code;
    public Long getDistinction() {
        return distinction;
    } 

    public void setDistinction(Long distinction) {
        this.distinction = distinction; 
    } 

    public Long getWarehouse() {
        return warehouse;
    } 

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse; 
    } 

    public String getCode() {
        return Code;
    } 

    public void setCode(String Code) {
        this.Code = Code; 
    } 


}
