package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.SupplierDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageEntity; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_919167615A5AED1D8A6E68143881444A {

    public OutsourceInStorageEntity outsourceInStorage;
    public OutsourceInStorageDetailsEntity outsourceInStorageDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public Warehouse_levelTwoEntity warehouse_levelTwo;
    public LCAPUser lCAPUser;
    public SupplierDetailsEntity supplierDetails;
    public OutsourceInStorageEntity getOutsourceInStorage() {
        return outsourceInStorage;
    } 

    public void setOutsourceInStorage(OutsourceInStorageEntity outsourceInStorage) {
        this.outsourceInStorage = outsourceInStorage; 
    } 

    public OutsourceInStorageDetailsEntity getOutsourceInStorageDetails() {
        return outsourceInStorageDetails;
    } 

    public void setOutsourceInStorageDetails(OutsourceInStorageDetailsEntity outsourceInStorageDetails) {
        this.outsourceInStorageDetails = outsourceInStorageDetails; 
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

    public LCAPUser getLCAPUser() {
        return lCAPUser;
    } 

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser; 
    } 

    public SupplierDetailsEntity getSupplierDetails() {
        return supplierDetails;
    } 

    public void setSupplierDetails(SupplierDetailsEntity supplierDetails) {
        this.supplierDetails = supplierDetails; 
    } 


}
