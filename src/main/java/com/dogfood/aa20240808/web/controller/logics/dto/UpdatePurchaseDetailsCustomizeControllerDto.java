package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 

public class UpdatePurchaseDetailsCustomizeControllerDto {

    public List<Long> purchaseDetailsIdList;

    public List<Long> getPurchaseDetailsIdList() {
        return purchaseDetailsIdList;
    } 

    public void setPurchaseDetailsIdList(List<Long> purchaseDetailsIdList) {
        this.purchaseDetailsIdList = purchaseDetailsIdList; 
    } 

}
