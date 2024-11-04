package com.dogfood.aa20240808.repository.handler;

import com.fasterxml.jackson.core.type.TypeReference;
import java.math.BigDecimal;
import java.util.UUID;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class MapTypeHandler_1 extends BaseMapTypeHandler {

    @Override
    protected TypeReference getTypeReference() {
        return new TypeReference<Map<String, String>>() {
        };
    }
}