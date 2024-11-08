package com.dogfood.aa20240808.domain.enumeration.nasl;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;

/**
 * 基础类型枚举
 *
 * @author sys
 */
public enum NaslPrimitiveTypeNameEnums {
    BOOLEAN("Boolean", Boolean.class.getCanonicalName(), "布尔类型"),
    INTEGER("Integer", Integer.class.getCanonicalName(),  "整型"),
    LONG("Long", Long.class.getCanonicalName(), "长整型"),
    DOUBLE("Double", Double.class.getCanonicalName(), "小数"),
    STRING("String", String.class.getCanonicalName(), "字符串"),
    TEXT("Text", String.class.getCanonicalName(), "大文本"),
    BINARY("Binary", Byte[].class.getCanonicalName(), "二进制"),
    DATE("Date", LocalDate.class.getCanonicalName(), "日期"),
    TIME("Time", LocalTime.class.getCanonicalName(), "时间"),
    DATETIME("DateTime", ZonedDateTime.class.getCanonicalName(), "时间日期"),
    EMAIL("Email", String.class.getCanonicalName(), "邮箱类型"),
    BIGDECIMAL("Decimal", BigDecimal.class.getCanonicalName(), "精确小数"),
    ;

    public final String code;
    public final String desc;
    public final String javaType;

    NaslPrimitiveTypeNameEnums(String code, String javaType, String desc) {
        this.code = code;
        this.javaType = javaType;
        this.desc = desc;
    }

    public static final NaslPrimitiveTypeNameEnums of(String code) {
        for (NaslPrimitiveTypeNameEnums naslTypeNamespaceEnums : NaslPrimitiveTypeNameEnums.values()) {
            if (naslTypeNamespaceEnums.code.equals(code)) {
                return naslTypeNamespaceEnums;
            }
        }

        return null;
    }
}
