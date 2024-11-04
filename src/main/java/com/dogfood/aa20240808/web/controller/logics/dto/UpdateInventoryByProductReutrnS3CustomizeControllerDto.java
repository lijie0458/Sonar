package com.dogfood.aa20240808.web.controller.logics.dto; 


public class UpdateInventoryByProductReutrnS3CustomizeControllerDto {

    public String goodsReturnCode;
    public Boolean addOrReduce;
    public String getGoodsReturnCode() {
        return goodsReturnCode;
    } 

    public void setGoodsReturnCode(String goodsReturnCode) {
        this.goodsReturnCode = goodsReturnCode; 
    } 

    public Boolean getAddOrReduce() {
        return addOrReduce;
    } 

    public void setAddOrReduce(Boolean addOrReduce) {
        this.addOrReduce = addOrReduce; 
    } 


}
