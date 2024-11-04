package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.CustomerManagementEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_826FFD3E738FEC2EAB499855162B82C1 {

    public CustomerManagementEntity customerManagement;
    public CustomerManagementEntity getCustomerManagement() {
        return customerManagement;
    } 

    public void setCustomerManagement(CustomerManagementEntity customerManagement) {
        this.customerManagement = customerManagement; 
    } 


}
