package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_59171EEBD007C582328CDFD57C58FB34 {

    public ProductionMaterialRequisitionDetailsEntity productionMaterialRequisitionDetails;
    public MaterialDetailsEntity materialDetails;
    public ProductionMaterialRequisitionDetailsEntity getProductionMaterialRequisitionDetails() {
        return productionMaterialRequisitionDetails;
    } 

    public void setProductionMaterialRequisitionDetails(ProductionMaterialRequisitionDetailsEntity productionMaterialRequisitionDetails) {
        this.productionMaterialRequisitionDetails = productionMaterialRequisitionDetails; 
    } 

    public MaterialDetailsEntity getMaterialDetails() {
        return materialDetails;
    } 

    public void setMaterialDetails(MaterialDetailsEntity materialDetails) {
        this.materialDetails = materialDetails; 
    } 


}
