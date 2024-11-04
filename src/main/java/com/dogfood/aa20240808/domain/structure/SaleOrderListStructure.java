package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.CustomerManagementEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.SalesOrderDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.SalesOrdersEntity; 
import com.dogfood.aa20240808.domain.entities.DepartmentEntity; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class SaleOrderListStructure {

    public SalesOrdersEntity salesOrders;
    public CustomerManagementEntity customerManagement;
    public LCAPUser user;
    public DepartmentEntity department;
    public SalesOrderDetailsEntity salesOrderDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    @Label("已发货数量")
    public BigDecimal unshippedQuantity;
    @Label("已出库数量")
    public BigDecimal quantityShipped;
    public InventoryEntity property1;
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

    public LCAPUser getUser() {
        return user;
    } 

    public void setUser(LCAPUser user) {
        this.user = user; 
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

    public BigDecimal getUnshippedQuantity() {
        return unshippedQuantity;
    } 

    public void setUnshippedQuantity(BigDecimal unshippedQuantity) {
        this.unshippedQuantity = unshippedQuantity; 
    } 

    public BigDecimal getQuantityShipped() {
        return quantityShipped;
    } 

    public void setQuantityShipped(BigDecimal quantityShipped) {
        this.quantityShipped = quantityShipped; 
    } 

    public InventoryEntity getProperty1() {
        return property1;
    } 

    public void setProperty1(InventoryEntity property1) {
        this.property1 = property1; 
    } 


}
