package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import com.dogfood.aa20240808.domain.enumeration.ApprovalStatusEnumEnum; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class TransferSlipEntity {

    @Label("单据编号")
    @javax.validation.constraints.NotNull
    public String documentNumber;
    @Label("验收员")
    public Long inspector;
    @Label("源单单号")
    public String sourceDocumentNumber;
    @Label("申请日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public java.time.LocalDate requestDate;
    @Label("摘要")
    public String summary;
    @Label("附件")
    public String attachment;
    @Label("审批状态")
    public ApprovalStatusEnumEnum approvalStatus;
    @Label("发货员")
    public Long shippingClerk;
    @Label("调出仓库")
    public Long outWarehouse;
    @Label("调入仓库")
    public Long inWarehouse;
    @Label("创建者")
    public String createdBy;
    public String getDocumentNumber() {
        return documentNumber;
    } 

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber; 
    } 

    public Long getInspector() {
        return inspector;
    } 

    public void setInspector(Long inspector) {
        this.inspector = inspector; 
    } 

    public String getSourceDocumentNumber() {
        return sourceDocumentNumber;
    } 

    public void setSourceDocumentNumber(String sourceDocumentNumber) {
        this.sourceDocumentNumber = sourceDocumentNumber; 
    } 

    public java.time.LocalDate getRequestDate() {
        return requestDate;
    } 

    public void setRequestDate(java.time.LocalDate requestDate) {
        this.requestDate = requestDate; 
    } 

    public String getSummary() {
        return summary;
    } 

    public void setSummary(String summary) {
        this.summary = summary; 
    } 

    public String getAttachment() {
        return attachment;
    } 

    public void setAttachment(String attachment) {
        this.attachment = attachment; 
    } 

    public ApprovalStatusEnumEnum getApprovalStatus() {
        return approvalStatus;
    } 

    public void setApprovalStatus(ApprovalStatusEnumEnum approvalStatus) {
        this.approvalStatus = approvalStatus; 
    } 

    public Long getShippingClerk() {
        return shippingClerk;
    } 

    public void setShippingClerk(Long shippingClerk) {
        this.shippingClerk = shippingClerk; 
    } 

    public Long getOutWarehouse() {
        return outWarehouse;
    } 

    public void setOutWarehouse(Long outWarehouse) {
        this.outWarehouse = outWarehouse; 
    } 

    public Long getInWarehouse() {
        return inWarehouse;
    } 

    public void setInWarehouse(Long inWarehouse) {
        this.inWarehouse = inWarehouse; 
    } 

    public String getCreatedBy() {
        return createdBy;
    } 

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; 
    } 


}
