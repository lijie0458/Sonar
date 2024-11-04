package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.UserOrgMappingEntity; 
import com.dogfood.aa20240808.domain.entities.OrganisationEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_767B64E0A8935388CB3E9BF139E6586D {

    public LCAPUser lCAPUser;
    public UserOrgMappingEntity userOrgMapping;
    public OrganisationEntity organisation;
    public LCAPUser getLCAPUser() {
        return lCAPUser;
    } 

    public void setLCAPUser(LCAPUser lCAPUser) {
        this.lCAPUser = lCAPUser; 
    } 

    public UserOrgMappingEntity getUserOrgMapping() {
        return userOrgMapping;
    } 

    public void setUserOrgMapping(UserOrgMappingEntity userOrgMapping) {
        this.userOrgMapping = userOrgMapping; 
    } 

    public OrganisationEntity getOrganisation() {
        return organisation;
    } 

    public void setOrganisation(OrganisationEntity organisation) {
        this.organisation = organisation; 
    } 


}
