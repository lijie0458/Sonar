package com.dogfood.aa20240808.domain.enumeration; 

import com.fasterxml.jackson.databind.annotation.JsonDeserialize; 
import com.fasterxml.jackson.annotation.JsonValue; 
import com.fasterxml.jackson.databind.JsonDeserializer; 
import com.fasterxml.jackson.databind.DeserializationContext; 
import com.fasterxml.jackson.core.JsonParser; 

@JsonDeserialize(using = UserSourceEnum1Enum.UserSourceEnum1EnumDeserializer.class)
public enum UserSourceEnum1Enum implements BaseEnum<UserSourceEnum1Enum, String>{

    FIELD_Normal("Normal", "普通登录"),

    FIELD_Netease("Netease", "OpenId登录"),

    FIELD_wework("wework", "企业微信"),

    FIELD_feishu("feishu", "飞书"),

    FIELD_dingtalk("dingtalk", "钉钉"),

    FIELD_OAuth("OAuth", "OAuth2.0登录"),

    FIELD_CAS("CAS", "cas登录"),

    FIELD_SSO("SSO", "SSO登录"),

    FIELD_wechat("wechat", "微信"),; 

    public final String code;

    public final String desc;

UserSourceEnum1Enum(String code, String desc) {
        this.code = code; 
        this.desc = desc; 
    } 

    @JsonValue
    public String getJsonValue() {
        return this.code;
    } 

    @Override
    public String getCode() {
        return code;
    } 

    @Override
    public String getDesc() {
        return desc;
    } 


    public static class UserSourceEnum1EnumDeserializer extends JsonDeserializer<UserSourceEnum1Enum>{

            @Override
            public UserSourceEnum1Enum deserialize(JsonParser p, DeserializationContext ctxt) {
                String code;
                try {
                    code = p.getValueAsString(); 
                } catch (Exception e) {
                    return null;
                } 
                for (UserSourceEnum1Enum anEnum : UserSourceEnum1Enum.values()) {
                    if (anEnum.getCode().toString().equals(code)) {
                        return anEnum;
                    } 

                } 
                return null;
            } 

    }


}
