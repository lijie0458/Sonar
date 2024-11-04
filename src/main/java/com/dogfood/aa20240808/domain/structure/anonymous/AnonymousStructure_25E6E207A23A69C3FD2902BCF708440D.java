package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_25E6E207A23A69C3FD2902BCF708440D {

    public Long batchNumber;
    public BigDecimal quantity;
    public Long inWarehouse;
    public String inStorageLocation;
    public Long getBatchNumber() {
        return batchNumber;
    } 

    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber; 
    } 

    public BigDecimal getQuantity() {
        return quantity;
    } 

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity; 
    } 

    public Long getInWarehouse() {
        return inWarehouse;
    } 

    public void setInWarehouse(Long inWarehouse) {
        this.inWarehouse = inWarehouse; 
    } 

    public String getInStorageLocation() {
        return inStorageLocation;
    } 

    public void setInStorageLocation(String inStorageLocation) {
        this.inStorageLocation = inStorageLocation; 
    } 


}
