package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.FunctionTableEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_6A1C3A855CCD635641331B29B571163B {

    public FunctionTableEntity functionTable;
    public FunctionTableEntity getFunctionTable() {
        return functionTable;
    } 

    public void setFunctionTable(FunctionTableEntity functionTable) {
        this.functionTable = functionTable; 
    } 


}
