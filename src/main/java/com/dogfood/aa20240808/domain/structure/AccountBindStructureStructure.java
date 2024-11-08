package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AccountBindStructureStructure {

    @Label("身份源信息")
    public IdentitySourceConfigEntity identitySource;

    @Label("是否已绑定")
    public Boolean isBind;

    public IdentitySourceConfigEntity getIdentitySource() {
        return identitySource;
    } 

    public void setIdentitySource(IdentitySourceConfigEntity identitySource) {
        this.identitySource = identitySource; 
    } 

    public Boolean getIsBind() {
        return isBind;
    } 

    public void setIsBind(Boolean isBind) {
        this.isBind = isBind; 
    } 

}
