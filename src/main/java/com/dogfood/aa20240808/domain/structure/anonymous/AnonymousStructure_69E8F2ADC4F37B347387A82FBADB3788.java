package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.SalesOrderDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_69E8F2ADC4F37B347387A82FBADB3788 {

    public SalesOrderDetailsEntity salesOrderDetails;
    public SalesOrderDetailsEntity getSalesOrderDetails() {
        return salesOrderDetails;
    } 

    public void setSalesOrderDetails(SalesOrderDetailsEntity salesOrderDetails) {
        this.salesOrderDetails = salesOrderDetails; 
    } 


}
