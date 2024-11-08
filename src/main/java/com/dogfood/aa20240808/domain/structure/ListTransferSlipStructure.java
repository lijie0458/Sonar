package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.TransferSlipDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.TransferSlipEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ListTransferSlipStructure {

    public TransferSlipEntity transferSlip;

    public LCAPUser user;

    public TransferSlipDetailsEntity transferSlipDetails;

    public MaterialDetailsEntity materialDetails;

    public MeasuringUnitEntity measuringUnit;

    @Label("调出仓库")
    public Warehouse_levelTwoEntity oUTwarehouse_levelTwo;

    @Label("调入仓库")
    public String inwarehouse_levelTwo;

    public TransferSlipEntity getTransferSlip() {
        return transferSlip;
    } 

    public void setTransferSlip(TransferSlipEntity transferSlip) {
        this.transferSlip = transferSlip; 
    } 

    public LCAPUser getUser() {
        return user;
    } 

    public void setUser(LCAPUser user) {
        this.user = user; 
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

    public Warehouse_levelTwoEntity getOUTwarehouse_levelTwo() {
        return oUTwarehouse_levelTwo;
    } 

    public void setOUTwarehouse_levelTwo(Warehouse_levelTwoEntity oUTwarehouse_levelTwo) {
        this.oUTwarehouse_levelTwo = oUTwarehouse_levelTwo; 
    } 

    public String getInwarehouse_levelTwo() {
        return inwarehouse_levelTwo;
    } 

    public void setInwarehouse_levelTwo(String inwarehouse_levelTwo) {
        this.inwarehouse_levelTwo = inwarehouse_levelTwo; 
    } 

}
