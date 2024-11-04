package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.PageEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_DA5E0BE32CB03F09D1E3DB37B65BA82E {

    public PageEntity page;
    public PageEntity getPage() {
        return page;
    } 

    public void setPage(PageEntity page) {
        this.page = page; 
    } 


}
