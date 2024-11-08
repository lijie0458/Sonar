package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.Storage_locationEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 
import com.dogfood.aa20240808.domain.entities.ProductInStorageDetailsEntity; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ProductInStorageDetailsStrutureStructure {

    @Label("产品入库详情")
    public ProductInStorageDetailsEntity productInStorageDetails;

    @Label("物料信息")
    public MaterialDetailsEntity materialDetails;

    @Label("计量单位信息")
    public MeasuringUnitEntity measuringUnit;

    @Label("库存信息")
    public InventoryEntity inventory;

    @Label("库位信息")
    public Storage_locationEntity storagelocation;

    @Label("仓库信息")
    public Warehouse_levelTwoEntity warehouse;

    @Label("库位列表信息")
    public List<Storage_locationEntity> storagelocationList = new ArrayList<>();

    @Label("即时库存")
    public BigDecimal sum;

    public ProductInStorageDetailsEntity getProductInStorageDetails() {
        return productInStorageDetails;
    } 

    public void setProductInStorageDetails(ProductInStorageDetailsEntity productInStorageDetails) {
        this.productInStorageDetails = productInStorageDetails; 
    } 

    public MaterialDetailsEntity getMaterialDetails() {
        return materialDetails;
    } 

    public void setMaterialDetails(MaterialDetailsEntity materialDetails) {
        this.materialDetails = materialDetails; 
    } 

    public MeasuringUnitEntity getMeasuringUnit() {
        return measuringUnit;
    } 

    public void setMeasuringUnit(MeasuringUnitEntity measuringUnit) {
        this.measuringUnit = measuringUnit; 
    } 

    public InventoryEntity getInventory() {
        return inventory;
    } 

    public void setInventory(InventoryEntity inventory) {
        this.inventory = inventory; 
    } 

    public Storage_locationEntity getStoragelocation() {
        return storagelocation;
    } 

    public void setStoragelocation(Storage_locationEntity storagelocation) {
        this.storagelocation = storagelocation; 
    } 

    public Warehouse_levelTwoEntity getWarehouse() {
        return warehouse;
    } 

    public void setWarehouse(Warehouse_levelTwoEntity warehouse) {
        this.warehouse = warehouse; 
    } 

    public List<Storage_locationEntity> getStoragelocationList() {
        return storagelocationList;
    } 

    public void setStoragelocationList(List<Storage_locationEntity> storagelocationList) {
        this.storagelocationList = storagelocationList; 
    } 

    public BigDecimal getSum() {
        return sum;
    } 

    public void setSum(BigDecimal sum) {
        this.sum = sum; 
    } 

}
