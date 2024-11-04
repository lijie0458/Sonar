package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 

public class LoadBathNumberByCodeAnddistinctionDistinctCustomizeControllerDto {

    public Long distinction;
    public List<Long> ListBatchNumber;
    public Long warehouse;
    public String Code;
    public Long getDistinction() {
        return distinction;
    } 

    public void setDistinction(Long distinction) {
        this.distinction = distinction; 
    } 

    public List<Long> getListBatchNumber() {
        return ListBatchNumber;
    } 

    public void setListBatchNumber(List<Long> ListBatchNumber) {
        this.ListBatchNumber = ListBatchNumber; 
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
