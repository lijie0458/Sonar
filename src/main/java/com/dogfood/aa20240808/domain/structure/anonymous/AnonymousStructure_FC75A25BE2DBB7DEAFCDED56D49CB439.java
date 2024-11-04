package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.PurchaseDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.PurchaseRequestEntity; 
import com.dogfood.aa20240808.domain.entities.DepartmentEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_FC75A25BE2DBB7DEAFCDED56D49CB439 {

    public PurchaseDetailsEntity purchaseDetails;
    public PurchaseRequestEntity purchaseRequest;
    public DepartmentEntity department;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public PurchaseDetailsEntity getPurchaseDetails() {
        return purchaseDetails;
    } 

    public void setPurchaseDetails(PurchaseDetailsEntity purchaseDetails) {
        this.purchaseDetails = purchaseDetails; 
    } 

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

    public MaterialDetailsEntity getMaterialDetails() {
        return materialDetails;
    } 

    public void setMaterialDetails(MaterialDetailsEntity materialDetails) {
        this.materialDetails = materialDetails; 
    } 

    public MeasuringUnitEntity getMeasuringUnit() {
        return measuringUnit;
    } 

    public void setMeasuringUnit(MeasuringUnitEntity measuringUnit) {
        this.measuringUnit = measuringUnit; 
    } 


}
