package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.BePutInStorageEntity; 
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.SupplierDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_1C5D8225BCA337DCF1D5F0A8C3C0468E {

    public GoodsReturnedNoteEntity goodsReturnedNote;
    public BePutInStorageEntity bePutInStorage;
    public SupplierDetailsEntity supplierDetails;
    public Warehouse_levelTwoEntity warehouse_levelTwo;
    public LCAPUser lCAPUser;
    public GoodsReturnedNoteDetailsEntity goodsReturnedNoteDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public GoodsReturnedNoteEntity getGoodsReturnedNote() {
        return goodsReturnedNote;
    } 

    public void setGoodsReturnedNote(GoodsReturnedNoteEntity goodsReturnedNote) {
        this.goodsReturnedNote = goodsReturnedNote; 
    } 

    public BePutInStorageEntity getBePutInStorage() {
        return bePutInStorage;
    } 

    public void setBePutInStorage(BePutInStorageEntity bePutInStorage) {
        this.bePutInStorage = bePutInStorage; 
    } 

    public SupplierDetailsEntity getSupplierDetails() {
        return supplierDetails;
    } 

    public void setSupplierDetails(SupplierDetailsEntity supplierDetails) {
        this.supplierDetails = supplierDetails; 
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

    public GoodsReturnedNoteDetailsEntity getGoodsReturnedNoteDetails() {
        return goodsReturnedNoteDetails;
    } 

    public void setGoodsReturnedNoteDetails(GoodsReturnedNoteDetailsEntity goodsReturnedNoteDetails) {
        this.goodsReturnedNoteDetails = goodsReturnedNoteDetails; 
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
