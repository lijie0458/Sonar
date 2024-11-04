package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 

public class FunctionalAuthoritySaveCustomizeControllerDto {

    public List<Long> selectedList;
    public Long roleId;
    public List<Long> getSelectedList() {
        return selectedList;
    } 

    public void setSelectedList(List<Long> selectedList) {
        this.selectedList = selectedList; 
    } 

    public Long getRoleId() {
        return roleId;
    } 

    public void setRoleId(Long roleId) {
        this.roleId = roleId; 
    } 


}
