package com.dogfood.aa20240808.web.controller.logics.dto; 

import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 

public class LoadCountsaleOrderCustomizeControllerDto {

    public DistinctionEnumEnum DistinctionEnum;
    public DistinctionEnumEnum getDistinctionEnum() {
        return DistinctionEnum;
    } 

    public void setDistinctionEnum(DistinctionEnumEnum DistinctionEnum) {
        this.DistinctionEnum = DistinctionEnum; 
    } 


}
