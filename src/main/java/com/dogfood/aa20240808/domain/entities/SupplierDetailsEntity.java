package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.structure.Contact_informationStructure; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import java.time.ZonedDateTime; 
import java.util.List; 
import javax.validation.constraints.NotNull; 
import com.fasterxml.jackson.annotation.JsonFormat; 
import com.dogfood.aa20240808.domain.structure.BankStructure; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class SupplierDetailsEntity {

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

    @Label("供应商编码")
    public String supplier_code;

    @Label("供应商名称")
    public String supplier_name;

    @Label("统一社会信用代码")
    public String credit_code;

    @Label("供应商分类")
    public String supplier_category;

    @Label("地址")
    public String address;

    @Label("详细地址")
    public String detailed_address;

    @Label("备注")
    public String remark;

    @Label("联系人信息")
    public List<Contact_informationStructure> contact_information = new ArrayList<>();

    @Label("开户银行")
    public List<BankStructure> bank = new ArrayList<>();

    @Label("关联分类")
    public Long supplier;

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

    public String getSupplier_code() {
        return supplier_code;
    } 

    public void setSupplier_code(String supplier_code) {
        this.supplier_code = supplier_code; 
    } 

    public String getSupplier_name() {
        return supplier_name;
    } 

    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name; 
    } 

    public String getCredit_code() {
        return credit_code;
    } 

    public void setCredit_code(String credit_code) {
        this.credit_code = credit_code; 
    } 

    public String getSupplier_category() {
        return supplier_category;
    } 

    public void setSupplier_category(String supplier_category) {
        this.supplier_category = supplier_category; 
    } 

    public String getAddress() {
        return address;
    } 

    public void setAddress(String address) {
        this.address = address; 
    } 

    public String getDetailed_address() {
        return detailed_address;
    } 

    public void setDetailed_address(String detailed_address) {
        this.detailed_address = detailed_address; 
    } 

    public String getRemark() {
        return remark;
    } 

    public void setRemark(String remark) {
        this.remark = remark; 
    } 

    public List<Contact_informationStructure> getContact_information() {
        return contact_information;
    } 

    public void setContact_information(List<Contact_informationStructure> contact_information) {
        this.contact_information = contact_information; 
    } 

    public List<BankStructure> getBank() {
        return bank;
    } 

    public void setBank(List<BankStructure> bank) {
        this.bank = bank; 
    } 

    public Long getSupplier() {
        return supplier;
    } 

    public void setSupplier(Long supplier) {
        this.supplier = supplier; 
    } 

}
