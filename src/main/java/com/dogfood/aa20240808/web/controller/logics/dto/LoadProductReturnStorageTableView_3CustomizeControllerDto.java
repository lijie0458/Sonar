package com.dogfood.aa20240808.web.controller.logics.dto; 

import com.dogfood.aa20240808.domain.entities.ProductReturnStorageEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageEntity; 

public class LoadProductReturnStorageTableView_3CustomizeControllerDto {

    public ProductInStorageEntity filter;
    public TimeHorizonStructure timeHorizon;
    public Long size;
    public ProductReturnStorageEntity filter1;
    public String sort;
    public Long page;
    public List<String> dataViewAuthority;
    public String order;
    public ProductInStorageEntity getFilter() {
        return filter;
    } 

    public void setFilter(ProductInStorageEntity filter) {
        this.filter = filter; 
    } 

    public TimeHorizonStructure getTimeHorizon() {
        return timeHorizon;
    } 

    public void setTimeHorizon(TimeHorizonStructure timeHorizon) {
        this.timeHorizon = timeHorizon; 
    } 

    public Long getSize() {
        return size;
    } 

    public void setSize(Long size) {
        this.size = size; 
    } 

    public ProductReturnStorageEntity getFilter1() {
        return filter1;
    } 

    public void setFilter1(ProductReturnStorageEntity filter1) {
        this.filter1 = filter1; 
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

    public List<String> getDataViewAuthority() {
        return dataViewAuthority;
    } 

    public void setDataViewAuthority(List<String> dataViewAuthority) {
        this.dataViewAuthority = dataViewAuthority; 
    } 

    public String getOrder() {
        return order;
    } 

    public void setOrder(String order) {
        this.order = order; 
    } 


}
