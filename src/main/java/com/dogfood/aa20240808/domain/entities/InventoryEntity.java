package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import java.time.ZonedDateTime; 
import javax.validation.constraints.NotNull; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import java.math.BigDecimal; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class InventoryEntity {

    @NotNull
    public Long id;

    @Label("物料")
    @NotNull
    public String materialCode;

    @Label("批号")
    public String lotNumber;

    @NotNull
    public String unit;

    @Label("仓库")
    @NotNull
    public Long warehouse;

    @Label("库存数量")
    @NotNull
    public BigDecimal stockQuantity;

    @Label("暂用数量")
    @NotNull
    public BigDecimal occupiedQuantity;

    @Label("可用数量")
    @NotNull
    public Long availableQuantity;

    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public ZonedDateTime createdAt;

    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public ZonedDateTime updatedAt;

    @Label("库位")
    public Long location;

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

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    } 

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt; 
    } 

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    } 

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt; 
    } 

    public Long getLocation() {
        return location;
    } 

    public void setLocation(Long location) {
        this.location = location; 
    } 

}
