package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class LCAPLogicViewMapping {

    @Label("主键")
    @javax.validation.constraints.NotNull
    public Long id;
    @Label("逻辑标识")
    @javax.validation.constraints.NotNull
    public String logicIdentifier;
    @Label("资源路径")
    @javax.validation.constraints.NotNull
    public String resourceName;
    @Label("资源类型")
    @javax.validation.constraints.NotNull
    public String resourceType;
    @Label("逻辑与资源绑定的分组关系")
    @javax.validation.constraints.NotNull
    public Long group;
    @Label("创建时间")
    public Long changeTime;
    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id; 
    } 

    public String getLogicIdentifier() {
        return logicIdentifier;
    } 

    public void setLogicIdentifier(String logicIdentifier) {
        this.logicIdentifier = logicIdentifier; 
    } 

    public String getResourceName() {
        return resourceName;
    } 

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName; 
    } 

    public String getResourceType() {
        return resourceType;
    } 

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType; 
    } 

    public Long getGroup() {
        return group;
    } 

    public void setGroup(Long group) {
        this.group = group; 
    } 

    public Long getChangeTime() {
        return changeTime;
    } 

    public void setChangeTime(Long changeTime) {
        this.changeTime = changeTime; 
    } 


}
