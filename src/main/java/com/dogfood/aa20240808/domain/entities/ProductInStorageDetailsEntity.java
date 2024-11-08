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
public class ProductInStorageDetailsEntity {

    @Label("主键")
    @NotNull
    public Long id;

    @Label("创建时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public ZonedDateTime createdTime;

    @Label("更新时间")
    @JsonFormat(pattern = DateTimeFormatConfiguration.ZONED_DATETIME_FORMAT,timezone = DateTimeFormatConfiguration.DEFAULT_TIMEZONE)
    public ZonedDateTime updatedTime;

    @Label("创建者")
    public String createdBy;

    @Label("更新者")
    public String updatedBy;

    @Label("入库单号")
    public String code;

    @Label("物料编号")
    public String materialCode;

    @Label("批号")
    public String lotNumber;

    @Label("数量")
    public BigDecimal quantity;

    @Label("源单单号")
    public String sourceCode;

    @Label("入库仓库")
    public Long warehouseId;

    @Label("备注")
    public String remark;

    @Label("未退货数量")
    public BigDecimal unreturnQuantity;

    @Label("库位")
    public Long storageLocationId;

    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id; 
    } 

    public ZonedDateTime getCreatedTime() {
        return createdTime;
    } 

    public void setCreatedTime(ZonedDateTime createdTime) {
        this.createdTime = createdTime; 
    } 

    public ZonedDateTime getUpdatedTime() {
        return updatedTime;
    } 

    public void setUpdatedTime(ZonedDateTime updatedTime) {
        this.updatedTime = updatedTime; 
    } 

    public String getCreatedBy() {
        return createdBy;
    } 

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; 
    } 

    public String getUpdatedBy() {
        return updatedBy;
    } 

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy; 
    } 

    public String getCode() {
        return code;
    } 

    public void setCode(String code) {
        this.code = code; 
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

    public BigDecimal getQuantity() {
        return quantity;
    } 

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity; 
    } 

    public String getSourceCode() {
        return sourceCode;
    } 

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode; 
    } 

    public Long getWarehouseId() {
        return warehouseId;
    } 

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId; 
    } 

    public String getRemark() {
        return remark;
    } 

    public void setRemark(String remark) {
        this.remark = remark; 
    } 

    public BigDecimal getUnreturnQuantity() {
        return unreturnQuantity;
    } 

    public void setUnreturnQuantity(BigDecimal unreturnQuantity) {
        this.unreturnQuantity = unreturnQuantity; 
    } 

    public Long getStorageLocationId() {
        return storageLocationId;
    } 

    public void setStorageLocationId(Long storageLocationId) {
        this.storageLocationId = storageLocationId; 
    } 

}
