package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class Contact_informationStructure {

    @Label("姓名")
    public String contact_name;
    @Label("电话")
    public String contact_phone;
    @Label("职务")
    public String contact_title;
    @Label("邮箱")
    public String contact_email;
    public String getContact_name() {
        return contact_name;
    } 

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name; 
    } 

    public String getContact_phone() {
        return contact_phone;
    } 

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone; 
    } 

    public String getContact_title() {
        return contact_title;
    } 

    public void setContact_title(String contact_title) {
        this.contact_title = contact_title; 
    } 

    public String getContact_email() {
        return contact_email;
    } 

    public void setContact_email(String contact_email) {
        this.contact_email = contact_email; 
    } 


}
