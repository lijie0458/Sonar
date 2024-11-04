package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.TransferSlipDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.TransferSlipEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_63985552DE586FCD03EB1711C5BB0D2B {

    public TransferSlipEntity transferSlip;
    public LCAPUser lCAPUser;
    public TransferSlipDetailsEntity transferSlipDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public Warehouse_levelTwoEntity warehouse_levelTwo;
    public TransferSlipEntity getTransferSlip() {
        return transferSlip;
    } 

    public void setTransferSlip(TransferSlipEntity transferSlip) {
        this.transferSlip = transferSlip; 
    } 

    public LCAPUser getLCAPUser() {
        return lCAPUser;
    } 

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser; 
    } 

    public TransferSlipDetailsEntity getTransferSlipDetails() {
        return transferSlipDetails;
    } 

    public void setTransferSlipDetails(TransferSlipDetailsEntity transferSlipDetails) {
        this.transferSlipDetails = transferSlipDetails; 
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
