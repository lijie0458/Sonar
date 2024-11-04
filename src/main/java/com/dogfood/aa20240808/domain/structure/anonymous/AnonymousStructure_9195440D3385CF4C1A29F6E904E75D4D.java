package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_9195440D3385CF4C1A29F6E904E75D4D {

    public String materialCode;
    public Long warehouse;
    public String getMaterialCode() {
        return materialCode;
    } 

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode; 
    } 

    public Long getWarehouse() {
        return warehouse;
    } 

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse; 
    } 


}
