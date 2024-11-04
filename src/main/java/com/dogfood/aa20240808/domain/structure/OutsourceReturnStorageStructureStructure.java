package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class OutsourceReturnStorageStructureStructure {

    @Label("委外加工入库详情数据结构")
    public OutsourceInStorageDetailsStrutureStructure outsourceInStorageDetailsStructure;
    @Label("委外加工入库退回详情信息")
    public OutsourceReturnStorageDetailsEntity outsourceReturnStorageDetails;
    public OutsourceInStorageDetailsStrutureStructure getOutsourceInStorageDetailsStructure() {
        return outsourceInStorageDetailsStructure;
    } 

    public void setOutsourceInStorageDetailsStructure(OutsourceInStorageDetailsStrutureStructure outsourceInStorageDetailsStructure) {
        this.outsourceInStorageDetailsStructure = outsourceInStorageDetailsStructure; 
    } 

    public OutsourceReturnStorageDetailsEntity getOutsourceReturnStorageDetails() {
        return outsourceReturnStorageDetails;
    } 

    public void setOutsourceReturnStorageDetails(OutsourceReturnStorageDetailsEntity outsourceReturnStorageDetails) {
        this.outsourceReturnStorageDetails = outsourceReturnStorageDetails; 
    } 


}
