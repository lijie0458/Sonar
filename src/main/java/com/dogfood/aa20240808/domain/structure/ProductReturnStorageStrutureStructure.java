package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.ProductReturnStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ProductReturnStorageStrutureStructure {

    @Label("产品入库详情数据结构")
    public ProductInStorageDetailsStrutureStructure productInStorageDetailsStruture;

    @Label("产品入库退回信息")
    public ProductReturnStorageDetailsEntity productReturnStorageDetails;

    public ProductInStorageDetailsStrutureStructure getProductInStorageDetailsStruture() {
        return productInStorageDetailsStruture;
    } 

    public void setProductInStorageDetailsStruture(ProductInStorageDetailsStrutureStructure productInStorageDetailsStruture) {
        this.productInStorageDetailsStruture = productInStorageDetailsStruture; 
    } 

    public ProductReturnStorageDetailsEntity getProductReturnStorageDetails() {
        return productReturnStorageDetails;
    } 

    public void setProductReturnStorageDetails(ProductReturnStorageDetailsEntity productReturnStorageDetails) {
        this.productReturnStorageDetails = productReturnStorageDetails; 
    } 

}
