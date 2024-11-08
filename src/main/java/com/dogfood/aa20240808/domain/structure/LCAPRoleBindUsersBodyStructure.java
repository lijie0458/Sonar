package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class LCAPRoleBindUsersBodyStructure {

    public Long roleId;

    public List<String> userIdList = new ArrayList<>();

    public Long getRoleId() {
        return roleId;
    } 

    public void setRoleId(Long roleId) {
        this.roleId = roleId; 
    } 

    public List<String> getUserIdList() {
        return userIdList;
    } 

    public void setUserIdList(List<String> userIdList) {
        this.userIdList = userIdList; 
    } 

}
