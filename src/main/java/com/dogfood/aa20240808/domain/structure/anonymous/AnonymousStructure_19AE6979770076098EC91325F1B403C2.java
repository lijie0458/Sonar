package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.SalesOrdersEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_19AE6979770076098EC91325F1B403C2 {

    public SalesOrdersEntity salesOrders;
    public SalesOrdersEntity getSalesOrders() {
        return salesOrders;
    } 

    public void setSalesOrders(SalesOrdersEntity salesOrders) {
        this.salesOrders = salesOrders; 
    } 


}
