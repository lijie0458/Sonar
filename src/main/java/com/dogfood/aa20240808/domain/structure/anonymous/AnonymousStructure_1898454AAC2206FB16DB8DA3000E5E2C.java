package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.BePutInStorageEntity; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.ReceivingDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.BePutInStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_1898454AAC2206FB16DB8DA3000E5E2C {

    public BePutInStorageEntity bePutInStorage;
    public BePutInStorageDetailsEntity bePutInStorageDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public ReceivingDetailsEntity receivingDetails;
    public BePutInStorageEntity getBePutInStorage() {
        return bePutInStorage;
    } 

    public void setBePutInStorage(BePutInStorageEntity bePutInStorage) {
        this.bePutInStorage = bePutInStorage; 
    } 

    public BePutInStorageDetailsEntity getBePutInStorageDetails() {
        return bePutInStorageDetails;
    } 

    public void setBePutInStorageDetails(BePutInStorageDetailsEntity bePutInStorageDetails) {
        this.bePutInStorageDetails = bePutInStorageDetails; 
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

    public ReceivingDetailsEntity getReceivingDetails() {
        return receivingDetails;
    } 

    public void setReceivingDetails(ReceivingDetailsEntity receivingDetails) {
        this.receivingDetails = receivingDetails; 
    } 


}
