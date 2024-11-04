package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 
import com.dogfood.aa20240808.domain.entities.TransferSlipDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.Warehouse_levelTwoEntity; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class TransferSlipDetailsStructure {

    @Label("基本信息")
    public TransferSlipDetailsEntity transferSlip;
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
    @Label("调入仓库")
    public List<Warehouse_levelTwoEntity> inwarehouseList = new ArrayList<>();
    public TransferSlipDetailsEntity getTransferSlip() {
        return transferSlip;
    } 

    public void setTransferSlip(TransferSlipDetailsEntity transferSlip) {
        this.transferSlip = transferSlip; 
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

    public List<Warehouse_levelTwoEntity> getInwarehouseList() {
        return inwarehouseList;
    } 

    public void setInwarehouseList(List<Warehouse_levelTwoEntity> inwarehouseList) {
        this.inwarehouseList = inwarehouseList; 
    } 


}
