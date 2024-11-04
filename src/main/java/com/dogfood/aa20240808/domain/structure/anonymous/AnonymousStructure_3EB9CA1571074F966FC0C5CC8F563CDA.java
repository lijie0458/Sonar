package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_3EB9CA1571074F966FC0C5CC8F563CDA {

    public ProductionMaterialRequisitionEntity productionMaterialRequisition;
    public ProductionMaterialRequisitionDetailsEntity productionMaterialRequisitionDetails;
    public ProductionMaterialRequisitionEntity getProductionMaterialRequisition() {
        return productionMaterialRequisition;
    } 

    public void setProductionMaterialRequisition(ProductionMaterialRequisitionEntity productionMaterialRequisition) {
        this.productionMaterialRequisition = productionMaterialRequisition; 
    } 

    public ProductionMaterialRequisitionDetailsEntity getProductionMaterialRequisitionDetails() {
        return productionMaterialRequisitionDetails;
    } 

    public void setProductionMaterialRequisitionDetails(ProductionMaterialRequisitionDetailsEntity productionMaterialRequisitionDetails) {
        this.productionMaterialRequisitionDetails = productionMaterialRequisitionDetails; 
    } 


}
