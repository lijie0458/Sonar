package com.dogfood.aa20240808.web.controller.logics.dto; 


public class GetResOriginalDateOrSelectedDateByPerIdCustomizeControllerDto {

    public Long perId;
    public Boolean OriginalOrSelected;
    public Long getPerId() {
        return perId;
    } 

    public void setPerId(Long perId) {
        this.perId = perId; 
    } 

    public Boolean getOriginalOrSelected() {
        return OriginalOrSelected;
    } 

    public void setOriginalOrSelected(Boolean OriginalOrSelected) {
        this.OriginalOrSelected = OriginalOrSelected; 
    } 


}
