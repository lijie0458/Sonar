package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.entities.OtherReturnStorageEntity; 
import com.dogfood.aa20240808.domain.entities.OtherInStorageEntity; 

public class LoadOtherReturnStorageTableView_4CustomizeControllerDto {

    public OtherInStorageEntity filter;
    public TimeHorizonStructure timeHorizon;
    public Long size;
    public OtherReturnStorageEntity filter1;
    public String sort;
    public Long page;
    public List<String> dataViewAuthority;
    public String order;
    public OtherInStorageEntity getFilter() {
        return filter;
    } 

    public void setFilter(OtherInStorageEntity filter) {
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

    public OtherReturnStorageEntity getFilter1() {
        return filter1;
    } 

    public void setFilter1(OtherReturnStorageEntity filter1) {
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
