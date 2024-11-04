package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.PurchaseRequestEntity; 
import com.dogfood.aa20240808.domain.entities.DepartmentEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_7FF730EDA24859558C689731C4BB4575 {

    public PurchaseRequestEntity purchaseRequest;
    public DepartmentEntity department;
    public PurchaseRequestEntity getPurchaseRequest() {
        return purchaseRequest;
    } 

    public void setPurchaseRequest(PurchaseRequestEntity purchaseRequest) {
        this.purchaseRequest = purchaseRequest; 
    } 

    public DepartmentEntity getDepartment() {
        return department;
    } 

    public void setDepartment(DepartmentEntity department) {
        this.department = department; 
    } 


}
