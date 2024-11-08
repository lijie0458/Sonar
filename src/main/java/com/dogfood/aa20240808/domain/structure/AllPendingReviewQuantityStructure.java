package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AllPendingReviewQuantityStructure {

    @Label("入出库总待审核数量")
    public Long inOutTotalQuantity;

    @Label("销售出库待审核数量")
    public Long saleOutWarehouseQuantity;

    @Label("产品入库待审核数量")
    public Long productInStorageQuantity;

    @Label("委外加工入库待审核数量")
    public Long outsourceInStorageQuantity;

    @Label("委外加工出库待审核数量")
    public Long outsourceOutStorageQuantity;

    @Label("生产领料待审核数量")
    public Long productionQuantity;

    @Label("其他入库待审核数量")
    public Long otherInStorageQuantity;

    @Label("其他出库待审核数量")
    public Long otherOutStorageQuantity;

    @Label("销售订单待审核数量")
    public Long saleOrderQuantity;

    @Label("采购订单待审核数量")
    public Long purchaseOrderQuantity;

    public Long getInOutTotalQuantity() {
        return inOutTotalQuantity;
    } 

    public void setInOutTotalQuantity(Long inOutTotalQuantity) {
        this.inOutTotalQuantity = inOutTotalQuantity; 
    } 

    public Long getSaleOutWarehouseQuantity() {
        return saleOutWarehouseQuantity;
    } 

    public void setSaleOutWarehouseQuantity(Long saleOutWarehouseQuantity) {
        this.saleOutWarehouseQuantity = saleOutWarehouseQuantity; 
    } 

    public Long getProductInStorageQuantity() {
        return productInStorageQuantity;
    } 

    public void setProductInStorageQuantity(Long productInStorageQuantity) {
        this.productInStorageQuantity = productInStorageQuantity; 
    } 

    public Long getOutsourceInStorageQuantity() {
        return outsourceInStorageQuantity;
    } 

    public void setOutsourceInStorageQuantity(Long outsourceInStorageQuantity) {
        this.outsourceInStorageQuantity = outsourceInStorageQuantity; 
    } 

    public Long getOutsourceOutStorageQuantity() {
        return outsourceOutStorageQuantity;
    } 

    public void setOutsourceOutStorageQuantity(Long outsourceOutStorageQuantity) {
        this.outsourceOutStorageQuantity = outsourceOutStorageQuantity; 
    } 

    public Long getProductionQuantity() {
        return productionQuantity;
    } 

    public void setProductionQuantity(Long productionQuantity) {
        this.productionQuantity = productionQuantity; 
    } 

    public Long getOtherInStorageQuantity() {
        return otherInStorageQuantity;
    } 

    public void setOtherInStorageQuantity(Long otherInStorageQuantity) {
        this.otherInStorageQuantity = otherInStorageQuantity; 
    } 

    public Long getOtherOutStorageQuantity() {
        return otherOutStorageQuantity;
    } 

    public void setOtherOutStorageQuantity(Long otherOutStorageQuantity) {
        this.otherOutStorageQuantity = otherOutStorageQuantity; 
    } 

    public Long getSaleOrderQuantity() {
        return saleOrderQuantity;
    } 

    public void setSaleOrderQuantity(Long saleOrderQuantity) {
        this.saleOrderQuantity = saleOrderQuantity; 
    } 

    public Long getPurchaseOrderQuantity() {
        return purchaseOrderQuantity;
    } 

    public void setPurchaseOrderQuantity(Long purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity; 
    } 

}
