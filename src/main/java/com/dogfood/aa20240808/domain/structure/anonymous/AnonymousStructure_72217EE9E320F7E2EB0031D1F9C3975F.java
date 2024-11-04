package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_72217EE9E320F7E2EB0031D1F9C3975F {

    public Long batchNumber;
    public BigDecimal returnQuanTity;
    public Long getBatchNumber() {
        return batchNumber;
    } 

    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber; 
    } 

    public BigDecimal getReturnQuanTity() {
        return returnQuanTity;
    } 

    public void setReturnQuanTity(BigDecimal returnQuanTity) {
        this.returnQuanTity = returnQuanTity; 
    } 


}
