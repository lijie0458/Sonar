package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.config.DateTimeFormatConfiguration; 
import com.dogfood.aa20240808.domain.enumeration.ApprovalStatusEnumEnum; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import com.fasterxml.jackson.annotation.JsonFormat; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class SalesOrdersEntity {

    @Label("销售单号")
    @javax.validation.constraints.NotNull
    public String orderNumber;
    @Label("购货单位	")
    public Long customer;
    @Label("业务员")
    public Long salesperson;
    @Label("部门")
    public Long department;
    @Label("申请日期")
    @JsonFormat(pattern = DateTimeFormatConfiguration.LOCAL_DATE_FORMAT)
    public java.time.LocalDate requestDate;
    @Label("摘要	")
    public String summary;
    @Label("附件	")
    public String attachment;
    @Label("审批状态")
    public ApprovalStatusEnumEnum approvalStatus;
    @Label("发货通知与订单区别")
    public DistinctionEnumEnum distinction;
    @Label("发货仓库")
    public Long warehouse;
    @Label("判断是下推还是手动新增的订单")
    public Boolean manuAuto;
    @Label("关联源单单号")
    public String sourceNumber;
    @Label("退货单业务员")
    public String salesman;
    @Label("创建者")
    public String createdBy;
    public String getOrderNumber() {
        return orderNumber;
    } 

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber; 
    } 

    public Long getCustomer() {
        return customer;
    } 

    public void setCustomer(Long customer) {
        this.customer = customer; 
    } 

    public Long getSalesperson() {
        return salesperson;
    } 

    public void setSalesperson(Long salesperson) {
        this.salesperson = salesperson; 
    } 

    public Long getDepartment() {
        return department;
    } 

    public void setDepartment(Long department) {
        this.department = department; 
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

    public DistinctionEnumEnum getDistinction() {
        return distinction;
    } 

    public void setDistinction(DistinctionEnumEnum distinction) {
        this.distinction = distinction; 
    } 

    public Long getWarehouse() {
        return warehouse;
    } 

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse; 
    } 

    public Boolean getManuAuto() {
        return manuAuto;
    } 

    public void setManuAuto(Boolean manuAuto) {
        this.manuAuto = manuAuto; 
    } 

    public String getSourceNumber() {
        return sourceNumber;
    } 

    public void setSourceNumber(String sourceNumber) {
        this.sourceNumber = sourceNumber; 
    } 

    public String getSalesman() {
        return salesman;
    } 

    public void setSalesman(String salesman) {
        this.salesman = salesman; 
    } 

    public String getCreatedBy() {
        return createdBy;
    } 

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy; 
    } 


}
