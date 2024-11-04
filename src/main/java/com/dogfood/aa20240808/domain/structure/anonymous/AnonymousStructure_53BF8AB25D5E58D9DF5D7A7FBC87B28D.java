package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.ModuleTableEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_53BF8AB25D5E58D9DF5D7A7FBC87B28D {

    public ModuleTableEntity moduleTable;
    public ModuleTableEntity getModuleTable() {
        return moduleTable;
    } 

    public void setModuleTable(ModuleTableEntity moduleTable) {
        this.moduleTable = moduleTable; 
    } 


}
