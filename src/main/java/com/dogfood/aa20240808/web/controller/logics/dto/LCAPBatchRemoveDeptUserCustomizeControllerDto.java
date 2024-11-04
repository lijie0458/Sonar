package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 

public class LCAPBatchRemoveDeptUserCustomizeControllerDto {

    public List<String> userIds;
    public String deptId;
    public List<String> getUserIds() {
        return userIds;
    } 

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds; 
    } 

    public String getDeptId() {
        return deptId;
    } 

    public void setDeptId(String deptId) {
        this.deptId = deptId; 
    } 


}
