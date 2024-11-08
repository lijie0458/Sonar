package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.PurchaseDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class PurchaseDetailStructureStructure {

    public MaterialDetailsEntity material;

    @Label("单位名称")
    public String unitName;

    public PurchaseDetailsEntity purchaseDetails;

    public MaterialDetailsEntity getMaterial() {
        return material;
    } 

    public void setMaterial(MaterialDetailsEntity material) {
        this.material = material; 
    } 

    public String getUnitName() {
        return unitName;
    } 

    public void setUnitName(String unitName) {
        this.unitName = unitName; 
    } 

    public PurchaseDetailsEntity getPurchaseDetails() {
        return purchaseDetails;
    } 

    public void setPurchaseDetails(PurchaseDetailsEntity purchaseDetails) {
        this.purchaseDetails = purchaseDetails; 
    } 

}
