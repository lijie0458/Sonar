package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.OtherInStorageStateEnumEnum; 

public class BatchChangeOtherInSStateCustomizeControllerDto {

    public OtherInStorageStateEnumEnum otherInSState;

    public List<String> codeList;

    public OtherInStorageStateEnumEnum getOtherInSState() {
        return otherInSState;
    } 

    public void setOtherInSState(OtherInStorageStateEnumEnum otherInSState) {
        this.otherInSState = otherInSState; 
    } 

    public List<String> getCodeList() {
        return codeList;
    } 

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList; 
    } 

}
