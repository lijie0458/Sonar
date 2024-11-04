package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPUserRoleMapping; 
import com.dogfood.aa20240808.domain.entities.LCAPRole; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_99BA20F3093BB3AC3F3CA0BCA6D65EB8 {

    public LCAPUserRoleMapping lCAPUserRoleMapping;
    public LCAPRole lCAPRole;
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


}
