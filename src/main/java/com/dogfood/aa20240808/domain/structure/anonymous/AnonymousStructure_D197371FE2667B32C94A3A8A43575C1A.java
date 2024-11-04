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
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_D197371FE2667B32C94A3A8A43575C1A {

    public OutsourceReturnStorageEntity outsourceReturnStorage;
    public OutsourceInStorageEntity outsourceInStorage;
    public LCAPUser lCAPUser;
    public SupplierDetailsEntity supplierDetails;
    public OutsourceReturnStorageDetailsEntity outsourceReturnStorageDetails;
    public OutsourceInStorageDetailsEntity outsourceInStorageDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public Warehouse_levelTwoEntity warehouse_levelTwo;
    public OutsourceReturnStorageEntity getOutsourceReturnStorage() {
        return outsourceReturnStorage;
    } 

    public void setOutsourceReturnStorage(OutsourceReturnStorageEntity outsourceReturnStorage) {
        this.outsourceReturnStorage = outsourceReturnStorage; 
    } 

    public OutsourceInStorageEntity getOutsourceInStorage() {
        return outsourceInStorage;
    } 

    public void setOutsourceInStorage(OutsourceInStorageEntity outsourceInStorage) {
        this.outsourceInStorage = outsourceInStorage; 
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

    public OutsourceReturnStorageDetailsEntity getOutsourceReturnStorageDetails() {
        return outsourceReturnStorageDetails;
    } 

    public void setOutsourceReturnStorageDetails(OutsourceReturnStorageDetailsEntity outsourceReturnStorageDetails) {
        this.outsourceReturnStorageDetails = outsourceReturnStorageDetails; 
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


}
