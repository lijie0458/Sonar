package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_93C34739441EB8F4AE7F54EB8CA28354 {

    public String material_code;
    public Long count;
    public String getMaterial_code() {
        return material_code;
    } 

    public void setMaterial_code(String material_code) {
        this.material_code = material_code; 
    } 

    public Long getCount() {
        return count;
    } 

    public void setCount(Long count) {
        this.count = count; 
    } 


}
