package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ProductReturnStorageEntity; 
import com.dogfood.aa20240808.domain.entities.ProductReturnStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 
import com.dogfood.aa20240808.domain.entities.DepartmentEntity; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageEntity; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_3AA16578BD81DFBC3A3467B39A512413 {

    public ProductReturnStorageEntity productReturnStorage;
    public ProductInStorageEntity productInStorage;
    public LCAPUser lCAPUser;
    public DepartmentEntity department;
    public ProductReturnStorageDetailsEntity productReturnStorageDetails;
    public ProductInStorageDetailsEntity productInStorageDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public Warehouse_levelTwoEntity warehouse_levelTwo;
    public ProductReturnStorageEntity getProductReturnStorage() {
        return productReturnStorage;
    } 

    public void setProductReturnStorage(ProductReturnStorageEntity productReturnStorage) {
        this.productReturnStorage = productReturnStorage; 
    } 

    public ProductInStorageEntity getProductInStorage() {
        return productInStorage;
    } 

    public void setProductInStorage(ProductInStorageEntity productInStorage) {
        this.productInStorage = productInStorage; 
    } 

    public LCAPUser getLCAPUser() {
        return lCAPUser;
    } 

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser; 
    } 

    public DepartmentEntity getDepartment() {
        return department;
    } 

    public void setDepartment(DepartmentEntity department) {
        this.department = department; 
    } 

    public ProductReturnStorageDetailsEntity getProductReturnStorageDetails() {
        return productReturnStorageDetails;
    } 

    public void setProductReturnStorageDetails(ProductReturnStorageDetailsEntity productReturnStorageDetails) {
        this.productReturnStorageDetails = productReturnStorageDetails; 
    } 

    public ProductInStorageDetailsEntity getProductInStorageDetails() {
        return productInStorageDetails;
    } 

    public void setProductInStorageDetails(ProductInStorageDetailsEntity productInStorageDetails) {
        this.productInStorageDetails = productInStorageDetails; 
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

    public Warehouse_levelTwoEntity getWarehouse_levelTwo() {
        return warehouse_levelTwo;
    } 

    public void setWarehouse_levelTwo(Warehouse_levelTwoEntity warehouse_levelTwo) {
        this.warehouse_levelTwo = warehouse_levelTwo; 
    } 


}
