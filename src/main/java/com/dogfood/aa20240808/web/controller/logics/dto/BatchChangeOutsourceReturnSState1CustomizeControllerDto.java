package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.OutsourceReturnStorageStateEnumEnum; 

public class BatchChangeOutsourceReturnSState1CustomizeControllerDto {

    public OutsourceReturnStorageStateEnumEnum outsourceReturnSState;
    public List<String> codeList;
    public OutsourceReturnStorageStateEnumEnum getOutsourceReturnSState() {
        return outsourceReturnSState;
    } 

    public void setOutsourceReturnSState(OutsourceReturnStorageStateEnumEnum outsourceReturnSState) {
        this.outsourceReturnSState = outsourceReturnSState; 
    } 

    public List<String> getCodeList() {
        return codeList;
    } 

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList; 
    } 


}
