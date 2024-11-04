package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_424448B1B7A0AC083FF2F95BF7CC36C4 {

    public String materialCode;
    public BigDecimal stockQuantity;
    public BigDecimal occupiedQuantity;
    public Long availableQuantity;
    public String material_name;
    public String specification;
    public String location_name;
    public String warehouse_name;
    public String unitName;
    public BigDecimal total;
    public String getMaterialCode() {
        return materialCode;
    } 

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode; 
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

    public String getLocation_name() {
        return location_name;
    } 

    public void setLocation_name(String location_name) {
        this.location_name = location_name; 
    } 

    public String getWarehouse_name() {
        return warehouse_name;
    } 

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name; 
    } 

    public String getUnitName() {
        return unitName;
    } 

    public void setUnitName(String unitName) {
        this.unitName = unitName; 
    } 

    public BigDecimal getTotal() {
        return total;
    } 

    public void setTotal(BigDecimal total) {
        this.total = total; 
    } 


}
