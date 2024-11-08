package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.WarehouseinventoryStructure; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 

public class LoadWarehouseInventoryCustomizeControllerDto {

    public DistinctionEnumEnum DistinctionEnum;

    public List<WarehouseinventoryStructure> Warehouseinventory;

    public DistinctionEnumEnum getDistinctionEnum() {
        return DistinctionEnum;
    } 

    public void setDistinctionEnum(DistinctionEnumEnum DistinctionEnum) {
        this.DistinctionEnum = DistinctionEnum; 
    } 

    public List<WarehouseinventoryStructure> getWarehouseinventory() {
        return Warehouseinventory;
    } 

    public void setWarehouseinventory(List<WarehouseinventoryStructure> Warehouseinventory) {
        this.Warehouseinventory = Warehouseinventory; 
    } 

}
