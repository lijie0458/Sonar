package com.dogfood.aa20240808.repository;

public interface ReferenceHandleMapper {
    int deleteReference(String property, Object value);
    Long existReference(String property, Object value);
}
