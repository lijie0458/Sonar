package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 

public class LoadInventoryINBatchNumberCustomizeControllerDto {

    public List<Long> BatchNumber;
    public List<Long> getBatchNumber() {
        return BatchNumber;
    } 

    public void setBatchNumber(List<Long> BatchNumber) {
        this.BatchNumber = BatchNumber; 
    } 


}
