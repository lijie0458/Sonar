package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_8D252D77749A0BEDEA2B044CEC48E3E6 {

    public ProductionMaterialRequisitionEntity productionMaterialRequisition;
    public ProductionMaterialRequisitionEntity getProductionMaterialRequisition() {
        return productionMaterialRequisition;
    } 

    public void setProductionMaterialRequisition(ProductionMaterialRequisitionEntity productionMaterialRequisition) {
        this.productionMaterialRequisition = productionMaterialRequisition; 
    } 


}
