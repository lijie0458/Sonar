package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.SupplierDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.OutsourceInStorageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class OutsourceInStorageStrutureStructure {

    @Label("委外加工入库")
    public OutsourceInStorageEntity outsourceInStorage;
    @Label("供应商信息")
    public SupplierDetailsEntity supplier;
    @Label("保管员信息")
    public LCAPUser user;
    public OutsourceInStorageEntity getOutsourceInStorage() {
        return outsourceInStorage;
    } 

    public void setOutsourceInStorage(OutsourceInStorageEntity outsourceInStorage) {
        this.outsourceInStorage = outsourceInStorage; 
    } 

    public SupplierDetailsEntity getSupplier() {
        return supplier;
    } 

    public void setSupplier(SupplierDetailsEntity supplier) {
        this.supplier = supplier; 
    } 

    public LCAPUser getUser() {
        return user;
    } 

    public void setUser(LCAPUser user) {
        this.user = user; 
    } 


}
