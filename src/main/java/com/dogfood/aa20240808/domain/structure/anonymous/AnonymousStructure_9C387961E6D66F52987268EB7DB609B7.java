package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.SalesOrderDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.SalesOrdersEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_9C387961E6D66F52987268EB7DB609B7 {

    public SalesOrdersEntity salesOrders;
    public SalesOrderDetailsEntity salesOrderDetails;
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


}
