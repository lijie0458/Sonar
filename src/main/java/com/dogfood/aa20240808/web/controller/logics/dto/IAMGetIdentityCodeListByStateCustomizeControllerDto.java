package com.dogfood.aa20240808.web.controller.logics.dto; 

import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 

public class IAMGetIdentityCodeListByStateCustomizeControllerDto {

    public IdentitySourceStateEnumEnum state;
    public IdentitySourceStateEnumEnum getState() {
        return state;
    } 

    public void setState(IdentitySourceStateEnumEnum state) {
        this.state = state; 
    } 


}
