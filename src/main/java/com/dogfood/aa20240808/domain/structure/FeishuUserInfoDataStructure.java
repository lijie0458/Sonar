package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class FeishuUserInfoDataStructure {

    @Label("用户姓名")
    public String name;
    @Label("用户英文名称")
    public String en_name;
    @Label("用户头像")
    public String avatar_url;
    @Label("用户头像 72x72")
    public String avatar_thumb;
    @Label("用户头像 240x240")
    public String avatar_middle;
    @Label("用户头像 640x640")
    public String avatar_big;
    @Label("用户在应用内的唯一标识")
    public String open_id;
    @Label("用户对ISV的唯一标识，对于同一个ISV，用户在其名下所有应用的union_id相同")
    public String union_id;
    @Label("用户邮箱")
    public String email;
    @Label("	 企业邮箱，请先确保已在管理后台启用飞书邮箱服务")
    public String enterprise_email;
    @Label("用户 user_id")
    public String user_id;
    @Label("用户手机号")
    public String mobile;
    @Label("当前企业标识")
    public String tenant_key;
    @Label("用户工号")
    public String employee_no;
    public String getName() {
        return name;
    } 

    public void setName(String name) {
        this.name = name; 
    } 

    public String getEn_name() {
        return en_name;
    } 

    public void setEn_name(String en_name) {
        this.en_name = en_name; 
    } 

    public String getAvatar_url() {
        return avatar_url;
    } 

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url; 
    } 

    public String getAvatar_thumb() {
        return avatar_thumb;
    } 

    public void setAvatar_thumb(String avatar_thumb) {
        this.avatar_thumb = avatar_thumb; 
    } 

    public String getAvatar_middle() {
        return avatar_middle;
    } 

    public void setAvatar_middle(String avatar_middle) {
        this.avatar_middle = avatar_middle; 
    } 

    public String getAvatar_big() {
        return avatar_big;
    } 

    public void setAvatar_big(String avatar_big) {
        this.avatar_big = avatar_big; 
    } 

    public String getOpen_id() {
        return open_id;
    } 

    public void setOpen_id(String open_id) {
        this.open_id = open_id; 
    } 

    public String getUnion_id() {
        return union_id;
    } 

    public void setUnion_id(String union_id) {
        this.union_id = union_id; 
    } 

    public String getEmail() {
        return email;
    } 

    public void setEmail(String email) {
        this.email = email; 
    } 

    public String getEnterprise_email() {
        return enterprise_email;
    } 

    public void setEnterprise_email(String enterprise_email) {
        this.enterprise_email = enterprise_email; 
    } 

    public String getUser_id() {
        return user_id;
    } 

    public void setUser_id(String user_id) {
        this.user_id = user_id; 
    } 

    public String getMobile() {
        return mobile;
    } 

    public void setMobile(String mobile) {
        this.mobile = mobile; 
    } 

    public String getTenant_key() {
        return tenant_key;
    } 

    public void setTenant_key(String tenant_key) {
        this.tenant_key = tenant_key; 
    } 

    public String getEmployee_no() {
        return employee_no;
    } 

    public void setEmployee_no(String employee_no) {
        this.employee_no = employee_no; 
    } 


}
