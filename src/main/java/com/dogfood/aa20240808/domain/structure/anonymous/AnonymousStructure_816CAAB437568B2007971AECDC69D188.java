package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ModuleTableEntity; 
import com.dogfood.aa20240808.domain.entities.PageEntity; 
import com.dogfood.aa20240808.domain.entities.FunctionTableEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_816CAAB437568B2007971AECDC69D188 {

    public FunctionTableEntity functionTable;
    public PageEntity page;
    public ModuleTableEntity moduleTable;
    public FunctionTableEntity getFunctionTable() {
        return functionTable;
    } 

    public void setFunctionTable(FunctionTableEntity functionTable) {
        this.functionTable = functionTable; 
    } 

    public PageEntity getPage() {
        return page;
    } 

    public void setPage(PageEntity page) {
        this.page = page; 
    } 

    public ModuleTableEntity getModuleTable() {
        return moduleTable;
    } 

    public void setModuleTable(ModuleTableEntity moduleTable) {
        this.moduleTable = moduleTable; 
    } 


}
