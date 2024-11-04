package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import com.dogfood.aa20240808.annotation.Label; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class MultipleTabStructure {

    @Label("页面名称")
    public String path;
    @Label("页面地址")
    public String fullPath;
    public String getPath() {
        return path;
    } 

    public void setPath(String path) {
        this.path = path; 
    } 

    public String getFullPath() {
        return fullPath;
    } 

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath; 
    } 


}
