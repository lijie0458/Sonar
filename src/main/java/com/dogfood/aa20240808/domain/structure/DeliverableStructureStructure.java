package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class DeliverableStructureStructure {

    @Label("可发货数量")
    public BigDecimal deliverableQuantity;

    @Label("物料编码")
    public String name;

    @Label("本次数量")
    public BigDecimal thisQuantity;

    public BigDecimal getDeliverableQuantity() {
        return deliverableQuantity;
    } 

    public void setDeliverableQuantity(BigDecimal deliverableQuantity) {
        this.deliverableQuantity = deliverableQuantity; 
    } 

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name; 
    } 

    public BigDecimal getThisQuantity() {
        return thisQuantity;
    } 

    public void setThisQuantity(BigDecimal thisQuantity) {
        this.thisQuantity = thisQuantity; 
    } 

}
