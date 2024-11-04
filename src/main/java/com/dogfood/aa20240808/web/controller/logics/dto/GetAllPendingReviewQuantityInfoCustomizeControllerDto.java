package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 

public class GetAllPendingReviewQuantityInfoCustomizeControllerDto {

    public List<String> dataViewAuthority;
    public List<String> getDataViewAuthority() {
        return dataViewAuthority;
    } 

    public void setDataViewAuthority(List<String> dataViewAuthority) {
        this.dataViewAuthority = dataViewAuthority; 
    } 


}
