package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.PermissionGroupEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_93457CC3B0554D8A97B8F80AD527F29E {

    public PermissionGroupEntity permissionGroup;
    public PermissionGroupEntity getPermissionGroup() {
        return permissionGroup;
    } 

    public void setPermissionGroup(PermissionGroupEntity permissionGroup) {
        this.permissionGroup = permissionGroup; 
    } 


}
