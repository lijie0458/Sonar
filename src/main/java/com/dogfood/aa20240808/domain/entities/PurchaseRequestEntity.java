package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import java.time.LocalDate; 
import com.dogfood.aa20240808.domain.enumeration.ApprovalStatusEnumEnum; 
import javax.validation.constraints.NotNull; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class PurchaseRequestEntity {

    @Label("标题")
    public String title;

    @Label("单号")
    @NotNull
    public String requestNumber;

    @Label("部门")
    public Long department;

    @Label("申请原因")
    public String requestReason;

    @Label("附件")
    public String annex;

    @Label("申请人")
    public String createdBy;

    @Label("审批状态")
    public ApprovalStatusEnumEnum approvalStatus;

    @Label("申请日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public LocalDate applicationDate;

    public String getTitle() {
        return title;
    } 

    public void setTitle(String title) {
        this.title = title; 
    } 

    public String getRequestNumber() {
        return requestNumber;
    } 

    public void setRequestNumber(String requestNumber) {
        this.requestNumber = requestNumber; 
    } 

    public Long getDepartment() {
        return department;
    } 

    public void setDepartment(Long department) {
        this.department = department; 
    } 

    public String getRequestReason() {
        return requestReason;
    } 

    public void setRequestReason(String requestReason) {
        this.requestReason = requestReason; 
    } 

    public String getAnnex() {
        return annex;
    } 

    public void setAnnex(String annex) {
        this.annex = annex; 
    } 

    public String getCreatedBy() {
        return createdBy;
    } 

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; 
    } 

    public ApprovalStatusEnumEnum getApprovalStatus() {
        return approvalStatus;
    } 

    public void setApprovalStatus(ApprovalStatusEnumEnum approvalStatus) {
        this.approvalStatus = approvalStatus; 
    } 

    public LocalDate getApplicationDate() {
        return applicationDate;
    } 

    public void setApplicationDate(LocalDate applicationDate) {
        this.applicationDate = applicationDate; 
    } 

}
