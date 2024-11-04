package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPRolePerMapping; 
import com.dogfood.aa20240808.domain.entities.LCAPPermission; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_9D03344DB7AB35A991C54E50A80AE1F9 {

    public LCAPRolePerMapping lCAPRolePerMapping;
    public LCAPPermission lCAPPermission;
    public LCAPRolePerMapping getLCAPRolePerMapping() {
        return lCAPRolePerMapping;
    } 

    public void setLCAPRolePerMapping(LCAPRolePerMapping lCAPRolePerMapping) {
        this.lCAPRolePerMapping = lCAPRolePerMapping; 
    } 

    public LCAPPermission getLCAPPermission() {
        return lCAPPermission;
    } 

    public void setLCAPPermission(LCAPPermission lCAPPermission) {
        this.lCAPPermission = lCAPPermission; 
    } 


}
