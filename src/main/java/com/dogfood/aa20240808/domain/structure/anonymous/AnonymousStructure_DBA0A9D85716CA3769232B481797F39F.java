package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.SupplierEntity; 
import com.dogfood.aa20240808.domain.entities.SupplierDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_DBA0A9D85716CA3769232B481797F39F {

    public SupplierDetailsEntity supplierDetails;
    public SupplierEntity supplier;
    public SupplierDetailsEntity getSupplierDetails() {
        return supplierDetails;
    } 

    public void setSupplierDetails(SupplierDetailsEntity supplierDetails) {
        this.supplierDetails = supplierDetails; 
    } 

    public SupplierEntity getSupplier() {
        return supplier;
    } 

    public void setSupplier(SupplierEntity supplier) {
        this.supplier = supplier; 
    } 


}
