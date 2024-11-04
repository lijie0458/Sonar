package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_2AC74E45ED5FB770049D4B45F0737151 {

    public String months;
    public BigDecimal sumPrice;
    public String getMonths() {
        return months;
    } 

    public void setMonths(String months) {
        this.months = months; 
    } 

    public BigDecimal getSumPrice() {
        return sumPrice;
    } 

    public void setSumPrice(BigDecimal sumPrice) {
        this.sumPrice = sumPrice; 
    } 


}
