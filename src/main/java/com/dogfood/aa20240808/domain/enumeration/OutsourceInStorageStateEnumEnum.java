package com.dogfood.aa20240808.domain.enumeration; 

import com.fasterxml.jackson.databind.annotation.JsonDeserialize; 
import com.fasterxml.jackson.annotation.JsonValue; 
import com.fasterxml.jackson.databind.JsonDeserializer; 
import com.fasterxml.jackson.databind.DeserializationContext; 
import com.fasterxml.jackson.core.JsonParser; 

@JsonDeserialize(using = OutsourceInStorageStateEnumEnum.OutsourceInStorageStateEnumEnumDeserializer.class)
public enum OutsourceInStorageStateEnumEnum implements BaseEnum<OutsourceInStorageStateEnumEnum, String>{

    FIELD_0("0", "保存"),

    FIELD_1("1", "已提交"),

    FIELD_2("2", "已审核"),; 

    public final String code;

    public final String desc;

OutsourceInStorageStateEnumEnum(String code, String desc) {
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


    public static class OutsourceInStorageStateEnumEnumDeserializer extends JsonDeserializer<OutsourceInStorageStateEnumEnum>{

            @Override
            public OutsourceInStorageStateEnumEnum deserialize(JsonParser p, DeserializationContext ctxt) {
                String code;
                try {
                    code = p.getValueAsString(); 
                } catch (Exception e) {
                    return null;
                } 
                for (OutsourceInStorageStateEnumEnum anEnum : OutsourceInStorageStateEnumEnum.values()) {
                    if (anEnum.getCode().toString().equals(code)) {
                        return anEnum;
                    } 

                } 
                return null;
            } 

    }


}
