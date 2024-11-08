package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import javax.validation.constraints.NotNull; 
import java.math.BigDecimal; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class TransferSlipDetailsEntity {

    @NotNull
    public Long id;

    @Label("物料编码")
    public String materialCode;

    @Label("数量")
    public BigDecimal quantity;

    @Label("备注")
    public String notes;

    @Label("关联单号")
    public String productionMaterialRequisition;

    @Label("调出仓库")
    public Long outWarehouse;

    @Label("调出批号")
    public Long batchNumber;

    @Label("库位")
    public String outStorageLocation;

    @Label("调入仓库")
    public Long inWarehouse;

    @Label("调入库位")
    public String inStorageLocation;

    @Label("批号")
    public String lotNumber;

    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id; 
    } 

    public String getMaterialCode() {
        return materialCode;
    } 

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode; 
    } 

    public BigDecimal getQuantity() {
        return quantity;
    } 

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity; 
    } 

    public String getNotes() {
        return notes;
    } 

    public void setNotes(String notes) {
        this.notes = notes; 
    } 

    public String getProductionMaterialRequisition() {
        return productionMaterialRequisition;
    } 

    public void setProductionMaterialRequisition(String productionMaterialRequisition) {
        this.productionMaterialRequisition = productionMaterialRequisition; 
    } 

    public Long getOutWarehouse() {
        return outWarehouse;
    } 

    public void setOutWarehouse(Long outWarehouse) {
        this.outWarehouse = outWarehouse; 
    } 

    public Long getBatchNumber() {
        return batchNumber;
    } 

    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber; 
    } 

    public String getOutStorageLocation() {
        return outStorageLocation;
    } 

    public void setOutStorageLocation(String outStorageLocation) {
        this.outStorageLocation = outStorageLocation; 
    } 

    public Long getInWarehouse() {
        return inWarehouse;
    } 

    public void setInWarehouse(Long inWarehouse) {
        this.inWarehouse = inWarehouse; 
    } 

    public String getInStorageLocation() {
        return inStorageLocation;
    } 

    public void setInStorageLocation(String inStorageLocation) {
        this.inStorageLocation = inStorageLocation; 
    } 

    public String getLotNumber() {
        return lotNumber;
    } 

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber; 
    } 

}
