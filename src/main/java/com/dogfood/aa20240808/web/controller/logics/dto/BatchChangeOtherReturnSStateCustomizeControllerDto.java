package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 
import com.dogfood.aa20240808.domain.enumeration.OtherReturnStorageStateEnumEnum; 

public class BatchChangeOtherReturnSStateCustomizeControllerDto {

    public OtherReturnStorageStateEnumEnum otherReturnSState;
    public List<String> codeList;
    public OtherReturnStorageStateEnumEnum getOtherReturnSState() {
        return otherReturnSState;
    } 

    public void setOtherReturnSState(OtherReturnStorageStateEnumEnum otherReturnSState) {
        this.otherReturnSState = otherReturnSState; 
    } 

    public List<String> getCodeList() {
        return codeList;
    } 

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList; 
    } 


}
