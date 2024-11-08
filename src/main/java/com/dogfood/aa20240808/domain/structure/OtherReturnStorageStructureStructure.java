package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.OtherReturnStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class OtherReturnStorageStructureStructure {

    @Label("其他入库详情数据结构")
    public OtherInStorageDetailsStrutureStructure otherInStorageDetailsStructure;

    @Label("其他入库退回详情")
    public OtherReturnStorageDetailsEntity otherReturnStorageDetails;

    public OtherInStorageDetailsStrutureStructure getOtherInStorageDetailsStructure() {
        return otherInStorageDetailsStructure;
    } 

    public void setOtherInStorageDetailsStructure(OtherInStorageDetailsStrutureStructure otherInStorageDetailsStructure) {
        this.otherInStorageDetailsStructure = otherInStorageDetailsStructure; 
    } 

    public OtherReturnStorageDetailsEntity getOtherReturnStorageDetails() {
        return otherReturnStorageDetails;
    } 

    public void setOtherReturnStorageDetails(OtherReturnStorageDetailsEntity otherReturnStorageDetails) {
        this.otherReturnStorageDetails = otherReturnStorageDetails; 
    } 

}
