package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import com.dogfood.aa20240808.domain.entities.BePutInStorageEntity; 
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteEntity; 
import com.dogfood.aa20240808.domain.entities.BePutInStorageDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_FD131DC799F7188AD2865421C2FAC4D7 {

    public GoodsReturnedNoteDetailsEntity goodsReturnedNoteDetails;
    public BePutInStorageDetailsEntity bePutInStorageDetails;
    public InventoryEntity inventory;
    public GoodsReturnedNoteEntity goodsReturnedNote;
    public BePutInStorageEntity bePutInStorage;
    public GoodsReturnedNoteDetailsEntity getGoodsReturnedNoteDetails() {
        return goodsReturnedNoteDetails;
    } 

    public void setGoodsReturnedNoteDetails(GoodsReturnedNoteDetailsEntity goodsReturnedNoteDetails) {
        this.goodsReturnedNoteDetails = goodsReturnedNoteDetails; 
    } 

    public BePutInStorageDetailsEntity getBePutInStorageDetails() {
        return bePutInStorageDetails;
    } 

    public void setBePutInStorageDetails(BePutInStorageDetailsEntity bePutInStorageDetails) {
        this.bePutInStorageDetails = bePutInStorageDetails; 
    } 

    public InventoryEntity getInventory() {
        return inventory;
    } 

    public void setInventory(InventoryEntity inventory) {
        this.inventory = inventory; 
    } 

    public GoodsReturnedNoteEntity getGoodsReturnedNote() {
        return goodsReturnedNote;
    } 

    public void setGoodsReturnedNote(GoodsReturnedNoteEntity goodsReturnedNote) {
        this.goodsReturnedNote = goodsReturnedNote; 
    } 

    public BePutInStorageEntity getBePutInStorage() {
        return bePutInStorage;
    } 

    public void setBePutInStorage(BePutInStorageEntity bePutInStorage) {
        this.bePutInStorage = bePutInStorage; 
    } 


}
