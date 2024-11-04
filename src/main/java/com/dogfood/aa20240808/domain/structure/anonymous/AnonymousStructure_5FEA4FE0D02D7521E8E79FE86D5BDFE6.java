package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.GoodsReturnedNoteEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_5FEA4FE0D02D7521E8E79FE86D5BDFE6 {

    public GoodsReturnedNoteEntity goodsReturnedNote;
    public GoodsReturnedNoteEntity getGoodsReturnedNote() {
        return goodsReturnedNote;
    } 

    public void setGoodsReturnedNote(GoodsReturnedNoteEntity goodsReturnedNote) {
        this.goodsReturnedNote = goodsReturnedNote; 
    } 


}
