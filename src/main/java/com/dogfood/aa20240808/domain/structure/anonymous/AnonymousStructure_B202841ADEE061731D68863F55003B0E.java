package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPPerResMapping; 
import com.dogfood.aa20240808.domain.entities.LCAPResource; 
import com.dogfood.aa20240808.domain.entities.LCAPRolePerMapping; 
import com.dogfood.aa20240808.domain.entities.LCAPUserRoleMapping; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_B202841ADEE061731D68863F55003B0E {

    public LCAPRolePerMapping lCAPRolePerMapping;
    public LCAPUserRoleMapping lCAPUserRoleMapping;
    public LCAPPerResMapping lCAPPerResMapping;
    public LCAPResource lCAPResource;
    public LCAPRolePerMapping getLCAPRolePerMapping() {
        return lCAPRolePerMapping;
    } 

    public void setLCAPRolePerMapping(LCAPRolePerMapping lCAPRolePerMapping) {
        this.lCAPRolePerMapping = lCAPRolePerMapping; 
    } 

    public LCAPUserRoleMapping getLCAPUserRoleMapping() {
        return lCAPUserRoleMapping;
    } 

    public void setLCAPUserRoleMapping(LCAPUserRoleMapping lCAPUserRoleMapping) {
        this.lCAPUserRoleMapping = lCAPUserRoleMapping; 
    } 

    public LCAPPerResMapping getLCAPPerResMapping() {
        return lCAPPerResMapping;
    } 

    public void setLCAPPerResMapping(LCAPPerResMapping lCAPPerResMapping) {
        this.lCAPPerResMapping = lCAPPerResMapping; 
    } 

    public LCAPResource getLCAPResource() {
        return lCAPResource;
    } 

    public void setLCAPResource(LCAPResource lCAPResource) {
        this.lCAPResource = lCAPResource; 
    } 


}
