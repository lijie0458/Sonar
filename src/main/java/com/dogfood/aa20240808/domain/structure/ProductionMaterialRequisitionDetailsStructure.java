package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.ProductionMaterialRequisitionDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class ProductionMaterialRequisitionDetailsStructure {

    @Label("基本信息")
    public ProductionMaterialRequisitionDetailsEntity productionMaterialRequisitionDetails;
    @Label("仓库")
    public List<Warehouse_levelTwoEntity> warehouseList = new ArrayList<>();
    @Label("批号列表")
    public List<InventoryEntity> inventoryList = new ArrayList<>();
    @Label("物料信息")
    public MaterialDetailsEntity material;
    @Label("单位")
    public MeasuringUnitEntity unitName;
    @Label("即时库存")
    public BigDecimal inventory;
    @Label("已退货数量")
    public BigDecimal retrunQuerty;
    @Label("序号/功能 显隐（默认显示序号/隐藏功能）")
    public Boolean show = false;
    public ProductionMaterialRequisitionDetailsEntity getProductionMaterialRequisitionDetails() {
        return productionMaterialRequisitionDetails;
    } 

    public void setProductionMaterialRequisitionDetails(ProductionMaterialRequisitionDetailsEntity productionMaterialRequisitionDetails) {
        this.productionMaterialRequisitionDetails = productionMaterialRequisitionDetails; 
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

    public MaterialDetailsEntity getMaterial() {
        return material;
    } 

    public void setMaterial(MaterialDetailsEntity material) {
        this.material = material; 
    } 

    public MeasuringUnitEntity getUnitName() {
        return unitName;
    } 

    public void setUnitName(MeasuringUnitEntity unitName) {
        this.unitName = unitName; 
    } 

    public BigDecimal getInventory() {
        return inventory;
    } 

    public void setInventory(BigDecimal inventory) {
        this.inventory = inventory; 
    } 

    public BigDecimal getRetrunQuerty() {
        return retrunQuerty;
    } 

    public void setRetrunQuerty(BigDecimal retrunQuerty) {
        this.retrunQuerty = retrunQuerty; 
    } 

    public Boolean getShow() {
        return show;
    } 

    public void setShow(Boolean show) {
        this.show = show; 
    } 


}
