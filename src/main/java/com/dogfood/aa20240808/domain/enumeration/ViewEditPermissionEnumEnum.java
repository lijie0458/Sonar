package com.dogfood.aa20240808.domain.enumeration; 

import com.fasterxml.jackson.databind.annotation.JsonDeserialize; 
import com.fasterxml.jackson.annotation.JsonValue; 
import com.fasterxml.jackson.databind.JsonDeserializer; 
import com.fasterxml.jackson.databind.DeserializationContext; 
import com.fasterxml.jackson.core.JsonParser; 

@JsonDeserialize(using = ViewEditPermissionEnumEnum.ViewEditPermissionEnumEnumDeserializer.class)
public enum ViewEditPermissionEnumEnum implements BaseEnum<ViewEditPermissionEnumEnum, String>{

    FIELD_0("0", "本人"),

    FIELD_1("1", "本部门"),

    FIELD_2("2", "本部门及下属"),

    FIELD_3("3", "全部"),; 

    public final String code;

    public final String desc;

ViewEditPermissionEnumEnum(String code, String desc) {
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


    public static class ViewEditPermissionEnumEnumDeserializer extends JsonDeserializer<ViewEditPermissionEnumEnum>{

            @Override
            public ViewEditPermissionEnumEnum deserialize(JsonParser p, DeserializationContext ctxt) {
                String code;
                try {
                    code = p.getValueAsString(); 
                } catch (Exception e) {
                    return null;
                } 
                for (ViewEditPermissionEnumEnum anEnum : ViewEditPermissionEnumEnum.values()) {
                    if (anEnum.getCode().toString().equals(code)) {
                        return anEnum;
                    } 

                } 
                return null;
            } 

    }


}
