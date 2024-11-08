package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import javax.validation.constraints.NotNull; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class BePutInStorageDetailsEntity {

    @Label("id")
    @NotNull
    public Long id;

    @Label("入库单号")
    public String bePutInStorageId;

    @Label("入库数量")
    public Long bePutInStorageQuantity;

    @Label("物料编码")
    public String materialNumber;

    @Label("应收数量")
    public Long receivableQuantity;

    @Label("批号")
    public String batchNumber;

    @Label("收货单明细Id")
    public Long receivingDetailsId;

    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id; 
    } 

    public String getBePutInStorageId() {
        return bePutInStorageId;
    } 

    public void setBePutInStorageId(String bePutInStorageId) {
        this.bePutInStorageId = bePutInStorageId; 
    } 

    public Long getBePutInStorageQuantity() {
        return bePutInStorageQuantity;
    } 

    public void setBePutInStorageQuantity(Long bePutInStorageQuantity) {
        this.bePutInStorageQuantity = bePutInStorageQuantity; 
    } 

    public String getMaterialNumber() {
        return materialNumber;
    } 

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber; 
    } 

    public Long getReceivableQuantity() {
        return receivableQuantity;
    } 

    public void setReceivableQuantity(Long receivableQuantity) {
        this.receivableQuantity = receivableQuantity; 
    } 

    public String getBatchNumber() {
        return batchNumber;
    } 

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber; 
    } 

    public Long getReceivingDetailsId() {
        return receivingDetailsId;
    } 

    public void setReceivingDetailsId(Long receivingDetailsId) {
        this.receivingDetailsId = receivingDetailsId; 
    } 

}
