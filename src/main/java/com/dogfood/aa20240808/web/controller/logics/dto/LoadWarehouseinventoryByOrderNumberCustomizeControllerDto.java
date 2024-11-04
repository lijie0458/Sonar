package com.dogfood.aa20240808.web.controller.logics.dto; 

import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 

public class LoadWarehouseinventoryByOrderNumberCustomizeControllerDto {

    public DistinctionEnumEnum DistinctionEnum;
    public String OrderNumber;
    public DistinctionEnumEnum getDistinctionEnum() {
        return DistinctionEnum;
    } 

    public void setDistinctionEnum(DistinctionEnumEnum DistinctionEnum) {
        this.DistinctionEnum = DistinctionEnum; 
    } 

    public String getOrderNumber() {
        return OrderNumber;
    } 

    public void setOrderNumber(String OrderNumber) {
        this.OrderNumber = OrderNumber; 
    } 


}
