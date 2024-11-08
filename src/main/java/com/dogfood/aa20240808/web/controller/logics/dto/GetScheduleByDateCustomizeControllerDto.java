package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.time.LocalDate; 

public class GetScheduleByDateCustomizeControllerDto {

    public LocalDate createDate;

    public LocalDate getCreateDate() {
        return createDate;
    } 

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate; 
    } 

}
