package com.dogfood.aa20240808.web.controller.logics.dto; 


public class UpdateProductInSUnreturnQuantityCustomizeControllerDto {

    public String productReturnCode;
    public Boolean addOrReduce;
    public String getProductReturnCode() {
        return productReturnCode;
    } 

    public void setProductReturnCode(String productReturnCode) {
        this.productReturnCode = productReturnCode; 
    } 

    public Boolean getAddOrReduce() {
        return addOrReduce;
    } 

    public void setAddOrReduce(Boolean addOrReduce) {
        this.addOrReduce = addOrReduce; 
    } 


}
