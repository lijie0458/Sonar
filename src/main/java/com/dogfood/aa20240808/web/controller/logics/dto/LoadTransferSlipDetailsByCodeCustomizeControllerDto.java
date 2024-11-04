package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 

public class LoadTransferSlipDetailsByCodeCustomizeControllerDto {

    public List<String> InventoryList;
    public Long outWareHouse;
    public Long InWareHouse;
    public List<String> getInventoryList() {
        return InventoryList;
    } 

    public void setInventoryList(List<String> InventoryList) {
        this.InventoryList = InventoryList; 
    } 

    public Long getOutWareHouse() {
        return outWareHouse;
    } 

    public void setOutWareHouse(Long outWareHouse) {
        this.outWareHouse = outWareHouse; 
    } 

    public Long getInWareHouse() {
        return InWareHouse;
    } 

    public void setInWareHouse(Long InWareHouse) {
        this.InWareHouse = InWareHouse; 
    } 


}
