package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_F59E0BB3343234CE3AF6447EE8462582 {

    public String materialCode;
    public BigDecimal quantity;
    public BigDecimal total;
    public String getMaterialCode() {
        return materialCode;
    } 

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode; 
    } 

    public BigDecimal getQuantity() {
        return quantity;
    } 

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity; 
    } 

    public BigDecimal getTotal() {
        return total;
    } 

    public void setTotal(BigDecimal total) {
        this.total = total; 
    } 


}
