package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.OrganisationEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_900F3E83EA37D2305A535E248B2A40EF {

    public OrganisationEntity organisation;
    public OrganisationEntity getOrganisation() {
        return organisation;
    } 

    public void setOrganisation(OrganisationEntity organisation) {
        this.organisation = organisation; 
    } 


}
