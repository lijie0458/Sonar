package com.dogfood.aa20240808.domain.enumeration; 

import com.fasterxml.jackson.databind.annotation.JsonDeserialize; 
import com.fasterxml.jackson.annotation.JsonValue; 
import com.fasterxml.jackson.databind.JsonDeserializer; 
import com.fasterxml.jackson.databind.DeserializationContext; 
import com.fasterxml.jackson.core.JsonParser; 

@JsonDeserialize(using = ExecutionStatusEnum.ExecutionStatusEnumDeserializer.class)
public enum ExecutionStatusEnum implements BaseEnum<ExecutionStatusEnum, String>{

    FIELD_0("0", "执行中"),

    FIELD_1("1", "已关闭"),; 

    public final String code;
    public final String desc;
ExecutionStatusEnum(String code, String desc) {
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



    public static class ExecutionStatusEnumDeserializer extends JsonDeserializer<ExecutionStatusEnum>{

            @Override
            public ExecutionStatusEnum deserialize(JsonParser p, DeserializationContext ctxt) {
                String code;
                try {
                    code = p.getValueAsString(); 
                } catch (Exception e) {
                    return null;
                } 
                for (ExecutionStatusEnum anEnum : ExecutionStatusEnum.values()) {
                    if (anEnum.getCode().toString().equals(code)) {
                        return anEnum;
                    } 

                } 
                return null;
            } 


    }


}
