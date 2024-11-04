package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_742E48DFC5C3FE76DFBCFC5AEB7FA442 {

    public String groupNum;
    public Long sum;
    public String getGroupNum() {
        return groupNum;
    } 

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum; 
    } 

    public Long getSum() {
        return sum;
    } 

    public void setSum(Long sum) {
        this.sum = sum; 
    } 


}
