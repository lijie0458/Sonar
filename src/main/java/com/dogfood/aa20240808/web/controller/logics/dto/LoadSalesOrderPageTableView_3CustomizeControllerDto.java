package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.enumeration.DistinctionEnumEnum; 
import com.dogfood.aa20240808.domain.entities.SalesOrdersEntity; 

public class LoadSalesOrderPageTableView_3CustomizeControllerDto {

    public DistinctionEnumEnum DistinctionEnum;
    public SalesOrdersEntity filter;
    public List<String> dataViewAuthorityUserNameList;
    public Long size;
    public TimeHorizonStructure TimeHorizon;
    public String sort;
    public Long page;
    public String order;
    public DistinctionEnumEnum getDistinctionEnum() {
        return DistinctionEnum;
    } 

    public void setDistinctionEnum(DistinctionEnumEnum DistinctionEnum) {
        this.DistinctionEnum = DistinctionEnum; 
    } 

    public SalesOrdersEntity getFilter() {
        return filter;
    } 

    public void setFilter(SalesOrdersEntity filter) {
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

    public TimeHorizonStructure getTimeHorizon() {
        return TimeHorizon;
    } 

    public void setTimeHorizon(TimeHorizonStructure TimeHorizon) {
        this.TimeHorizon = TimeHorizon; 
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
