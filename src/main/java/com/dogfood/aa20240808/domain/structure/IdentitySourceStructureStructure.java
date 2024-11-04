package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class IdentitySourceStructureStructure {

    @Label("身份源图标")
    public String icon;
    @Label("身份源名字")
    public String name;
    @Label("身份源描述")
    public String description;
    @Label("身份源标识")
    public IdentitySourceStateEnumEnum state;
    public String getIcon() {
        return icon;
    } 

    public void setIcon(String icon) {
        this.icon = icon; 
    } 

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name; 
    } 

    public String getDescription() {
        return description;
    } 

    public void setDescription(String description) {
        this.description = description; 
    } 

    public IdentitySourceStateEnumEnum getState() {
        return state;
    } 

    public void setState(IdentitySourceStateEnumEnum state) {
        this.state = state; 
    } 


}
