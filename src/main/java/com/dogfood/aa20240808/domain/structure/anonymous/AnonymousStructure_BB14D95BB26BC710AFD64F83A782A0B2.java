package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.PurchaseDetailsEntity; 
import com.dogfood.aa20240808.domain.enumeration.ApprovalStatusEnumEnum; 
import com.dogfood.aa20240808.domain.enumeration.ExecutionStatusEnum; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_BB14D95BB26BC710AFD64F83A782A0B2 {

    public String purchaser;
    public String orderNumber;
    public Long supplier;
    public java.time.LocalDate orderDate;
    public java.time.LocalDate requiredDate;
    public ApprovalStatusEnumEnum approvalStatus;
    public ExecutionStatusEnum executionStatus;
    public String description;
    public String remarks;
    public List<PurchaseDetailsEntity> listPuchaseDetails = new ArrayList<>();
    public Boolean manuAuto;
    public String createdBy;
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

    public java.time.LocalDate getOrderDate() {
        return orderDate;
    } 

    public void setOrderDate(java.time.LocalDate orderDate) {
        this.orderDate = orderDate; 
    } 

    public java.time.LocalDate getRequiredDate() {
        return requiredDate;
    } 

    public void setRequiredDate(java.time.LocalDate requiredDate) {
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
