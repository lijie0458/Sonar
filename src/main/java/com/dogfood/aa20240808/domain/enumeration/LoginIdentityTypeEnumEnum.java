package com.dogfood.aa20240808.domain.enumeration; 

import com.fasterxml.jackson.databind.annotation.JsonDeserialize; 
import com.fasterxml.jackson.annotation.JsonValue; 
import com.fasterxml.jackson.databind.JsonDeserializer; 
import com.fasterxml.jackson.databind.DeserializationContext; 
import com.fasterxml.jackson.core.JsonParser; 

@JsonDeserialize(using = LoginIdentityTypeEnumEnum.LoginIdentityTypeEnumEnumDeserializer.class)
public enum LoginIdentityTypeEnumEnum implements BaseEnum<LoginIdentityTypeEnumEnum, String>{

    FIELD_Single("Single", "单身份源"),

    FIELD_Multiple("Multiple", "多身份源"),; 

    public final String code;
    public final String desc;
LoginIdentityTypeEnumEnum(String code, String desc) {
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



    public static class LoginIdentityTypeEnumEnumDeserializer extends JsonDeserializer<LoginIdentityTypeEnumEnum>{

            @Override
            public LoginIdentityTypeEnumEnum deserialize(JsonParser p, DeserializationContext ctxt) {
                String code;
                try {
                    code = p.getValueAsString(); 
                } catch (Exception e) {
                    return null;
                } 
                for (LoginIdentityTypeEnumEnum anEnum : LoginIdentityTypeEnumEnum.values()) {
                    if (anEnum.getCode().toString().equals(code)) {
                        return anEnum;
                    } 

                } 
                return null;
            } 


    }


}
