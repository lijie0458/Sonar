package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_3D26FC4B14C7240A937FF824EB2C8626 {

    public Long salesOrderDetailsId;
    public BigDecimal sum;
    public Long getSalesOrderDetailsId() {
        return salesOrderDetailsId;
    } 

    public void setSalesOrderDetailsId(Long salesOrderDetailsId) {
        this.salesOrderDetailsId = salesOrderDetailsId; 
    } 

    public BigDecimal getSum() {
        return sum;
    } 

    public void setSum(BigDecimal sum) {
        this.sum = sum; 
    } 


}
