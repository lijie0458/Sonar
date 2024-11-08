package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import java.util.ArrayList; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.PermissionGroupEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPPermission; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class PerGroupStructureStructure {

    @Label("权限组")
    public PermissionGroupEntity perGroup;

    @Label("权限")
    public List<LCAPPermission> permissionList = new ArrayList<>();

    public PermissionGroupEntity getPerGroup() {
        return perGroup;
    } 

    public void setPerGroup(PermissionGroupEntity perGroup) {
        this.perGroup = perGroup; 
    } 

    public List<LCAPPermission> getPermissionList() {
        return permissionList;
    } 

    public void setPermissionList(List<LCAPPermission> permissionList) {
        this.permissionList = permissionList; 
    } 

}
