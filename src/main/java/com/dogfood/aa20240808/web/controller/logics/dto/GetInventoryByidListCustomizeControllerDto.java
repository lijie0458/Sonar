package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 

public class GetInventoryByidListCustomizeControllerDto {

    public List<Long> idList;
    public List<Long> getIdList() {
        return idList;
    } 

    public void setIdList(List<Long> idList) {
        this.idList = idList; 
    } 


}
