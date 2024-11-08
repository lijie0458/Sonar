package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.ReceivingDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.BePutInStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class BePutInStorageStructureStructure {

    public MaterialDetailsEntity material;

    @Label("单位名称")
    public String unitName;

    public BePutInStorageDetailsEntity bePutInStorageDetails;

    public ReceivingDetailsEntity receivingDetails;

    public GoodsReturnedNoteDetailsEntity goodsReturnedNoteDetails;

    @Label("累计入库")
    public Long cumulativeStorage;

    @Label("累计退货")
    public Long cumulativeReturns;

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

    public BePutInStorageDetailsEntity getBePutInStorageDetails() {
        return bePutInStorageDetails;
    } 

    public void setBePutInStorageDetails(BePutInStorageDetailsEntity bePutInStorageDetails) {
        this.bePutInStorageDetails = bePutInStorageDetails; 
    } 

    public ReceivingDetailsEntity getReceivingDetails() {
        return receivingDetails;
    } 

    public void setReceivingDetails(ReceivingDetailsEntity receivingDetails) {
        this.receivingDetails = receivingDetails; 
    } 

    public GoodsReturnedNoteDetailsEntity getGoodsReturnedNoteDetails() {
        return goodsReturnedNoteDetails;
    } 

    public void setGoodsReturnedNoteDetails(GoodsReturnedNoteDetailsEntity goodsReturnedNoteDetails) {
        this.goodsReturnedNoteDetails = goodsReturnedNoteDetails; 
    } 

    public Long getCumulativeStorage() {
        return cumulativeStorage;
    } 

    public void setCumulativeStorage(Long cumulativeStorage) {
        this.cumulativeStorage = cumulativeStorage; 
    } 

    public Long getCumulativeReturns() {
        return cumulativeReturns;
    } 

    public void setCumulativeReturns(Long cumulativeReturns) {
        this.cumulativeReturns = cumulativeReturns; 
    } 

}
