package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import java.time.LocalDate; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class TimeHorizonStructure {

    @Label("开始时间")
    public LocalDate startTime;

    @Label("结束时间")
    public LocalDate endTime;

    public LocalDate getStartTime() {
        return startTime;
    } 

    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime; 
    } 

    public LocalDate getEndTime() {
        return endTime;
    } 

    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime; 
    } 

}
