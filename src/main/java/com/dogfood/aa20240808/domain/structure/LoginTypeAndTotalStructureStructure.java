package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.enumeration.IdentitySourceStateEnumEnum; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class LoginTypeAndTotalStructureStructure {

    @Label("登陆模式")
    public String type;

    @Label("场景")
    public String scenes;

    @Label("已添加个数")
    public Long total;

    @Label("是否开放")
    public Boolean isOpen;

    public IdentitySourceStateEnumEnum state;

    public String getType() {
        return type;
    } 

    public void setType(String type) {
        this.type = type; 
    } 

    public String getScenes() {
        return scenes;
    } 

    public void setScenes(String scenes) {
        this.scenes = scenes; 
    } 

    public Long getTotal() {
        return total;
    } 

    public void setTotal(Long total) {
        this.total = total; 
    } 

    public Boolean getIsOpen() {
        return isOpen;
    } 

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen; 
    } 

    public IdentitySourceStateEnumEnum getState() {
        return state;
    } 

    public void setState(IdentitySourceStateEnumEnum state) {
        this.state = state; 
    } 

}
