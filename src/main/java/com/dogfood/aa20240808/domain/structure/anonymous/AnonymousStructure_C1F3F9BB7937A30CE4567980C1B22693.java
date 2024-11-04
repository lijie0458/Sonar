package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteDetailsEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_C1F3F9BB7937A30CE4567980C1B22693 {

    public GoodsReturnedNoteDetailsEntity goodsReturnedNoteDetails;
    public GoodsReturnedNoteDetailsEntity getGoodsReturnedNoteDetails() {
        return goodsReturnedNoteDetails;
    } 

    public void setGoodsReturnedNoteDetails(GoodsReturnedNoteDetailsEntity goodsReturnedNoteDetails) {
        this.goodsReturnedNoteDetails = goodsReturnedNoteDetails; 
    } 


}
