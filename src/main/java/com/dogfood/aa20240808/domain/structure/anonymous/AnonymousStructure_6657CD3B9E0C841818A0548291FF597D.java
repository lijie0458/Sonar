package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.BePutInStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_6657CD3B9E0C841818A0548291FF597D {

    public GoodsReturnedNoteEntity goodsReturnedNote;
    public GoodsReturnedNoteDetailsEntity goodsReturnedNoteDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public BePutInStorageDetailsEntity bePutInStorageDetails;
    public GoodsReturnedNoteEntity getGoodsReturnedNote() {
        return goodsReturnedNote;
    } 

    public void setGoodsReturnedNote(GoodsReturnedNoteEntity goodsReturnedNote) {
        this.goodsReturnedNote = goodsReturnedNote; 
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

    public BePutInStorageDetailsEntity getBePutInStorageDetails() {
        return bePutInStorageDetails;
    } 

    public void setBePutInStorageDetails(BePutInStorageDetailsEntity bePutInStorageDetails) {
        this.bePutInStorageDetails = bePutInStorageDetails; 
    } 


}
