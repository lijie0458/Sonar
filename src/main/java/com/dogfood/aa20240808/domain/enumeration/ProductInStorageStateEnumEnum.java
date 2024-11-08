package com.dogfood.aa20240808.domain.enumeration; 

import com.fasterxml.jackson.databind.annotation.JsonDeserialize; 
import com.fasterxml.jackson.annotation.JsonValue; 
import com.fasterxml.jackson.databind.JsonDeserializer; 
import com.fasterxml.jackson.databind.DeserializationContext; 
import com.fasterxml.jackson.core.JsonParser; 

@JsonDeserialize(using = ProductInStorageStateEnumEnum.ProductInStorageStateEnumEnumDeserializer.class)
public enum ProductInStorageStateEnumEnum implements BaseEnum<ProductInStorageStateEnumEnum, String>{

    FIELD_0("0", "保存"),

    FIELD_1("1", "已提交"),

    FIELD_2("2", "已审批"),; 

    public final String code;

    public final String desc;

ProductInStorageStateEnumEnum(String code, String desc) {
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


    public static class ProductInStorageStateEnumEnumDeserializer extends JsonDeserializer<ProductInStorageStateEnumEnum>{

            @Override
            public ProductInStorageStateEnumEnum deserialize(JsonParser p, DeserializationContext ctxt) {
                String code;
                try {
                    code = p.getValueAsString(); 
                } catch (Exception e) {
                    return null;
                } 
                for (ProductInStorageStateEnumEnum anEnum : ProductInStorageStateEnumEnum.values()) {
                    if (anEnum.getCode().toString().equals(code)) {
                        return anEnum;
                    } 

                } 
                return null;
            } 

    }


}
