package com.dogfood.aa20240808.domain.structure.anonymous; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.domain.entities.MaterialDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.ReceivingNotificationsEntity; 
import com.dogfood.aa20240808.domain.entities.ReceivingDetailsEntity; 
import com.dogfood.aa20240808.domain.entities.MeasuringUnitEntity; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class AnonymousStructure_501750474D4E21FDB050ADEB3D05BD6F {

    public ReceivingNotificationsEntity receivingNotifications;
    public ReceivingDetailsEntity receivingDetails;
    public MaterialDetailsEntity materialDetails;
    public MeasuringUnitEntity measuringUnit;
    public ReceivingNotificationsEntity getReceivingNotifications() {
        return receivingNotifications;
    } 

    public void setReceivingNotifications(ReceivingNotificationsEntity receivingNotifications) {
        this.receivingNotifications = receivingNotifications; 
    } 

    public ReceivingDetailsEntity getReceivingDetails() {
        return receivingDetails;
    } 

    public void setReceivingDetails(ReceivingDetailsEntity receivingDetails) {
        this.receivingDetails = receivingDetails; 
    } 

    public MaterialDetailsEntity getMaterialDetails() {
        return materialDetails;
    } 

    public void setMaterialDetails(MaterialDetailsEntity materialDetails) {
        this.materialDetails = materialDetails; 
    } 

    public MeasuringUnitEntity getMeasuringUnit() {
        return measuringUnit;
    } 

    public void setMeasuringUnit(MeasuringUnitEntity measuringUnit) {
        this.measuringUnit = measuringUnit; 
    } 


}
