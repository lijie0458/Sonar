package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.SupplierEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_5C876B35461EDCB49D6DF68E585F23C8 {

    public SupplierEntity supplier;
    public SupplierEntity getSupplier() {
        return supplier;
    } 

    public void setSupplier(SupplierEntity supplier) {
        this.supplier = supplier; 
    } 


}
