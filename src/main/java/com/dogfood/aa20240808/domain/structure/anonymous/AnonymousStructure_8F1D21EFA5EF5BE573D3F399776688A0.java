package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_8F1D21EFA5EF5BE573D3F399776688A0 {

    public BigDecimal outboundQuantity;
    public Long batchNumber;
    public Long warehouse;
    public BigDecimal stockQuantity;
    public BigDecimal occupiedQuantity;
    public String materialCode;
    public String material_name;
    public String specification;
    public String unitName;
    public BigDecimal getOutboundQuantity() {
        return outboundQuantity;
    } 

    public void setOutboundQuantity(BigDecimal outboundQuantity) {
        this.outboundQuantity = outboundQuantity; 
    } 

    public Long getBatchNumber() {
        return batchNumber;
    } 

    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber; 
    } 

    public Long getWarehouse() {
        return warehouse;
    } 

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse; 
    } 

    public BigDecimal getStockQuantity() {
        return stockQuantity;
    } 

    public void setStockQuantity(BigDecimal stockQuantity) {
        this.stockQuantity = stockQuantity; 
    } 

    public BigDecimal getOccupiedQuantity() {
        return occupiedQuantity;
    } 

    public void setOccupiedQuantity(BigDecimal occupiedQuantity) {
        this.occupiedQuantity = occupiedQuantity; 
    } 

    public String getMaterialCode() {
        return materialCode;
    } 

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode; 
    } 

    public String getMaterial_name() {
        return material_name;
    } 

    public void setMaterial_name(String material_name) {
        this.material_name = material_name; 
    } 

    public String getSpecification() {
        return specification;
    } 

    public void setSpecification(String specification) {
        this.specification = specification; 
    } 

    public String getUnitName() {
        return unitName;
    } 

    public void setUnitName(String unitName) {
        this.unitName = unitName; 
    } 


}
