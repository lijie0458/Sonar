package com.dogfood.aa20240808.domain; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import java.io.Serializable; 
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Objects; 
import com.netease.lowcode.auth.domain.LCAPUser; 
import javax.validation.constraints.NotNull; 
import com.dogfood.aa20240808.domain.http.HttpRequest; 
import com.dogfood.aa20240808.domain.http.HttpResponse; 

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY,getterVisibility = JsonAutoDetect.Visibility.NONE)
public class SessionVariables implements Serializable{

    @NotNull
    public HttpRequest<String> httpRequest = new HttpRequest<>();

    @NotNull
    public HttpResponse<String> httpResponse = new HttpResponse<>();

    @NotNull
    public LCAPUser currentUser = new LCAPUser();

    @NotNull
    public List<String> dataViewAuthorityUserNameList = new ArrayList<>();

    private <Source, Target> Boolean equals(Source source, Target target) {
        return Objects.equals(source, target);
    } 

}
