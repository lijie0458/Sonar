package com.dogfood.aa20240808.web.controller.logics.dto; 

import com.dogfood.aa20240808.domain.entities.LCAPUser; 

public class LoadDepartmentTableView_1CustomizeControllerDto {

    public LCAPUser filter;
    public Long size;
    public Long departmentId;
    public String sort;
    public Long page;
    public String order;
    public LCAPUser getFilter() {
        return filter;
    } 

    public void setFilter(LCAPUser filter) {
        this.filter = filter; 
    } 

    public Long getSize() {
        return size;
    } 

    public void setSize(Long size) {
        this.size = size; 
    } 

    public Long getDepartmentId() {
        return departmentId;
    } 

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId; 
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
