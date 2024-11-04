package com.dogfood.aa20240808.web.controller.logics.dto; 

import com.dogfood.aa20240808.domain.entities.UserOrgMappingEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 

public class PERSaveUserAndAddOrgCustomizeControllerDto {

    public UserOrgMappingEntity userOrgMapping;
    public List<Long> roleIdList;
    public LCAPUser user;
    public Boolean isUpdate;
    public UserOrgMappingEntity getUserOrgMapping() {
        return userOrgMapping;
    } 

    public void setUserOrgMapping(UserOrgMappingEntity userOrgMapping) {
        this.userOrgMapping = userOrgMapping; 
    } 

    public List<Long> getRoleIdList() {
        return roleIdList;
    } 

    public void setRoleIdList(List<Long> roleIdList) {
        this.roleIdList = roleIdList; 
    } 

    public LCAPUser getUser() {
        return user;
    } 

    public void setUser(LCAPUser user) {
        this.user = user; 
    } 

    public Boolean getIsUpdate() {
        return isUpdate;
    } 

    public void setIsUpdate(Boolean isUpdate) {
        this.isUpdate = isUpdate; 
    } 


}
