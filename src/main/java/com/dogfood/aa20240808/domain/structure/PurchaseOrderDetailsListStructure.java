package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.PurchaseOrderEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.SupplierDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.PurchaseOrderDetailEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class PurchaseOrderDetailsListStructure {

    @Label("物料")
    public MaterialDetailsEntity materialDetails;

    @Label("订单")
    public PurchaseOrderEntity purchaseOrder;

    @Label("订单详情")
    public PurchaseOrderDetailEntity purchaseOrderDetail;

    @Label("供应商")
    public SupplierDetailsEntity supplierDetails;

    @Label("单位")
    public MeasuringUnitEntity measuringUnit;

    @Label("累计收货数量")
    public Long cumulativeQWuantity;

    public MaterialDetailsEntity getMaterialDetails() {
        return materialDetails;
    } 

    public void setMaterialDetails(MaterialDetailsEntity materialDetails) {
        this.materialDetails = materialDetails; 
    } 

    public PurchaseOrderEntity getPurchaseOrder() {
        return purchaseOrder;
    } 

    public void setPurchaseOrder(PurchaseOrderEntity purchaseOrder) {
        this.purchaseOrder = purchaseOrder; 
    } 

    public PurchaseOrderDetailEntity getPurchaseOrderDetail() {
        return purchaseOrderDetail;
    } 

    public void setPurchaseOrderDetail(PurchaseOrderDetailEntity purchaseOrderDetail) {
        this.purchaseOrderDetail = purchaseOrderDetail; 
    } 

    public SupplierDetailsEntity getSupplierDetails() {
        return supplierDetails;
    } 

    public void setSupplierDetails(SupplierDetailsEntity supplierDetails) {
        this.supplierDetails = supplierDetails; 
    } 

    public MeasuringUnitEntity getMeasuringUnit() {
        return measuringUnit;
    } 

    public void setMeasuringUnit(MeasuringUnitEntity measuringUnit) {
        this.measuringUnit = measuringUnit; 
    } 

    public Long getCumulativeQWuantity() {
        return cumulativeQWuantity;
    } 

    public void setCumulativeQWuantity(Long cumulativeQWuantity) {
        this.cumulativeQWuantity = cumulativeQWuantity; 
    } 

}
