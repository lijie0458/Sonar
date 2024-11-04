package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.IdentitySourceConfigEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_E6204F88FA3760A005F0E371750B535E {

    public IdentitySourceConfigEntity identitySourceConfig;
    public IdentitySourceConfigEntity getIdentitySourceConfig() {
        return identitySourceConfig;
    } 

    public void setIdentitySourceConfig(IdentitySourceConfigEntity identitySourceConfig) {
        this.identitySourceConfig = identitySourceConfig; 
    } 


}
