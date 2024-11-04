package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.SalesOrderDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.SalesOrdersEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_873CF28DE5093DD1906C2E345F84CE28 {

    public SalesOrdersEntity salesOrders;
    public SalesOrderDetailsEntity salesOrderDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public SalesOrdersEntity getSalesOrders() {
        return salesOrders;
    } 

    public void setSalesOrders(SalesOrdersEntity salesOrders) {
        this.salesOrders = salesOrders; 
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
