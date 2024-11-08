package com.dogfood.aa20240808.domain.entities; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties; 
import com.dogfood.aa20240808.annotation.Label; 
import javax.validation.constraints.NotNull; 

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class MaterialDetailsEntity {

    @Label("物料编号")
    @NotNull
    public String materialCode;

    @Label("物料名称")
    @NotNull
    public String material_name;

    @Label("物料分类")
    @NotNull
    public Long category_id;

    @Label("规格型号")
    public String specification;

    @Label("单位")
    @NotNull
    public Long unit;

    public String description;

    @NotNull
    public Boolean is_batch_enabled = true;

    public String getMaterialCode() {
        return materialCode;
    } 

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode; 
    } 

    public String getMaterial_name() {
        return material_name;
    } 

    public void setMaterial_name(String material_name) {
        this.material_name = material_name; 
    } 

    public Long getCategory_id() {
        return category_id;
    } 

    public void setCategory_id(Long category_id) {
        this.category_id = category_id; 
    } 

    public String getSpecification() {
        return specification;
    } 

    public void setSpecification(String specification) {
        this.specification = specification; 
    } 

    public Long getUnit() {
        return unit;
    } 

    public void setUnit(Long unit) {
        this.unit = unit; 
    } 

    public String getDescription() {
        return description;
    } 

    public void setDescription(String description) {
        this.description = description; 
    } 

    public Boolean getIs_batch_enabled() {
        return is_batch_enabled;
    } 

    public void setIs_batch_enabled(Boolean is_batch_enabled) {
        this.is_batch_enabled = is_batch_enabled; 
    } 

}
