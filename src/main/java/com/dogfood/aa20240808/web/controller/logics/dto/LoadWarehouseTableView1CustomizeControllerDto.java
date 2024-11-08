package com.dogfood.aa20240808.web.controller.logics.dto; 

import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 

public class LoadWarehouseTableView1CustomizeControllerDto {

    public Warehouse_levelTwoEntity filter;

    public Long size;

    public String sort;

    public Long page;

    public String order;

    public Warehouse_levelTwoEntity getFilter() {
        return filter;
    } 

    public void setFilter(Warehouse_levelTwoEntity filter) {
        this.filter = filter; 
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
