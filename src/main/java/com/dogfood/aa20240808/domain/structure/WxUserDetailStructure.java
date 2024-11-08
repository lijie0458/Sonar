package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class WxUserDetailStructure {

    public Long errcode;

    public String errmsg;

    public String userid;

    public String name;

    public String position;

    public String mobile;

    public String email;

    public Long getErrcode() {
        return errcode;
    } 

    public void setErrcode(Long errcode) {
        this.errcode = errcode; 
    } 

    public String getErrmsg() {
        return errmsg;
    } 

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg; 
    } 

    public String getUserid() {
        return userid;
    } 

    public void setUserid(String userid) {
        this.userid = userid; 
    } 

    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name; 
    } 

    public String getPosition() {
        return position;
    } 

    public void setPosition(String position) {
        this.position = position; 
    } 

    public String getMobile() {
        return mobile;
    } 

    public void setMobile(String mobile) {
        this.mobile = mobile; 
    } 

    public String getEmail() {
        return email;
    } 

    public void setEmail(String email) {
        this.email = email; 
    } 

}
