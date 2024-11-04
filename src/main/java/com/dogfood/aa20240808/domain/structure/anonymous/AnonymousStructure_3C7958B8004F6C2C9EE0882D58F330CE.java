package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import com.dogfood.aa20240808.domain.entities.InventoryEntity; 
import java.util.List; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_3C7958B8004F6C2C9EE0882D58F330CE {

    public List<InventoryEntity> List = new ArrayList<>();
    public String locationName;
    public List<InventoryEntity> getList() {
        return List;
    } 

    public void setList(List<InventoryEntity> List) {
        this.List = List; 
    } 

    public String getLocationName() {
        return locationName;
    } 

    public void setLocationName(String locationName) {
        this.locationName = locationName; 
    } 


}
