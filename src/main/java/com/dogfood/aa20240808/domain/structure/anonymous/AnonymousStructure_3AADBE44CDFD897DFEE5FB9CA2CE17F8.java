package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.DepartmentEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_3AADBE44CDFD897DFEE5FB9CA2CE17F8 {

    public ProductionMaterialRequisitionEntity productionMaterialRequisition;
    public ProductionMaterialRequisitionDetailsEntity productionMaterialRequisitionDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public DepartmentEntity department;
    public LCAPUser lCAPUser;
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

    public DepartmentEntity getDepartment() {
        return department;
    } 

    public void setDepartment(DepartmentEntity department) {
        this.department = department; 
    } 

    public LCAPUser getLCAPUser() {
        return lCAPUser;
    } 

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser; 
    } 


}
