package com.dogfood.aa20240808.domain.enumeration;

public interface BaseEnum <E extends  Enum<E>, T>{
    T getCode();

    String getDesc();
}