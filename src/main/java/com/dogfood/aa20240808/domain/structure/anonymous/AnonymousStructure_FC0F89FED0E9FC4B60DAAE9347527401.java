package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_FC0F89FED0E9FC4B60DAAE9347527401 {

    public String groupCode;
    public Long sum;
    public String getGroupCode() {
        return groupCode;
    } 

    public void setGroupCode(String groupCode) {
        this.groupCode = groupCode; 
    } 

    public Long getSum() {
        return sum;
    } 

    public void setSum(Long sum) {
        this.sum = sum; 
    } 


}
