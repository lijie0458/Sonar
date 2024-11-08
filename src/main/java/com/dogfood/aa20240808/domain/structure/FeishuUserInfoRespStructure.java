package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class FeishuUserInfoRespStructure {

    @Label("错误码，非 0 表示失败")
    public Long code;

    @Label("错误描述")
    public String msg;

    public FeishuUserInfoDataStructure data;

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

    public FeishuUserInfoDataStructure getData() {
        return data;
    } 

    public void setData(FeishuUserInfoDataStructure data) {
        this.data = data; 
    } 

}
