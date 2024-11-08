package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import java.time.LocalDate; 
import com.dogfood.aa20240808.domain.enumeration.ApprovalStatusEnumEnum; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import javax.validation.constraints.NotNull; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ProductionMaterialRequisitionEntity {

    @Label("单据编号")
    @NotNull
    public String documentNumber;

    @Label("领料部门")
    public Long department;

    @Label("领料员")
    public Long employee;

    @Label("申请日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public LocalDate requestDate;

    @Label("摘要")
    public String summary;

    @Label("附件")
    public String attachment;

    @Label("审批状态")
    public ApprovalStatusEnumEnum approvalStatus;

    @Label("区别字段（领料/退料）")
    public DistinctionEnumEnum issueReturnDistinction;

    @Label("保管员")
    public Long guardian;

    @Label("创建者")
    public String createdBy;

    @Label("领料单号")
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

    public LocalDate getRequestDate() {
        return requestDate;
    } 

    public void setRequestDate(LocalDate requestDate) {
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
