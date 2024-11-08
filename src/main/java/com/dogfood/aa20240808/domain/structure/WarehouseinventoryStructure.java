package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 
import java.math.BigDecimal; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class WarehouseinventoryStructure {

    @Label("批号id")
    public Long batchNumberId;

    @Label("数量")
    public BigDecimal number;

    @Label("仓库id")
    public Long warehouse;

    public Long getBatchNumberId() {
        return batchNumberId;
    } 

    public void setBatchNumberId(Long batchNumberId) {
        this.batchNumberId = batchNumberId; 
    } 

    public BigDecimal getNumber() {
        return number;
    } 

    public void setNumber(BigDecimal number) {
        this.number = number; 
    } 

    public Long getWarehouse() {
        return warehouse;
    } 

    public void setWarehouse(Long warehouse) {
        this.warehouse = warehouse; 
    } 

}
