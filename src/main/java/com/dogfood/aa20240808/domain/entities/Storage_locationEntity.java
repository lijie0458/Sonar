package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import java.time.ZonedDateTime; 
import javax.validation.constraints.NotNull; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Storage_locationEntity {

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

    @Label("库位编码")
    public String location_code;

    @Label("库位名称")
    public String location_name;

    @Label("所属二级仓库Id")
    public Long warehouse_codetwo_id;

    @Label("描述")
    public String description;

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

    public String getLocation_code() {
        return location_code;
    } 

    public void setLocation_code(String location_code) {
        this.location_code = location_code; 
    } 

    public String getLocation_name() {
        return location_name;
    } 

    public void setLocation_name(String location_name) {
        this.location_name = location_name; 
    } 

    public Long getWarehouse_codetwo_id() {
        return warehouse_codetwo_id;
    } 

    public void setWarehouse_codetwo_id(Long warehouse_codetwo_id) {
        this.warehouse_codetwo_id = warehouse_codetwo_id; 
    } 

    public String getDescription() {
        return description;
    } 

    public void setDescription(String description) {
        this.description = description; 
    } 

}
