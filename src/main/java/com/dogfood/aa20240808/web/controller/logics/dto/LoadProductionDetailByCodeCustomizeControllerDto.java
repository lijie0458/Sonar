package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 

public class LoadProductionDetailByCodeCustomizeControllerDto {

    public List<String> InventoryList;

    public List<String> getInventoryList() {
        return InventoryList;
    } 

    public void setInventoryList(List<String> InventoryList) {
        this.InventoryList = InventoryList; 
    } 

}
