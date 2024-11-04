package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.LCAPPerResMapping; 
import com.dogfood.aa20240808.domain.entities.LCAPResource; 
import com.dogfood.aa20240808.domain.entities.LCAPPermission; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_A0B03992F694D9DC0DBA09379A608DAA {

    public LCAPPermission lCAPPermission;
    public LCAPPerResMapping lCAPPerResMapping;
    public LCAPResource lCAPResource;
    public LCAPPermission getLCAPPermission() {
        return lCAPPermission;
    } 

    public void setLCAPPermission(LCAPPermission lCAPPermission) {
        this.lCAPPermission = lCAPPermission; 
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
