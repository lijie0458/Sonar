package com.dogfood.aa20240808.web.controller.logics.dto; 

import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 

public class IAMGetConfigCustomizeControllerDto {

    public IdentitySourceStateEnumEnum state;
    public String type;
    public IdentitySourceStateEnumEnum getState() {
        return state;
    } 

    public void setState(IdentitySourceStateEnumEnum state) {
        this.state = state; 
    } 

    public String getType() {
        return type;
    } 

    public void setType(String type) {
        this.type = type; 
    } 


}
