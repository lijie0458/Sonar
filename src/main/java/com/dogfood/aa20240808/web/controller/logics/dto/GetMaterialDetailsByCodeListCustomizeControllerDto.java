package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 

public class GetMaterialDetailsByCodeListCustomizeControllerDto {

    public List<String> MaterialCodeList;
    public List<String> getMaterialCodeList() {
        return MaterialCodeList;
    } 

    public void setMaterialCodeList(List<String> MaterialCodeList) {
        this.MaterialCodeList = MaterialCodeList; 
    } 


}
