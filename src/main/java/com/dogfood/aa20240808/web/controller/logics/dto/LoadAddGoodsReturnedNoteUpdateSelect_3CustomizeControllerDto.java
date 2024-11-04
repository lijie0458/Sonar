package com.dogfood.aa20240808.web.controller.logics.dto; 

import java.util.List; 

public class LoadAddGoodsReturnedNoteUpdateSelect_3CustomizeControllerDto {

    public String BeputlnStorageId;
    public List<Long> BePulnStorageDetailsIdList;
    public Long size;
    public Long page;
    public String getBeputlnStorageId() {
        return BeputlnStorageId;
    } 

    public void setBeputlnStorageId(String BeputlnStorageId) {
        this.BeputlnStorageId = BeputlnStorageId; 
    } 

    public List<Long> getBePulnStorageDetailsIdList() {
        return BePulnStorageDetailsIdList;
    } 

    public void setBePulnStorageDetailsIdList(List<Long> BePulnStorageDetailsIdList) {
        this.BePulnStorageDetailsIdList = BePulnStorageDetailsIdList; 
    } 

    public Long getSize() {
        return size;
    } 

    public void setSize(Long size) {
        this.size = size; 
    } 

    public Long getPage() {
        return page;
    } 

    public void setPage(Long page) {
        this.page = page; 
    } 


}
