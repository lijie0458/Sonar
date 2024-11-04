package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_6A9D82433468B40EA67F827BB6DB2E71 {

    public OutsourceReturnStorageDetailsEntity outsourceReturnStorageDetails;
    public OutsourceInStorageDetailsEntity outsourceInStorageDetails;
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


}
