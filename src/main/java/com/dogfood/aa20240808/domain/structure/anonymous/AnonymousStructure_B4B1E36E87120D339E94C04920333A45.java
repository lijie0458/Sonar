package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_B4B1E36E87120D339E94C04920333A45 {

    public String material_name;
    public String warehouse_name;
    public Long sum;
    public String getMaterial_name() {
        return material_name;
    } 

    public void setMaterial_name(String material_name) {
        this.material_name = material_name; 
    } 

    public String getWarehouse_name() {
        return warehouse_name;
    } 

    public void setWarehouse_name(String warehouse_name) {
        this.warehouse_name = warehouse_name; 
    } 

    public Long getSum() {
        return sum;
    } 

    public void setSum(Long sum) {
        this.sum = sum; 
    } 


}
