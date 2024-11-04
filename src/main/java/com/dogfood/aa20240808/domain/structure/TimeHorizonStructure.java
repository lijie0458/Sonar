package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class TimeHorizonStructure {

    @Label("开始时间")
    public java.time.LocalDate startTime;
    @Label("结束时间")
    public java.time.LocalDate endTime;
    public java.time.LocalDate getStartTime() {
        return startTime;
    } 

    public void setStartTime(java.time.LocalDate startTime) {
        this.startTime = startTime; 
    } 

    public java.time.LocalDate getEndTime() {
        return endTime;
    } 

    public void setEndTime(java.time.LocalDate endTime) {
        this.endTime = endTime; 
    } 


}
