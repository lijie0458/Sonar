package com.dogfood.aa20240808.web.controller.logics.dto; 

import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity; 

public class IAMSaveIdentityCustomizeControllerDto {

    public IdentitySourceConfigEntity sourceDto;
    public IdentitySourceConfigEntity getSourceDto() {
        return sourceDto;
    } 

    public void setSourceDto(IdentitySourceConfigEntity sourceDto) {
        this.sourceDto = sourceDto; 
    } 


}
