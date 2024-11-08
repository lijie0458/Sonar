package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import javax.validation.constraints.NotNull; 
import java.math.BigDecimal; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class GoodsReturnedNoteDetailsEntity {

    @Label("id")
    @NotNull
    public Long id;

    @Label("退货单号")
    public String goodsReturnedNote;

    @Label("退货数量")
    public BigDecimal bePutInStorageQuantity;

    @Label("物料编码")
    public String materialNumber;

    @Label("批号")
    public String batchNumber;

    @Label("关联的收货单明细")
    public Long bePutInStorageDetailsId;

    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id; 
    } 

    public String getGoodsReturnedNote() {
        return goodsReturnedNote;
    } 

    public void setGoodsReturnedNote(String goodsReturnedNote) {
        this.goodsReturnedNote = goodsReturnedNote; 
    } 

    public BigDecimal getBePutInStorageQuantity() {
        return bePutInStorageQuantity;
    } 

    public void setBePutInStorageQuantity(BigDecimal bePutInStorageQuantity) {
        this.bePutInStorageQuantity = bePutInStorageQuantity; 
    } 

    public String getMaterialNumber() {
        return materialNumber;
    } 

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber; 
    } 

    public String getBatchNumber() {
        return batchNumber;
    } 

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber; 
    } 

    public Long getBePutInStorageDetailsId() {
        return bePutInStorageDetailsId;
    } 

    public void setBePutInStorageDetailsId(Long bePutInStorageDetailsId) {
        this.bePutInStorageDetailsId = bePutInStorageDetailsId; 
    } 

}
