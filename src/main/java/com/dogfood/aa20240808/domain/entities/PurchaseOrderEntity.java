package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import java.time.LocalDate; 
import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.ApprovalStatusEnumEnum; 
import com.dogfood.aa20240808.domain.enumeration.ExecutionStatusEnum; 
import javax.validation.constraints.NotNull; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class PurchaseOrderEntity {

    @Label("采购员")
    public String purchaser;

    @Label("订单号")
    @NotNull
    public String orderNumber;

    @Label("供应商")
    public Long supplier;

    @Label("订单日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public LocalDate orderDate;

    @Label("需到货日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public LocalDate requiredDate;

    @Label("审批状态")
    public ApprovalStatusEnumEnum approvalStatus;

    @Label("执行状态")
    public ExecutionStatusEnum executionStatus;

    @Label("说明")
    public String description;

    @Label("附件")
    public String remarks;

    @Label("订单下包含的申请单详情")
    public List<PurchaseDetailsEntity> listPuchaseDetails = new ArrayList<>();

    @Label("下推还是手动新增的订单")
    public Boolean manuAuto;

    @Label("创建者")
    public String createdBy;

    @Label("采购申请明细订单号")
    public List<Long> purchaseDetailsIdList = new ArrayList<>();

    public String getPurchaser() {
        return purchaser;
    } 

    public void setPurchaser(String purchaser) {
        this.purchaser = purchaser; 
    } 

    public String getOrderNumber() {
        return orderNumber;
    } 

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber; 
    } 

    public Long getSupplier() {
        return supplier;
    } 

    public void setSupplier(Long supplier) {
        this.supplier = supplier; 
    } 

    public LocalDate getOrderDate() {
        return orderDate;
    } 

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate; 
    } 

    public LocalDate getRequiredDate() {
        return requiredDate;
    } 

    public void setRequiredDate(LocalDate requiredDate) {
        this.requiredDate = requiredDate; 
    } 

    public ApprovalStatusEnumEnum getApprovalStatus() {
        return approvalStatus;
    } 

    public void setApprovalStatus(ApprovalStatusEnumEnum approvalStatus) {
        this.approvalStatus = approvalStatus; 
    } 

    public ExecutionStatusEnum getExecutionStatus() {
        return executionStatus;
    } 

    public void setExecutionStatus(ExecutionStatusEnum executionStatus) {
        this.executionStatus = executionStatus; 
    } 

    public String getDescription() {
        return description;
    } 

    public void setDescription(String description) {
        this.description = description; 
    } 

    public String getRemarks() {
        return remarks;
    } 

    public void setRemarks(String remarks) {
        this.remarks = remarks; 
    } 

    public List<PurchaseDetailsEntity> getListPuchaseDetails() {
        return listPuchaseDetails;
    } 

    public void setListPuchaseDetails(List<PurchaseDetailsEntity> listPuchaseDetails) {
        this.listPuchaseDetails = listPuchaseDetails; 
    } 

    public Boolean getManuAuto() {
        return manuAuto;
    } 

    public void setManuAuto(Boolean manuAuto) {
        this.manuAuto = manuAuto; 
    } 

    public String getCreatedBy() {
        return createdBy;
    } 

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; 
    } 

    public List<Long> getPurchaseDetailsIdList() {
        return purchaseDetailsIdList;
    } 

    public void setPurchaseDetailsIdList(List<Long> purchaseDetailsIdList) {
        this.purchaseDetailsIdList = purchaseDetailsIdList; 
    } 

}
