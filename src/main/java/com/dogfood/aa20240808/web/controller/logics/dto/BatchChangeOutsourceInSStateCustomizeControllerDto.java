package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.OutsourceInStorageStateEnumEnum; 

public class BatchChangeOutsourceInSStateCustomizeControllerDto {

    public OutsourceInStorageStateEnumEnum outsourceInSState;
    public List<String> codeList;
    public OutsourceInStorageStateEnumEnum getOutsourceInSState() {
        return outsourceInSState;
    } 

    public void setOutsourceInSState(OutsourceInStorageStateEnumEnum outsourceInSState) {
        this.outsourceInSState = outsourceInSState; 
    } 

    public List<String> getCodeList() {
        return codeList;
    } 

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList; 
    } 


}
