package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import com.dogfood.aa20240808.domain.entities.LCAPUser; 
import com.dogfood.aa20240808.domain.entities.DepartmentEntity; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ProductInStorageStrutureStructure {

    @Label("产品入库信息")
    public ProductInStorageEntity productInStorage;
    @Label("部门信息")
    public DepartmentEntity department;
    @Label("保管员信息")
    public LCAPUser user;
    public ProductInStorageEntity getProductInStorage() {
        return productInStorage;
    } 

    public void setProductInStorage(ProductInStorageEntity productInStorage) {
        this.productInStorage = productInStorage; 
    } 

    public DepartmentEntity getDepartment() {
        return department;
    } 

    public void setDepartment(DepartmentEntity department) {
        this.department = department; 
    } 

    public LCAPUser getUser() {
        return user;
    } 

    public void setUser(LCAPUser user) {
        this.user = user; 
    } 


}
