package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.SupplierDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageEntity; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_4DBC1F436BCB644A600B40AB5CBA5EDA {

    public OutsourceReturnStorageEntity outsourceReturnStorage;
    public OutsourceInStorageEntity outsourceInStorage;
    public SupplierDetailsEntity supplierDetails;
    public LCAPUser lCAPUser;
    public OutsourceReturnStorageDetailsEntity outsourceReturnStorageDetails;
    public OutsourceInStorageDetailsEntity outsourceInStorageDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public Warehouse_levelTwoEntity warehouse_levelTwo;
    public Storage_locationEntity storage_location;
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

    public SupplierDetailsEntity getSupplierDetails() {
        return supplierDetails;
    } 

    public void setSupplierDetails(SupplierDetailsEntity supplierDetails) {
        this.supplierDetails = supplierDetails; 
    } 

    public LCAPUser getLCAPUser() {
        return lCAPUser;
    } 

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser; 
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

    public Storage_locationEntity getStorage_location() {
        return storage_location;
    } 

    public void setStorage_location(Storage_locationEntity storage_location) {
        this.storage_location = storage_location; 
    } 


}
