package com.dogfood.aa20240808.web.controller.logics.dto; 

import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 

public class LoadProductionPageDetailsCustomizeControllerDto {

    public DistinctionEnumEnum DistinctionEnum;

    public Long id;

    public DistinctionEnumEnum getDistinctionEnum() {
        return DistinctionEnum;
    } 

    public void setDistinctionEnum(DistinctionEnumEnum DistinctionEnum) {
        this.DistinctionEnum = DistinctionEnum; 
    } 

    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id; 
    } 

}
