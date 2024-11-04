package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.OtherInStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.OtherInStorageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_4366D563460EB7795A4AEA7B1AAE0CAF {

    public OtherInStorageEntity otherInStorage;
    public OtherInStorageDetailsEntity otherInStorageDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public LCAPUser lCAPUser;
    public OtherInStorageEntity getOtherInStorage() {
        return otherInStorage;
    } 

    public void setOtherInStorage(OtherInStorageEntity otherInStorage) {
        this.otherInStorage = otherInStorage; 
    } 

    public OtherInStorageDetailsEntity getOtherInStorageDetails() {
        return otherInStorageDetails;
    } 

    public void setOtherInStorageDetails(OtherInStorageDetailsEntity otherInStorageDetails) {
        this.otherInStorageDetails = otherInStorageDetails; 
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

    public LCAPUser getLCAPUser() {
        return lCAPUser;
    } 

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser; 
    } 


}
