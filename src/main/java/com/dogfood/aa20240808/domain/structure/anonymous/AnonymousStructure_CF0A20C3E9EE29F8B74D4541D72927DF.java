package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ThirdIdentityEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_CF0A20C3E9EE29F8B74D4541D72927DF {

    public ThirdIdentityEntity thirdIdentity;
    public ThirdIdentityEntity getThirdIdentity() {
        return thirdIdentity;
    } 

    public void setThirdIdentity(ThirdIdentityEntity thirdIdentity) {
        this.thirdIdentity = thirdIdentity; 
    } 


}
