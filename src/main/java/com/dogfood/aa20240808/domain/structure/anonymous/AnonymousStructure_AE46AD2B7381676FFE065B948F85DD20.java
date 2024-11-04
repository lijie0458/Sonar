package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.OtherReturnStorageDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.OtherInStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_AE46AD2B7381676FFE065B948F85DD20 {

    public OtherReturnStorageDetailsEntity otherReturnStorageDetails;
    public OtherInStorageDetailsEntity otherInStorageDetails;
    public OtherReturnStorageDetailsEntity getOtherReturnStorageDetails() {
        return otherReturnStorageDetails;
    } 

    public void setOtherReturnStorageDetails(OtherReturnStorageDetailsEntity otherReturnStorageDetails) {
        this.otherReturnStorageDetails = otherReturnStorageDetails; 
    } 

    public OtherInStorageDetailsEntity getOtherInStorageDetails() {
        return otherInStorageDetails;
    } 

    public void setOtherInStorageDetails(OtherInStorageDetailsEntity otherInStorageDetails) {
        this.otherInStorageDetails = otherInStorageDetails; 
    } 


}
