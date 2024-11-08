package com.dogfood.aa20240808.domain.structure; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.HashMap; 
import java.util.Map; 
import com.dogfood.aa20240808.domain.http.HttpResponse; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class LCAPPostRequestStructure {

    public HttpResponse<String> response = new HttpResponse<>();

    public String status;

    public Map<String, String> requestInfo = new HashMap<>();

    public HttpResponse<String> getResponse() {
        return response;
    } 

    public void setResponse(HttpResponse<String> response) {
        this.response = response; 
    } 

    public String getStatus() {
        return status;
    } 

    public void setStatus(String status) {
        this.status = status; 
    } 

    public Map<String, String> getRequestInfo() {
        return requestInfo;
    } 

    public void setRequestInfo(Map<String, String> requestInfo) {
        this.requestInfo = requestInfo; 
    } 

}
