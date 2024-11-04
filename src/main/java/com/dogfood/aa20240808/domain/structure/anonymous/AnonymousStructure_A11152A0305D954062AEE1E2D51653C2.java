package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_A11152A0305D954062AEE1E2D51653C2 {

    public ProductionMaterialRequisitionDetailsEntity productionMaterialRequisitionDetails;
    public InventoryEntity inventory;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public ProductionMaterialRequisitionDetailsEntity getProductionMaterialRequisitionDetails() {
        return productionMaterialRequisitionDetails;
    } 

    public void setProductionMaterialRequisitionDetails(ProductionMaterialRequisitionDetailsEntity productionMaterialRequisitionDetails) {
        this.productionMaterialRequisitionDetails = productionMaterialRequisitionDetails; 
    } 

    public InventoryEntity getInventory() {
        return inventory;
    } 

    public void setInventory(InventoryEntity inventory) {
        this.inventory = inventory; 
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
