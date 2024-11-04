package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.enumeration.ApprovalStatusEnumEnum; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_8DA35266D6FA0C20B8C0F202157B3DD8 {

    public String documentNumber;
    public Long inspector;
    public String sourceDocumentNumber;
    public java.time.LocalDate requestDate;
    public String summary;
    public String attachment;
    public ApprovalStatusEnumEnum approvalStatus;
    public Long shippingClerk;
    public Long outWarehouse;
    public Long inWarehouse;
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
