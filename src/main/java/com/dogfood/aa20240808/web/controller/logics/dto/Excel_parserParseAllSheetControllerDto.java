package com.dogfood.aa20240808.web.controller.logics.dto; 

import com.fasterxml.jackson.annotation.JsonProperty; 
import com.netease.lowcode.extension.excel.dto.ExcelParseRect; 
import com.dogfood.aa20240808.service.dto.nasl.TypeArgumentsDto; 
import java.util.Map; 

public class Excel_parserParseAllSheetControllerDto {

    public ExcelParseRect rect;

    public String path;

    public Long row;

    public Map<String, String> columnFieldMap;

    @JsonProperty("__typeArguments")
    public TypeArgumentsDto[] typeArguments;

    public ExcelParseRect getRect() {
        return rect;
    } 

    public void setRect(ExcelParseRect rect) {
        this.rect = rect; 
    } 

    public String getPath() {
        return path;
    } 

    public void setPath(String path) {
        this.path = path; 
    } 

    public Long getRow() {
        return row;
    } 

    public void setRow(Long row) {
        this.row = row; 
    } 

    public Map<String, String> getColumnFieldMap() {
        return columnFieldMap;
    } 

    public void setColumnFieldMap(Map<String, String> columnFieldMap) {
        this.columnFieldMap = columnFieldMap; 
    } 

    @JsonProperty("__typeArguments")
    public TypeArgumentsDto[] getTypeArguments() {
        return typeArguments;
    } 

    public void setTypeArguments(TypeArgumentsDto[] typeArguments) {
        this.typeArguments = typeArguments; 
    } 

    public Class getTypeArgumentClass(int index) {
        if (null == typeArguments) {
            return null;
        } 

        if (typeArguments.length <= index || null == typeArguments[index]) {
            return null;
        } 

        return typeArguments[index].toJavaClass();
    } 

}
