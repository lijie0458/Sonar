package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.DepartmentEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_3421ED028B001C489CD794910A15D0C0 {

    public DepartmentEntity department;
    public DepartmentEntity getDepartment() {
        return department;
    } 

    public void setDepartment(DepartmentEntity department) {
        this.department = department; 
    } 


}
