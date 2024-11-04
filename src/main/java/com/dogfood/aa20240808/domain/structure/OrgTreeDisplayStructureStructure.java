package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.OrganisationEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class OrgTreeDisplayStructureStructure {

    @Label("实体")
    public OrganisationEntity organisation;
    @Label("树形结构是否默认展开")
    public Boolean treeExpanded;
    public OrganisationEntity getOrganisation() {
        return organisation;
    } 

    public void setOrganisation(OrganisationEntity organisation) {
        this.organisation = organisation; 
    } 

    public Boolean getTreeExpanded() {
        return treeExpanded;
    } 

    public void setTreeExpanded(Boolean treeExpanded) {
        this.treeExpanded = treeExpanded; 
    } 


}
