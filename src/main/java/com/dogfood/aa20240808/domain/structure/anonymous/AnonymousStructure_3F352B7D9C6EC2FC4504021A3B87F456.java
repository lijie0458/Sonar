package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ScheduleEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_3F352B7D9C6EC2FC4504021A3B87F456 {

    public ScheduleEntity schedule;
    public ScheduleEntity getSchedule() {
        return schedule;
    } 

    public void setSchedule(ScheduleEntity schedule) {
        this.schedule = schedule; 
    } 


}
