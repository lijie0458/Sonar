package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 
import com.dogfood.aa20240808.domain.entities.LCAPResource; 
import com.dogfood.aa20240808.domain.entities.LCAPPermission; 

public class PerResManagementCreateOrUpdateCustomizeControllerDto {

    public LCAPPermission input;
    public List<LCAPResource> selectedResData;
    public Boolean isUpdate;
    public LCAPPermission getInput() {
        return input;
    } 

    public void setInput(LCAPPermission input) {
        this.input = input; 
    } 

    public List<LCAPResource> getSelectedResData() {
        return selectedResData;
    } 

    public void setSelectedResData(List<LCAPResource> selectedResData) {
        this.selectedResData = selectedResData; 
    } 

    public Boolean getIsUpdate() {
        return isUpdate;
    } 

    public void setIsUpdate(Boolean isUpdate) {
        this.isUpdate = isUpdate; 
    } 


}
