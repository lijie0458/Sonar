package com.dogfood.aa20240808.web.controller.logics.dto; 


public class LCAPGetDeptUsersCustomizeControllerDto {

    public Long size;

    public String deptId;

    public Long page;

    public Long getSize() {
        return size;
    } 

    public void setSize(Long size) {
        this.size = size; 
    } 

    public String getDeptId() {
        return deptId;
    } 

    public void setDeptId(String deptId) {
        this.deptId = deptId; 
    } 

    public Long getPage() {
        return page;
    } 

    public void setPage(Long page) {
        this.page = page; 
    } 

}
