package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 

public class LoadsalesReturnUpdateSelectCustomizeControllerDto {

    public String orderNumber;
    public List<String> ListMaterialDetailsCode;
    public Long size;
    public Long page;
    public String getOrderNumber() {
        return orderNumber;
    } 

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber; 
    } 

    public List<String> getListMaterialDetailsCode() {
        return ListMaterialDetailsCode;
    } 

    public void setListMaterialDetailsCode(List<String> ListMaterialDetailsCode) {
        this.ListMaterialDetailsCode = ListMaterialDetailsCode; 
    } 

    public Long getSize() {
        return size;
    } 

    public void setSize(Long size) {
        this.size = size; 
    } 

    public Long getPage() {
        return page;
    } 

    public void setPage(Long page) {
        this.page = page; 
    } 


}
