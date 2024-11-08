package com.dogfood.aa20240808.domain.enumeration; 

import com.fasterxml.jackson.databind.annotation.JsonDeserialize; 
import com.fasterxml.jackson.annotation.JsonValue; 
import com.fasterxml.jackson.databind.JsonDeserializer; 
import com.fasterxml.jackson.databind.DeserializationContext; 
import com.fasterxml.jackson.core.JsonParser; 

@JsonDeserialize(using = DistinctionEnumEnum.DistinctionEnumEnumDeserializer.class)
public enum DistinctionEnumEnum implements BaseEnum<DistinctionEnumEnum, String>{

    FIELD_SEORD("SEORD", "销售订单"),

    FIELD_SEOUT("SEOUT", "发货通知单"),

    FIELD_XOUT("XOUT", "销售出库"),

    FIELD_SRE("SRE", "退货"),

    FIELD_DRAW("DRAW", "生产领料"),

    FIELD_SOUTT("SOUTT", "生产退料"),

    FIELD_JOUT("JOUT", "委外加工出库"),

    FIELD_JOUTT("JOUTT", "委外加工退库"),

    FIELD_QOUT("QOUT", "其他出库"),

    FIELD_QOUTT("QOUTT", "其他出库退货"),

    FIELD_JIN("JIN", "委外加工入库"),

    FIELD_JINT("JINT", "委外加工入库退回"),; 

    public final String code;

    public final String desc;

DistinctionEnumEnum(String code, String desc) {
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


    public static class DistinctionEnumEnumDeserializer extends JsonDeserializer<DistinctionEnumEnum>{

            @Override
            public DistinctionEnumEnum deserialize(JsonParser p, DeserializationContext ctxt) {
                String code;
                try {
                    code = p.getValueAsString(); 
                } catch (Exception e) {
                    return null;
                } 
                for (DistinctionEnumEnum anEnum : DistinctionEnumEnum.values()) {
                    if (anEnum.getCode().toString().equals(code)) {
                        return anEnum;
                    } 

                } 
                return null;
            } 

    }


}
