package com.dogfood.aa20240808.domain.enumeration; 

import com.fasterxml.jackson.databind.annotation.JsonDeserialize; 
import com.fasterxml.jackson.annotation.JsonValue; 
import com.fasterxml.jackson.databind.JsonDeserializer; 
import com.fasterxml.jackson.databind.DeserializationContext; 
import com.fasterxml.jackson.core.JsonParser; 

@JsonDeserialize(using = EncryptAndDecryptEnumEnum.EncryptAndDecryptEnumEnumDeserializer.class)
public enum EncryptAndDecryptEnumEnum implements BaseEnum<EncryptAndDecryptEnumEnum, String>{

    FIELD_Plain("Plain", "明文模式"),

    FIELD_Compatible("Compatible", "兼容模式"),

    FIELD_Saft("Saft", "安全模式（推荐）"),; 

    public final String code;
    public final String desc;
EncryptAndDecryptEnumEnum(String code, String desc) {
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



    public static class EncryptAndDecryptEnumEnumDeserializer extends JsonDeserializer<EncryptAndDecryptEnumEnum>{

            @Override
            public EncryptAndDecryptEnumEnum deserialize(JsonParser p, DeserializationContext ctxt) {
                String code;
                try {
                    code = p.getValueAsString(); 
                } catch (Exception e) {
                    return null;
                } 
                for (EncryptAndDecryptEnumEnum anEnum : EncryptAndDecryptEnumEnum.values()) {
                    if (anEnum.getCode().toString().equals(code)) {
                        return anEnum;
                    } 

                } 
                return null;
            } 


    }


}
