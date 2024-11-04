package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.CustomerManagementEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.SalesOrderDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.SalesOrdersEntity; 
import com.dogfood.aa20240808.domain.entities.DepartmentEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_89F444DCB36F3A425473660EC2B0814E {

    public SalesOrdersEntity salesOrders;
    public CustomerManagementEntity customerManagement;
    public LCAPUser lCAPUser;
    public DepartmentEntity department;
    public SalesOrderDetailsEntity salesOrderDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public SalesOrdersEntity getSalesOrders() {
        return salesOrders;
    } 

    public void setSalesOrders(SalesOrdersEntity salesOrders) {
        this.salesOrders = salesOrders; 
    } 

    public CustomerManagementEntity getCustomerManagement() {
        return customerManagement;
    } 

    public void setCustomerManagement(CustomerManagementEntity customerManagement) {
        this.customerManagement = customerManagement; 
    } 

    public LCAPUser getLCAPUser() {
        return lCAPUser;
    } 

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser; 
    } 

    public DepartmentEntity getDepartment() {
        return department;
    } 

    public void setDepartment(DepartmentEntity department) {
        this.department = department; 
    } 

    public SalesOrderDetailsEntity getSalesOrderDetails() {
        return salesOrderDetails;
    } 

    public void setSalesOrderDetails(SalesOrderDetailsEntity salesOrderDetails) {
        this.salesOrderDetails = salesOrderDetails; 
    } 

    public MaterialDetailsEntity getMaterialDetails() {
        return materialDetails;
    } 

    public void setMaterialDetails(MaterialDetailsEntity materialDetails) {
        this.materialDetails = materialDetails; 
    } 

    public MeasuringUnitEntity getMeasuringUnit() {
        return measuringUnit;
    } 

    public void setMeasuringUnit(MeasuringUnitEntity measuringUnit) {
        this.measuringUnit = measuringUnit; 
    } 


}
