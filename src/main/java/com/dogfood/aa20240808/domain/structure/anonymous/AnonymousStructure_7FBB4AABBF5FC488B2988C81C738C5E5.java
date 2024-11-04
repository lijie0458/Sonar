package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.PerGroupPerMappingEntity; 
import com.dogfood.aa20240808.domain.entities.PermissionGroupEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPPermission; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_7FBB4AABBF5FC488B2988C81C738C5E5 {

    public PermissionGroupEntity permissionGroup;
    public PerGroupPerMappingEntity perGroupPerMapping;
    public LCAPPermission lCAPPermission;
    public PermissionGroupEntity getPermissionGroup() {
        return permissionGroup;
    } 

    public void setPermissionGroup(PermissionGroupEntity permissionGroup) {
        this.permissionGroup = permissionGroup; 
    } 

    public PerGroupPerMappingEntity getPerGroupPerMapping() {
        return perGroupPerMapping;
    } 

    public void setPerGroupPerMapping(PerGroupPerMappingEntity perGroupPerMapping) {
        this.perGroupPerMapping = perGroupPerMapping; 
    } 

    public LCAPPermission getLCAPPermission() {
        return lCAPPermission;
    } 

    public void setLCAPPermission(LCAPPermission lCAPPermission) {
        this.lCAPPermission = lCAPPermission; 
    } 


}
