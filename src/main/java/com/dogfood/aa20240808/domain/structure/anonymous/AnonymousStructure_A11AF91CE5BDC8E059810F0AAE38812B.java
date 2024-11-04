package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_A11AF91CE5BDC8E059810F0AAE38812B {

    public Long id;
    public String materialCode;
    public String lotNumber;
    public String unit;
    public Long warehouse;
    public BigDecimal stockQuantity;
    public BigDecimal occupiedQuantity;
    public Long availableQuantity;
    public java.time.ZonedDateTime createdAt;
    public java.time.ZonedDateTime updatedAt;
    public Long location;
    public String material_name;
    public BigDecimal total;
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

    public String getLotNumber() {
        return lotNumber;
    } 

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber; 
    } 

    public String getUnit() {
        return unit;
    } 

    public void setUnit(String unit) {
        this.unit = unit; 
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

    public Long getAvailableQuantity() {
        return availableQuantity;
    } 

    public void setAvailableQuantity(Long availableQuantity) {
        this.availableQuantity = availableQuantity; 
    } 

    public java.time.ZonedDateTime getCreatedAt() {
        return createdAt;
    } 

    public void setCreatedAt(java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt; 
    } 

    public java.time.ZonedDateTime getUpdatedAt() {
        return updatedAt;
    } 

    public void setUpdatedAt(java.time.ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt; 
    } 

    public Long getLocation() {
        return location;
    } 

    public void setLocation(Long location) {
        this.location = location; 
    } 

    public String getMaterial_name() {
        return material_name;
    } 

    public void setMaterial_name(String material_name) {
        this.material_name = material_name; 
    } 

    public BigDecimal getTotal() {
        return total;
    } 

    public void setTotal(BigDecimal total) {
        this.total = total; 
    } 


}
