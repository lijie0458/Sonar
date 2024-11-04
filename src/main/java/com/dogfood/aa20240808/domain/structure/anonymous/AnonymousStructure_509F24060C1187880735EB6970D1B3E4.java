package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_509F24060C1187880735EB6970D1B3E4 {

    public Long bePutInStorageDetailsId;
    public String materialNumber;
    public BigDecimal total;
    public Long getBePutInStorageDetailsId() {
        return bePutInStorageDetailsId;
    } 

    public void setBePutInStorageDetailsId(Long bePutInStorageDetailsId) {
        this.bePutInStorageDetailsId = bePutInStorageDetailsId; 
    } 

    public String getMaterialNumber() {
        return materialNumber;
    } 

    public void setMaterialNumber(String materialNumber) {
        this.materialNumber = materialNumber; 
    } 

    public BigDecimal getTotal() {
        return total;
    } 

    public void setTotal(BigDecimal total) {
        this.total = total; 
    } 


}
