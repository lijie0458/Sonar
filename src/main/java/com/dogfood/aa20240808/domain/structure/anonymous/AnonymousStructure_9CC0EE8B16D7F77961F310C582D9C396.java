package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.enumeration.ApprovalStatusEnumEnum; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_9CC0EE8B16D7F77961F310C582D9C396 {

    public String documentNumber;
    public Long department;
    public Long employee;
    public java.time.LocalDate requestDate;
    public String summary;
    public String attachment;
    public ApprovalStatusEnumEnum approvalStatus;
    public DistinctionEnumEnum issueReturnDistinction;
    public Long guardian;
    public String createdBy;
    public String sourceDocumentNumber;
    public String getDocumentNumber() {
        return documentNumber;
    } 

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber; 
    } 

    public Long getDepartment() {
        return department;
    } 

    public void setDepartment(Long department) {
        this.department = department; 
    } 

    public Long getEmployee() {
        return employee;
    } 

    public void setEmployee(Long employee) {
        this.employee = employee; 
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

    public DistinctionEnumEnum getIssueReturnDistinction() {
        return issueReturnDistinction;
    } 

    public void setIssueReturnDistinction(DistinctionEnumEnum issueReturnDistinction) {
        this.issueReturnDistinction = issueReturnDistinction; 
    } 

    public Long getGuardian() {
        return guardian;
    } 

    public void setGuardian(Long guardian) {
        this.guardian = guardian; 
    } 

    public String getCreatedBy() {
        return createdBy;
    } 

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; 
    } 

    public String getSourceDocumentNumber() {
        return sourceDocumentNumber;
    } 

    public void setSourceDocumentNumber(String sourceDocumentNumber) {
        this.sourceDocumentNumber = sourceDocumentNumber; 
    } 


}
