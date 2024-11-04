package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.LCAPUserRoleMapping; 
import com.dogfood.aa20240808.domain.entities.DepartmentEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPRole; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_764AC7B785EFB4D4E2801B4A25796913 {

    public LCAPUser lCAPUser;
    public LCAPUserRoleMapping lCAPUserRoleMapping;
    public LCAPRole lCAPRole;
    public DepartmentEntity department;
    public LCAPUser getLCAPUser() {
        return lCAPUser;
    } 

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser; 
    } 

    public LCAPUserRoleMapping getLCAPUserRoleMapping() {
        return lCAPUserRoleMapping;
    } 

    public void setLCAPUserRoleMapping(LCAPUserRoleMapping lCAPUserRoleMapping) {
        this.lCAPUserRoleMapping = lCAPUserRoleMapping; 
    } 

    public LCAPRole getLCAPRole() {
        return lCAPRole;
    } 

    public void setLCAPRole(LCAPRole lCAPRole) {
        this.lCAPRole = lCAPRole; 
    } 

    public DepartmentEntity getDepartment() {
        return department;
    } 

    public void setDepartment(DepartmentEntity department) {
        this.department = department; 
    } 


}
