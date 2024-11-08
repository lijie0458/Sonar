package com.dogfood.aa20240808.web.controller.logics.dto; 

import com.dogfood.aa20240808.domain.entities.LCAPDepartment; 

public class LCAPUpdateDepartmentCustomizeControllerDto {

    public LCAPDepartment department;

    public LCAPDepartment getDepartment() {
        return department;
    } 

    public void setDepartment(LCAPDepartment department) {
        this.department = department; 
    } 

}
