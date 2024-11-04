package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class BaseResultStructure {

    public Long code;
    public String msg;
    public ConfigResStructure data;
    public Long getCode() {
        return code;
    } 

    public void setCode(Long code) {
        this.code = code; 
    } 

    public String getMsg() {
        return msg;
    } 

    public void setMsg(String msg) {
        this.msg = msg; 
    } 

    public ConfigResStructure getData() {
        return data;
    } 

    public void setData(ConfigResStructure data) {
        this.data = data; 
    } 


}
