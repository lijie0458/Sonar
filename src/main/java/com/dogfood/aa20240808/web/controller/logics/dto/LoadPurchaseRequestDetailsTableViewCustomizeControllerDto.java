package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 

public class LoadPurchaseRequestDetailsTableViewCustomizeControllerDto {

    public MaterialDetailsEntity filter;
    public List<String> dataViewAuthorityUserNameList;
    public Long size;
    public String sort;
    public Long page;
    public String order;
    public MaterialDetailsEntity getFilter() {
        return filter;
    } 

    public void setFilter(MaterialDetailsEntity filter) {
        this.filter = filter; 
    } 

    public List<String> getDataViewAuthorityUserNameList() {
        return dataViewAuthorityUserNameList;
    } 

    public void setDataViewAuthorityUserNameList(List<String> dataViewAuthorityUserNameList) {
        this.dataViewAuthorityUserNameList = dataViewAuthorityUserNameList; 
    } 

    public Long getSize() {
        return size;
    } 

    public void setSize(Long size) {
        this.size = size; 
    } 

    public String getSort() {
        return sort;
    } 

    public void setSort(String sort) {
        this.sort = sort; 
    } 

    public Long getPage() {
        return page;
    } 

    public void setPage(Long page) {
        this.page = page; 
    } 

    public String getOrder() {
        return order;
    } 

    public void setOrder(String order) {
        this.order = order; 
    } 


}
