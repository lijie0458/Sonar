package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageEntity; 
import com.dogfood.aa20240808.domain.entities.OutsourceReturnStorageEntity; 

public class LoadOutsourceReturnStorageTableView_3CustomizeControllerDto {

    public OutsourceInStorageEntity filter;
    public TimeHorizonStructure timeHorizon;
    public Long size;
    public OutsourceReturnStorageEntity filter1;
    public String sort;
    public Long page;
    public List<String> dataViewAuthority;
    public String order;
    public OutsourceInStorageEntity getFilter() {
        return filter;
    } 

    public void setFilter(OutsourceInStorageEntity filter) {
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

    public OutsourceReturnStorageEntity getFilter1() {
        return filter1;
    } 

    public void setFilter1(OutsourceReturnStorageEntity filter1) {
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
