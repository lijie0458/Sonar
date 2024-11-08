package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 
import com.dogfood.aa20240808.domain.entities.SalesOrderDetailsEntity; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class SaleOrderDetailStrutureStructure {

    @Label("基本信息")
    public SalesOrderDetailsEntity saleOrderDetails;

    @Label("库存")
    public BigDecimal inventory;

    @Label("物料")
    public MaterialDetailsEntity name;

    @Label("物料规格")
    public String sp;

    @Label("单位名称")
    public String unitname;

    public Long id;

    @Label("库位")
    public String location;

    @Label("仓库")
    public List<Warehouse_levelTwoEntity> warehouseList = new ArrayList<>();

    @Label("批号列表")
    public List<InventoryEntity> inventoryList = new ArrayList<>();

    @Label("已出库数量/已退货数量")
    public BigDecimal unshippedQuantity;

    public SalesOrderDetailsEntity getSaleOrderDetails() {
        return saleOrderDetails;
    } 

    public void setSaleOrderDetails(SalesOrderDetailsEntity saleOrderDetails) {
        this.saleOrderDetails = saleOrderDetails; 
    } 

    public BigDecimal getInventory() {
        return inventory;
    } 

    public void setInventory(BigDecimal inventory) {
        this.inventory = inventory; 
    } 

    public MaterialDetailsEntity getName() {
        return name;
    } 

    public void setName(MaterialDetailsEntity name) {
        this.name = name; 
    } 

    public String getSp() {
        return sp;
    } 

    public void setSp(String sp) {
        this.sp = sp; 
    } 

    public String getUnitname() {
        return unitname;
    } 

    public void setUnitname(String unitname) {
        this.unitname = unitname; 
    } 

    public Long getId() {
        return id;
    } 

    public void setId(Long id) {
        this.id = id; 
    } 

    public String getLocation() {
        return location;
    } 

    public void setLocation(String location) {
        this.location = location; 
    } 

    public List<Warehouse_levelTwoEntity> getWarehouseList() {
        return warehouseList;
    } 

    public void setWarehouseList(List<Warehouse_levelTwoEntity> warehouseList) {
        this.warehouseList = warehouseList; 
    } 

    public List<InventoryEntity> getInventoryList() {
        return inventoryList;
    } 

    public void setInventoryList(List<InventoryEntity> inventoryList) {
        this.inventoryList = inventoryList; 
    } 

    public BigDecimal getUnshippedQuantity() {
        return unshippedQuantity;
    } 

    public void setUnshippedQuantity(BigDecimal unshippedQuantity) {
        this.unshippedQuantity = unshippedQuantity; 
    } 

}
