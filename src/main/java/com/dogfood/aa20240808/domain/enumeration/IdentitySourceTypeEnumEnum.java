package com.dogfood.aa20240808.domain.enumeration; 

import com.fasterxml.jackson.databind.annotation.JsonDeserialize; 
import com.fasterxml.jackson.annotation.JsonValue; 
import com.fasterxml.jackson.databind.JsonDeserializer; 
import com.fasterxml.jackson.databind.DeserializationContext; 
import com.fasterxml.jackson.core.JsonParser; 

@JsonDeserialize(using = IdentitySourceTypeEnumEnum.IdentitySourceTypeEnumEnumDeserializer.class)
public enum IdentitySourceTypeEnumEnum implements BaseEnum<IdentitySourceTypeEnumEnum, String>{

    FIELD_Society("Society", "社会身份源"),

    FIELD_Enterprise("Enterprise", "企业身份源"),; 

    public final String code;
    public final String desc;
IdentitySourceTypeEnumEnum(String code, String desc) {
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



    public static class IdentitySourceTypeEnumEnumDeserializer extends JsonDeserializer<IdentitySourceTypeEnumEnum>{

            @Override
            public IdentitySourceTypeEnumEnum deserialize(JsonParser p, DeserializationContext ctxt) {
                String code;
                try {
                    code = p.getValueAsString(); 
                } catch (Exception e) {
                    return null;
                } 
                for (IdentitySourceTypeEnumEnum anEnum : IdentitySourceTypeEnumEnum.values()) {
                    if (anEnum.getCode().toString().equals(code)) {
                        return anEnum;
                    } 

                } 
                return null;
            } 


    }


}
