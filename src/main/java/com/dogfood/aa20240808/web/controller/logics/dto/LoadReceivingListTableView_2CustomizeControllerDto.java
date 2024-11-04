package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 
import com.dogfood.aa20240808.domain.structure.TimeHorizonStructure; 
import com.dogfood.aa20240808.domain.entities.ReceivingNotificationsEntity; 

public class LoadReceivingListTableView_2CustomizeControllerDto {

    public ReceivingNotificationsEntity filter;
    public List<String> dataViewAuthorityUserNameList;
    public TimeHorizonStructure TimeHorizon;
    public ReceivingNotificationsEntity getFilter() {
        return filter;
    } 

    public void setFilter(ReceivingNotificationsEntity filter) {
        this.filter = filter; 
    } 

    public List<String> getDataViewAuthorityUserNameList() {
        return dataViewAuthorityUserNameList;
    } 

    public void setDataViewAuthorityUserNameList(List<String> dataViewAuthorityUserNameList) {
        this.dataViewAuthorityUserNameList = dataViewAuthorityUserNameList; 
    } 

    public TimeHorizonStructure getTimeHorizon() {
        return TimeHorizon;
    } 

    public void setTimeHorizon(TimeHorizonStructure TimeHorizon) {
        this.TimeHorizon = TimeHorizon; 
    } 


}
