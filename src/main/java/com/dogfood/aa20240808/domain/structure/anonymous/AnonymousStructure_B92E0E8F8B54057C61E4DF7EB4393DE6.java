package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.PurchaseOrderEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.SupplierDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.PurchaseOrderDetailEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_B92E0E8F8B54057C61E4DF7EB4393DE6 {

    public PurchaseOrderEntity purchaseOrder;
    public SupplierDetailsEntity supplierDetails;
    public PurchaseOrderDetailEntity purchaseOrderDetail;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public PurchaseOrderEntity getPurchaseOrder() {
        return purchaseOrder;
    } 

    public void setPurchaseOrder(PurchaseOrderEntity purchaseOrder) {
        this.purchaseOrder = purchaseOrder; 
    } 

    public SupplierDetailsEntity getSupplierDetails() {
        return supplierDetails;
    } 

    public void setSupplierDetails(SupplierDetailsEntity supplierDetails) {
        this.supplierDetails = supplierDetails; 
    } 

    public PurchaseOrderDetailEntity getPurchaseOrderDetail() {
        return purchaseOrderDetail;
    } 

    public void setPurchaseOrderDetail(PurchaseOrderDetailEntity purchaseOrderDetail) {
        this.purchaseOrderDetail = purchaseOrderDetail; 
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
